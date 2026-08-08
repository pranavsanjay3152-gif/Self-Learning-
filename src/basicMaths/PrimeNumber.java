package basicMaths;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter your number");
		int num=in.nextInt();
		int count=0;
		  			  
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
				
					
					
				}
			if(count==2) {
				  System.out.println("Number is prime");
			  }
				  else {
					 System.out.println("number is not prime");
				  
			  }
			}
		  
			  
			  
		  }
		

	


