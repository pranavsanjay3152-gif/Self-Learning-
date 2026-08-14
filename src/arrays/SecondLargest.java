package arrays;



public class SecondLargest {

	public static void main(String[] args) {
		int []num= {3,8,2,3,4,5};
		int largest=num[0];
		int s_largest=  Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++) {
			        if(num[i]>largest) {
			        	largest=num[i];
			        }
			        
		}
		for(int j=0;j<num.length;j++) {
			if(num[j]>s_largest && num[j]!=largest) {
				s_largest=num[j];
				
			}
		}
		System.out.println("First largest element is"+largest);
        System.out.println("Second largest element is"+s_largest);
		
	}

}
