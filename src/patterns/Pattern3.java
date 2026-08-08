package patterns;
import java.util.Scanner;
public class Pattern3 {
	/*
	 * ulta right angle
	 ****
	 ***
	 **
	 *    */
	public static void main(String[] args) {
     
    	 System.out.println("enter number");
    	 
    	 Scanner in= new Scanner(System.in);
    	 int num= in.nextInt();
//     DON PRANAV'S METHOD    	 
//    	 for(int i=num;i>=1;i--) {
//    	 for(int j=0;j<i;j++) {
//    		 System.out.print("*");
//    	 }
//    	 System.out.println();
//     }
		
    	 for(int i=0;i<=num;i++) {
 			for(int j=1;j<num-i+1;j++) {
 				System.out.print("*");
 				
 				
 			}
 				System.out.println();
 		}

	}

}
