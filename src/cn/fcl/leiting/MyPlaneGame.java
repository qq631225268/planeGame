package cn.fcl.leiting;

import java.awt.Frame;


/**
 * ͨ��ʵ������MyPlaneGame����theApp����
 * MyPlaneGame��main��main ��ʵ����MainFrame����theMainFrame
 * �ﵽ���������Ŀ�ģ�ģ��MFC���ô��Ǽ���Ŀ��
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

