package com.tebyan.cellular_automotan_cave;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;



public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame(int width,int height,boolean fullscreen) {
		setSize(new Dimension(width,height));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension monitorDimension=Toolkit.getDefaultToolkit().getScreenSize();
		
		if(fullscreen) {
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			setUndecorated(true);
		}
		setLocation(monitorDimension.width/2-width/2,monitorDimension.height/2-height/2);
		
		
	}
}
