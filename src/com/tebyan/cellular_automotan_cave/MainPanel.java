package com.tebyan.cellular_automotan_cave;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.tebyan.cellular_automotan_cave.drawables.Drawable;

public class MainPanel extends JPanel{

	public List<Drawable> drawables;
	public Color backgroundColor;
	public float scale=1;
	public MainPanel() {
		drawables=new ArrayList<>();
		addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				int scrollAmount=e.getUnitsToScroll();
				scale-=scrollAmount/40.0;
				if(scale<=0)scale=.1f;
				
				repaint();
				
			}
		});
		
	}
	public MainPanel(Color backgroundColor) {
		drawables=new ArrayList<>();
		this.backgroundColor=backgroundColor;
	}
	
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	
	@Override
	public void paintComponent(Graphics g1) {
		// TODO Auto-generated method stub
		super.paintComponents(g1);
		Graphics2D g=(Graphics2D)g1;
		g.translate(getWidth()/2, getHeight()/2);
		g.scale(scale, scale);
		g.translate(-getWidth()/2, -getHeight()/2);
		g.setColor(backgroundColor);
		g.fillRect(0, 0, getParent().getWidth(), getParent().getHeight());
		for (Drawable drawable : drawables) {
			drawable.draw(g);
		}
	}
}
