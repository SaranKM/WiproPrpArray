package day_three;

import java.util.Arrays;

public class Arr5 {
	public static void main(String[] args)	{	
		int a[]=new int[]{8,2,4,9,3};
		Arrays.sort(a);	
		System.out.println("Largest two:"+a[a.length-1]+" "+a[a.length-2]);
	System.out.println("Smallest two:"+a[0]+" "+a[1]);	
	}
}
