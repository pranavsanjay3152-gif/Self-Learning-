package basics;

public class RecBackTrack {
          class Function{
        	  public static int f(int n) {
        		       if(n==0) {
        		    	    return 0;
        		       }
        		return n+Function.f(n-1);
        	 

        		  
        	  }
          }
	
	
	
	
	public static void main(String[]args) {
		int num=4;
		Function.f(num);
		System.out.println(Function.f(num));
	}
	

	
	
	
	
}
            