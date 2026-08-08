package basicMaths;
import java.util.Scanner;

public class ReverseTheNum {

	public static void main(String[] args) {
		int revnum = 0;
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter your number::");
		int num=in.nextInt();
		
          while(num>0) {
        	       
        	  int last=num%10;
        	  revnum=(revnum*10)+last;
               num/=10;      	 
          }
	 	 System.out.println(revnum);  
	 		
	 	}

	}


