package recursion;
//Print "pranav" n times
import java.util.Scanner;

  class Recur{
    void printName(int i,int n) {
    	  
		if(i>n) {
			return;
		}
       System.out.println("Java");
       printName(i+1,n);
	 }

  	}

public class Que1{
	
	
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int i=1;
		Recur r=new Recur();
		
		r.printName(i,n);
		
	}
}
		
		

	


