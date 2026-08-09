package basics;

public class ToCheckPalindrome {

	public static void main(String[] args) {
		int num=12321;
		int temp=num;
		int revnum=0;
		while(temp>0) {
			int last=temp%10;
		revnum=(revnum*10)+last;
			temp/=10;
		}
        if(num==revnum) {
        	System.out.println(num+" is palindrome");
        	
        }
        else System.out.println(num+ " is not palindrome");
        	
	}

}
