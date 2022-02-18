package class06Array;

import java.util.Arrays;

public class ReviewArrayClassWedneday {

	public static void main(String[] args) {
		// can you copy an array without a any data loss?
		int[] a;
		a= new int[3];
		
		a[0]= 23;
		a[1]= 64;
		a[2]= 35;
		
		a= Arrays.copyOf(a,5 );
		
		int [] b= new int[5];
		
		
		
		a[3]= 19;
		a[4]= 51;		
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}

	}//main

}//class
