package com.ezen.java.test;

public class forLoop {

	public static void main(String[] args) 
	{
		
		
		for(int i =0;i<9;i++)
		{
			System.out.printf("%d.", i);
			for(int d =i+1; d<i+5 ; d++)
			{
				System.out.printf("%d", d);
				
			}
			System.out.println();
		}
		

	}

	
	

}
