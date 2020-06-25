package day_three;

import java.util.Arrays;

public class Arr2 {
	public static void main(String[] args) 	{	
		int a[]=new int[]{8,2,4,9,3}; 
		Arrays.sort(a);
		System.out.println("Min:"+a[0]); 
		System.out.println("Max:"+a[a.length-1]);
		}
}
