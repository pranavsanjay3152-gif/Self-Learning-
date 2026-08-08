package basics;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
	    int n= sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row+4 ;col++) {
				System.out.print("* " );
			}System.out.println();

		}//System.out.println();

	}

}
