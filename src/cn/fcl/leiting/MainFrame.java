package cn.fcl.leiting;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.ArrayList;

import javax.xml.crypto.Data;

import Object.BackGround;
import Object.Bullet;
import Object.Explode;
import Object.Plane;
import util.Constant;

public class MainFrame extends Frame{
	BackGround bg=new BackGround("images/bg.jpg");
	Plane p=new Plane("images/plane.png", 50, 50, 3);
	ArrayList bulletList=new ArrayList();
	Explode bao;
	long startTime;
	long EndTime;
	/**
	 * ���ڵ�½�ĳ���
	 * 
	 */
	public void lanchFrame() {
		setSize(Constant.getWinwidth(),Constant.getWinhight());
		setLocation(50, 50);
		setVisible(true);
		addWindowListener(
						new WindowAdapter() {
							public void windowClosing(WindowEvent e)
								{
								System.exit(0);
								};
							}
						);
		addKeyListener(new KeyMonitor());
		for (int i = 0; i <10; i++) {
			Bullet bullet=new Bullet();
			bulletList.add(bullet);

		}
		startTime=System.currentTimeMillis();
		new ThreadPaint().start();
	}
	
	/**
	 * ���̼������ڲ���
	 */
	class  KeyMonitor extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("����"+e.getKeyCode());
			p.addDirection(e);
		}
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("����"+e.getKeyCode());
			p.minusDirection(e);
		}
		
	}
	
	
	/**
	 * �����paint������һ�����ӣ����ඨ����������
	 */
	public void paint(Graphics g) {		
		bg.draw(g, 0, 0);
		p.draw(g);
		for (int i = 0; i < bulletList.size(); i++) {
			Bullet b=(Bullet)bulletList.get(i);
			b.draw(g);
			boolean peng=b.getRectangle().intersects(p.getRectangle());
			if(peng) {
				EndTime=System.currentTimeMillis();
				p.setLive(false);
				if(bao==null) {
					bao=new Explode(p.getX(), p.getY());
				}
				bao.draw(g);
				break;
			}
			
		}
		
		if(!p.isLive()) {
			int period=(int)((EndTime-startTime)/1000);
			printInfo(g, "ʱ�䣺"+period+"��", 20, 120, 260, Color.WHITE);
			switch (period /20) {
			case 0:
			case 1:
			    printInfo(g, "����", 50,100, 200, Color.WHITE);
				break;

			case 2:
			    printInfo(g, "һ��", 50,100, 200, Color.WHITE);
				break;
			case 3:
			    printInfo(g, "����", 50,100, 200, Color.WHITE);
				break;
			case 4:
			    printInfo(g, "��ʦ", 50,100, 200, Color.WHITE);
				break;
			default:
			    printInfo(g, "�����ܵ�", 50,100, 200, Color.WHITE);
				break;
			}
			printInfo(g, "������100",10, 50, 50, Color.YELLOW);
			
		}
		
	}
	
	/**
	 * 
	 */
	public void printInfo(Graphics g,String str,int size,
							int x,int y,Color color) {
		Color c=g.getColor();
		g.setColor(color);
		Font f=new Font("����",Font.BOLD,size);
		g.setFont(f);
		g.drawString(str, x, y);
		g.setColor(c);
	}
	/**
	 * 
	 * @author Tristan
	 *
	 */
	public class ThreadPaint extends Thread{
		public void run() {
			while(true) {
				repaint();
				try {
					sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 
					
	}
}


