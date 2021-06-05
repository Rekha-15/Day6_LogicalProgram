package com;

import java.util.*;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		String bin = "";
		while(dec > 0)
		{
			int r = dec % 2;
			bin = r + bin;
			dec = dec / 2;
		}
		System.out.println("Binary number is: " + bin);
	}
}
