package com.tebyan.cellular_automotan_cave.grid;

import java.awt.Color;
import java.awt.Graphics2D;

public class Cell {
	public CellType cellType;
	public int x,y;
	
	public Cell(int x,int y,CellType cellType) {
		this.x=x;
		this.y=y;
		this.cellType=cellType;
	}
	public void fillCell(Graphics2D g,int cellSize) {
		g.setColor(cellType==CellType.WALKABLE?Color.white:cellType==CellType.UNWALKABLE?Color.black:Color.gray);
		g.fillRect(x*cellSize, y*cellSize, cellSize, cellSize);
	}
	public enum CellType{
		WALKABLE,UNWALKABLE
	}
}
