import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
 

class My
{
	public static void main (String[] args)
	{
				Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		if(n>0)
			{
			System.out.println("The given number is positive");
 
			}
			else if(n<0)
			{
			System.out.println("The given number is negative");
 
			}
else 
			{
			System.out.println("Zero");
 
			}
	}
}