package class06Array;

public class ArrayQuiz11 {

	public static void main(String[] args) {
	//print the following statement
		// 4 5 6 7 8  age[0].length -> 5
		// 8 5 4 3 9
		// 3 4 7 6 7
		
		int age [][]= new int [3][5];  // Rows=3  Cols=5
		
		
		age [0][0]= 4;
		age [0][1]= 5;
		age [0][2]= 6;
		age [0][3]= 7;
		age [0][4]= 8;
		
		age [1][0]= 8;
		age [1][1]= 5;
		age [1][2]= 4;
		age [1][3]= 3;
		age [1][4]= 9;
		
		age [2][0]= 3;
		age [2][1]= 4;
		age [2][2]= 7;
		age [2][3]= 4;
		age [2][4]= 6;
		
		System.out.println("length of Row " + age.length );
		System.out.println("length of Col " + age[0].length );
		
		for (int r=0; r<age.length; r++) {//outer loop
			for (int c=0; c<age[r].length; c++) {// inner loop
				System.out.print(age[r][c]);
			}//end of outer loop
			System.out.println();
		}//end of inner loop
		
		
	}//main

}//class
