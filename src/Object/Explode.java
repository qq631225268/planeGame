package Object;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import util.GameUtil;

public class Explode {
	double x,y;
	static Image[] imgs=new Image[16];
	static {
		for(int i=0;i<16;i++){
			imgs[i]=GameUtil.getImage("images/explode/e"+
		                              (i+1)+".gif");
			imgs[i].getWidth(null);
			imgs[i].getHeight(null);
		}
	}
	int count;
	public void draw(Graphics g) {
		if(count<=15) {
			g.drawImage(imgs[count], (int)x, (int)y, null);
			count++;
		}
	}
	public Explode(double x,double y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
}
