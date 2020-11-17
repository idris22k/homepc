package com.fb;

public class FaceBook {

	public static void main (String [] args)
	{
	String s = "idris";
	String result = " ";
	for(int i = s.length()-1; i>=0; i--)
	{
	char re = s.charAt(i);
	result = result + re;
	}
	System.out.println(result);
	}
	
	
	
}
