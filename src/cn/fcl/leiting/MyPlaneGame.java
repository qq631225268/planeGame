package cn.fcl.leiting;

import java.awt.Frame;


/**
 * 通过实例化的MyPlaneGame对像theApp调用
 * MyPlaneGame的main，main 再实例化MainFrame对像theMainFrame
 * 达到启动程序的目的，模仿MFC，好处是简化项目类
 * @author Tristan
 *
 */

public class MyPlaneGame {

	final static MyPlaneGame theApp =new MyPlaneGame();	
	public static void main(String[] s) {
		theApp.mainFrame();
	}
	
	public void mainFrame()  {
		System.out.println("mainFrame started");
		MainFrame theMainFrame=new MainFrame();
		theMainFrame.lanchFrame();		
	}

}

