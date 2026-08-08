package basics;

import java.util.Scanner;

public class Basics1 {

	public static void main(String[] args) {
		//even or odd
		System.out.println("enter your number");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	if (num%2==0){
		System.out.println(num + "number is even");
	}
	else {
		System.out.println(num +" number is odd ");
	}
		

	}

}
