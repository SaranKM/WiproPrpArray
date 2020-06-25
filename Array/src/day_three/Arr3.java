package day_three;

import java.util.Scanner;

public class Arr3 {
	public static void main(String[] args)	{	
		Scanner s=new Scanner(System.in);
		int a[]=new int[]{8,2,4,9,3};
		int search=s.nextInt(); 
		int index=0; 
		for(int i=0;i<a.length;i++) {
		if(a[i]==search) { 
			index=i; }
		} 
		if(index!=0) 	
			System.out.println(index); 
		else 	
			System.out.println(-1); }
}
