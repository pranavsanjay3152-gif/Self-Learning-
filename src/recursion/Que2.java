package recursion;

import java.util.Scanner;

//Print reverse from N to1
 class Num{
	static void num(int i,int n) {
		 if(i<1) {
			 return;
		 }
		 System.out.print(i+" ");
		 num(i-1,n);
		 
	 }
 }

public class Que2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter num");
        int n=in.nextInt();
        int i=n;
        Num.num(i,n);
	}

}
