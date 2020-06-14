package Object;

import java.awt.Image;
import java.awt.Rectangle;

import util.GameUtil;

public class GameObject {
	  Image img;
	 double x,y;
	 int width,height;
	 double speed;
 
 public Rectangle getRectangle() {
	 return new Rectangle((int)x,(int)y,width,height);
 }
 
 
 public GameObject(String img) {
		super();
		this.img =GameUtil.getImage(img);
		this.width = this.img.getWidth(null);
		this.height = this.img.getHeight(null);
	}
 
 
 public GameObject(Image img) {
		super();
		this.img =img;
		this.width = this.img.getWidth(null);
		this.height = this.img.getHeight(null);
	}
 
 
 
 public GameObject(String img, double x, double y) {
		this(img);
		this.x = x;
		this.y = y;
	}
 
 public GameObject(Image img, double x, double y,double speed) {
		this(img);
		this.x = x;
		this.y = y;
		this.speed=speed;
	}
 
 
 public GameObject(String img, double x, double y,double speed ) {
		this(img);
		this.x = x;
		this.y = y;
		this.speed=speed;
	}




public double getX() {
	return x;
}


public void setX(double x) {
	this.x = x;
}


public double getY() {
	return y;
}


public void setY(double y) {
	this.y = y;
}


public GameObject() {}
 
}
