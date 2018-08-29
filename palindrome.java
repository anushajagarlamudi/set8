/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String original,reverse="";//objects of string class
		original=sc.nextLine();
		int len=original.length();
		for(int i=len-1;i>=0;i--)
	    	reverse=reverse+original.charAt(i);
	    	if(original.equals(reverse))
	    	System.out.println("yes");
	    	else
	    	System.out.println("no");
		
	}
}
