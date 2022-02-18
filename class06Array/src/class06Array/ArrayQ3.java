package class06Array;

public class ArrayQ3 {

	public static void main(String[] args) {
		//required: store 10 employee age 45, 37, 32, 19, 44
	// required: 4 2 3 6
	//			 1 6 2 8
	//			 5 3 9 4
		int [][] n;
		n= new int [3][4]; //first index number is always row
		
		n[0][0]= 4;
		n[0][1] = 2;
		n[0][2]= 3;
		n[0][3]= 6;
		
		n[1][0]= 1;
		n[1][1]= 6;
		n[1][2]= 2;
		n[1][3]= 8;
		
		n[2][0]= 5;
		n[2][1]= 3;
		n[2][2]= 9;
		n[2][3] = 4;
		
		for (int r=0; r< n.length; r++) { //outer loop
			for (int c=0; c<=3; c++) {
				System.out.print(n[r][c] + "");
		}//end outer loop
			System.out.println();
		}//end of inner loop
			
		
		int empAge; // Scaller variable- Only one
		empAge = 23;
		
		//int[] empAge;// Arrray variable - Multiple 
		
		double[]num= {10.1, 11.2, 12.3, 13.4, 14.5};
		num = new double[5];
		
		//index number always start from 0.
		num[0]=10.1;
		num[1]=11.2;
		num[2]=12.3;
		num[3]=13.4;
		num[4]=14.5;
		
		
	  double result=0;
		
		for (int i=0; i<=4; i++) {
			result=result+num[i];
			
		}
		
		
		System.out.println("result: "+  result/5);
		
		
		
	}//main

}//class
