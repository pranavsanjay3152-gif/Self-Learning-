package recursion;
//Fibonacci using multiple recursion

public class MultipleRecursion {
    class Fibo{
    	 static   public int f(int n){
    	    	    if(n<=1) {
    	    	    	return n;
    	    	    }
    	    	int last=f(n-1);
    	    	int s_last=f(n-2);
    	    	return last+s_last;
    	    	    
    	    }
    }
	public static void main(String[] args) {
         int num=6;
         Fibo.f(num);
         System.out.println(Fibo.f(num));

	}

}
