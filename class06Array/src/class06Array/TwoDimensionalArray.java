package class06Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	//required: 4 2 3 6
		//      1 6 2 8
		//      5 3 9 4
		
		int [][] n;
		n = new int [3][4];
		
		n[0][0]=  4;
		n[0][1] = 2;
		n[0][2] = 3;
		n[0][3] = 6;
		
		n[1][0] = 1;
		n[1][1] = 6;
		n[1][2]=  2;
		n[1][3] = 8;
		
		n[2][0] = 5;
		n[2][1]=  3;
		n[2][2]=  9;
		n[2][3]=  4;
		
		
		for (int r=0; r<=2; r++) { //outer loop
			for (int c=0; c<=3; c++) { //inner loop
				
				System.out.print(n[r][c]);
			
			}
			System.out.println();
		}//end of outer loop
		
		System.out.println();
	}//main

}//class
