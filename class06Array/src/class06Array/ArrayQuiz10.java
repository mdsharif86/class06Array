package class06Array;

public class ArrayQuiz10 {

	public static void main(String[] args) {
		// write a program which is print
		// 4 5 6 7
		// 8 5 4 3
		// 3 4 7 6
		
		int [][]age;
		age = new int [3][4];
		
		age [0][0]= 4;
		age [0][1]= 5;
		age [0][2]= 6;
		age [0][3]= 7;
		
		age [1][1] = 8;
		age [1][2] = 8;
		age [1][3] = 8;
		
		age [2][0] = 3;
		age [2][1] = 4;
		age [2][2] = 7;
		age [2][3] = 6;
		
		for (int r=0; r< age.length; r++ ) {
			for (int c=0; c<=3; c++) {
				System.out.print(age [r][c]);
		}//end of outer loop
			System.out.println();
		}//end of inner loop
	}//main

}//class
