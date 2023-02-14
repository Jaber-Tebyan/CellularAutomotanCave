package com.tebyan.cellular_automotan_cave.grid;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Random;

import com.tebyan.cellular_automotan_cave.drawables.Drawable;
import com.tebyan.cellular_automotan_cave.grid.Cell.CellType;

public class Grid implements Drawable{

	public int cellSize;
	public Cell[][] map;
	public int size;
	public BufferedImage image;
	public int x,y;
	
	public void setPos(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public Grid(int size,int mapSize) {
		map=new Cell[mapSize][mapSize];
		this.size=size;
		cellSize=size/mapSize;
		System.out.println(cellSize);
		image=new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		init();
	}
	private void init() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j]=new Cell(j, i, new Random().nextInt(2)==0?CellType.WALKABLE:CellType.UNWALKABLE);
			}
		}
		drawOnImage();
	}
	@Override
	public void draw(Graphics2D g) {
		
		g.drawImage(image, x, y,  null);
	}
	public void drawOnImage() {
		Graphics2D g=(Graphics2D) image.getGraphics();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j].fillCell(g,cellSize);
			}
		}
	}
	

}
