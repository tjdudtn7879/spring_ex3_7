package com.lgy.springex_3_7;

public class MyRectangle {
	Rectangle rectangle;
	int x,y;
	
	public void pc() {
		rectangle.process(x, y);
	}
	
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
