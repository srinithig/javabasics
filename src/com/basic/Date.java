package com.basic;

public class Date {
	int Day;
	int Month;
	int Year;
	public Date() {
	}
	public Date(int day,int month,int year) {
		this.Day=day;
		this.Year=year;
		this.Month=month;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public void displayDate() {
		System.out.println(Day+"/"+Month+"/"+Year);
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public static void main(String[]args)
	{
		Date d1=new Date();
		d1.setDay(19);
		d1.setMonth(4);
		d1.setYear(1998);
		d1.displayDate();
		Date d2=new Date(10,3,1997);
		d2.displayDate();
		
				
		
		
		
	}

}
