package com_5_6_19_practicals;
enum day
{	
	mon(10),tue(11),wed(12);
	private int date;
	day(int d)
	{
		date=d;
	}
	int get()
	{
		return date;
	}
	
}
public class Prac81 {
	

	public static void main(String[] args) {
	for (day ob:day.values())
	{
			System.out.println(ob);
		System.out.println(ob.get()
				);
		
	}

}
}
