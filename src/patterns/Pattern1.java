package patterns;
import java.util.Scanner;
//Square pattern
public class Pattern1 {
	public static void main(String[]args) {
   Scanner in =new Scanner(System.in);
   System.out.println("enter number");
   int n= in.nextInt();
   
   for(int row=0;row<n;row++) {
	   
	   
	   for(int col=0;col<n;col++) {

		   System.out.print(" * ");
		
	   }
	   System.out.println();
	   }
	  
   }
}


