package basicMaths;

import java.util.Scanner;

public class FindDigitsInNum {

	public static void main(String[] args) {
		//program to count digits in any number
         Scanner in=new Scanner(System.in);
         System.out.println("enter the number::");
         int num=in.nextInt();
         int count=0;
         while(num>0) {
        	  count+=1;
        	  num=num/10;
         }
		System.out.println("digits in your number are::"+count);
		
		
	}

}