package Object;

import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;

import util.GameUtil;

public class BackGround extends GameObject{

	/**
	 * 1）构造函数也是要对成员变量赋值的，空的构造方法什么也不干，
	 * 在这里犯了一个超级低级的错误
	 * 2）类里面只有属性和方法，不能有对方法的调用，
	 * 这是跟面向过程的根本区别
	 * @param path
	 */
	public BackGround (String path){
		super(path);
		
	}
	  public void draw(Graphics g) {
		  g.drawImage(getBg(), 0, 0,null);
	  }	
  
	  public void draw(Graphics g,int x,int y) {
		  //System.out.println("i am background");
		  g.drawImage(getBg(), x, y,null);
	  }
  
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Image getBg() {
		return img;
	}
	public void setBg(Image bg) {
		this.img = img;
	}	

}
