package Object;

import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;

import util.GameUtil;

public class BackGround extends GameObject{

	/**
	 * 1�����캯��Ҳ��Ҫ�Գ�Ա������ֵ�ģ��յĹ��췽��ʲôҲ���ɣ�
	 * �����ﷸ��һ�������ͼ��Ĵ���
	 * 2��������ֻ�����Ժͷ����������жԷ����ĵ��ã�
	 * ���Ǹ�������̵ĸ�������
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
