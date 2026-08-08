package recursion;
//factorial of a number (functional)
import java.util.Scanner;



public class Que5 {
	class Function{
		
	public static int fun(int i) {
		    if(i==0) {
		    	
		    	          return 1;
		              }
		return i* fun(i-1);
		
	}
	}
	public static void main(String[] args) {
		
  Scanner in=new Scanner(System.in);
    System.out.println("enter the num");
     int i=in.nextInt();
    
     Function.fun(i);
	 System.out.println(Function.fun(i));
	}

}
	
		

	
