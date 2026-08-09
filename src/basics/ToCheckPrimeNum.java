package basics;

import java.util.Scanner;

public class ToCheckPrimeNum {

	public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          System.out.println("enter number to check prime");
          int num=in.nextInt();
          int count=0;
          for(int i=1;i<=num;i++) {
        	          if(num%i==0) {
        	        	  count++;
        	          }
        	          
          }
           if(count==2) {
        	   System.out.println("number is prime");
        	   
           }
           else System.out.println("number is composite");
	}

}
