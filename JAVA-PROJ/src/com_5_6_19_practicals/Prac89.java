package com_5_6_19_practicals;
class Rect
{
	double Area(double a,double b)
	{
		return a*b;
	}
}
public class Prac89 extends Rect{
	void Area(double a,double b,double c)
	{
		System.out.println(Area(a, b));
		System.out.println(Area(a,b)*c);
	}
	public static void main(String[] args) {
	Prac89 ob=new Prac89();
	ob.Area(5,5,5);
	
	}

}
