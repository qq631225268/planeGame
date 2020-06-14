package Object;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Plane extends GameObject{
	
	private boolean left,right,up,down;
	private boolean isLive=true;
	
	
	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}

	public Plane(String img, double x, double y,double speed) {
	//GameObject(String img, double x, double y,double speed )
		super(img,x,y,speed);	
	}
	
	public void draw(Graphics g) {
		
		if(isLive) 
		{
			g.drawImage(img, (int)x, (int)y, null);
			move();
		}
	}

	public void addDirection(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left=true;
			break;
		case KeyEvent.VK_RIGHT:
			right=true;
			break;
		case KeyEvent.VK_UP:
			up=true;
			break;
		case KeyEvent.VK_DOWN:
			down=true;
			break;
		default:
			break;
		}
		
	}
	
	public void move() {
		if (left) {
			x-=speed;			
		}
		if (right) {
			x+=speed;			
		}
		if (up) {
			y-=speed;			
		}
		if (down) {
			y+=speed;			
		}
	}
	
	

	public void minusDirection(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left=false;
			break;
		case KeyEvent.VK_RIGHT:
			right=false;
			break;
		case KeyEvent.VK_UP:
			up=false;
			break;
		case KeyEvent.VK_DOWN:
			down=false;
			break;
		default:
			break;
		}
		
		
	}
	

}
