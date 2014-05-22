import java.util.Scanner;


public class WhatTime {

	/*public static void main(String[] args) {
		
		System.out.println("Enter the time in seconds");
		Scanner input = null;
		
		try{
			input = new Scanner(System.in);
			int time = input.nextInt();
			
			time (time);
			int seconds = 0;
			int temp = 0;
			int minutes = 0 ;
			int hours = 0;
			
			seconds = time%60;
			temp = time/60;
			
			System.out.println("Seconds part is "+seconds);
			minutes = temp%60;
			System.out.println("Minutes part is "+minutes);
			temp = temp/60;
			System.out.println("temp part is "+temp);
			hours = temp%24;
			
			
			
			System.out.println("Hours part is "+hours);
			
			
		}
		
		finally {
			if(input!=null)
			input.close();
			}
		
	}*/
	public static String whatTime(int time)
	{
		//System.out.println("Enter the time in seconds");
		//Scanner input = null;
		String timeFormat = null;
		try{
			//input = new Scanner(System.in);
			//int time = input.nextInt();
			
			//time (time);
			int seconds = 0;
			int temp = 0;
			int minutes = 0 ;
			int hours = 0;
			
			
			seconds = time%60;
			temp = time/60;
			
			System.out.println("Seconds part is "+seconds);
			minutes = temp%60;
			System.out.println("Minutes part is "+minutes);
			temp = temp/60;
			System.out.println("temp part is "+temp);
			hours = temp%24;
			
			
			
			System.out.println("Hours part is "+hours);
			
			timeFormat = hours+":"+minutes+":"+seconds;
		}
		
		finally {
			//if(input!=null)
			//input.close();
			}
		
	
		return timeFormat;
	}

}
