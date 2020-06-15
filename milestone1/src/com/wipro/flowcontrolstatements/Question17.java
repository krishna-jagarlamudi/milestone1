package com.wipro.flowcontrolstatements;

public class  Question17{
 
	    public static void main(String args[])
	    {
			System.out.print("Input a number: ");
	     int r,sum=0,temp;
	     int n=110011;
	     temp=n;
	     while(n>0)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(temp==sum)    
	        System.out.println("It is a Palindrome number.");    
	      else    
	        System.out.println("Not a palindrome");    
	     }  
	}

