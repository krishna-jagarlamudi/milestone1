package com.wipro.classesandobjects;

public class Example1 {
	double height,width,breadth;
	void setHeight(double h) {
		height=h;
		
	}
	void setBreadth(double b)
	{
		breadth=b;
	}
	void setWidth(double w)
	{
		width=w;
	}
	
   void getvolume()
	{
		System.out.println(height*breadth*width);
	}
}

