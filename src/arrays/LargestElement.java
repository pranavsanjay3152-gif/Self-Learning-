package arrays;

public class LargestElement {
 
	public static void main(String[] args) {
		int []num= {5,1,3,6,4,8};
           int longest=num[0];
           for(int i=0;i<num.length;i++) {
        	       if(num[i]>num[0]) {
        	    	    longest=num[i];
        	       }
        	   
           }
           System.out.println(longest);
          
	}

}
