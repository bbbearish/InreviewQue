package com.test.circle2;

public class Rectangle {
	
	private float lenth =1.0f;
	private float width =1.0f;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(float lenth, float width) {
		super();
		this.lenth = lenth;
		this.width = width;
	}

	public float getLenth() {
		return lenth;
	}

	public void setLenth(float lenth) {
		this.lenth = lenth;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [lenth=" + lenth + ", width=" + width + "]";
	}
	public double getArea(){
		return lenth*width;
	}
	public double getPerimeter(){
		return lenth*2 + width*2;
		
	}

}
