package recursion;
//sum of n number using recursion
import java.util.Scanner;

public class Que4 {

  /* 	 //parameterized solution
       class Print{
		static void print(int i,int n) {
			if(i<1) {
				System.out.println(n);
				return;
			}
			print(i-1,n+i);
			
		}
		} */
	class Function{
		//Function method
	public static int fun(int i) {
		    if(i==0) {
		    	
		    	          return 0;
		              }
		return i+fun(i-1);
		
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
