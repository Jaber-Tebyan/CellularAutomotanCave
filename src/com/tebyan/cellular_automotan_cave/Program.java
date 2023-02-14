package com.tebyan.cellular_automotan_cave;

import java.awt.Color;

import com.tebyan.cellular_automotan_cave.grid.Grid;

public class Program {
	public static void main(String[] args) {
		MainFrame frame=new MainFrame(500, 500, false);
		MainPanel panel=new MainPanel();
		Grid grid=new Grid(250,100);
		grid.setPos(500/2-grid.size/2,500/2-grid.size/2);
		
		panel.drawables.add(grid);
		frame.add(panel);
		frame.setVisible(true);
	}
}
