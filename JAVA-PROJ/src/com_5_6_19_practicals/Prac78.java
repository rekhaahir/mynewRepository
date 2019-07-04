package com_5_6_19_practicals;

public class Prac78 {
	void showarray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==3)
			{
				continue;
			}
			System.out.println(a[i]);
			
		}
	}
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4 };
		Prac78 ob=new Prac78();
		ob.showarray(x);
		System.out.println("continue from loop");
	}

}
