package Object;

import java.awt.Color;
import java.awt.Graphics;

import util.Constant;

public class Bullet extends GameObject{
	double degree;
	public Bullet() {
		degree=Math.random()*Math.PI*2;
		x=Constant.getWinwidth()/2;
		y=Constant.getWinhight()/2;
		width=10;
		height=10;
		speed=3;
	}

	public void draw(Graphics g) {
		Color color=g.getColor();
		g.setColor(color.yellow);
		g.fillOval((int)x, (int)y, width, height);
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
		if(y>Constant.getWinhight()-height||y<30) {
			degree=-degree;
		}
		if(x<0||x>Constant.getWinwidth()-width) {
			degree=Math.PI-degree;
		}
		
		g.setColor(color);
		
		
		
	}
}
