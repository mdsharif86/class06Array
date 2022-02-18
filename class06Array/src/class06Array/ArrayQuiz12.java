package class06Array;

public class ArrayQuiz12 {

	public static void main(String[] args) {
		// print 4 5 6 7 8 6
		//       8 5 4 3 9 8
		//       3 4 7 6 7 6
		
		int emp[][];
		emp = new int [3][6];
		
		emp[0][0]= 4;
		emp[0][1]= 5;
		emp[0][2]= 5;
		emp[0][3]= 5;
		emp[0][4]= 5;
		emp[0][5]= 5;
		
		emp[1][0] = 8;
		emp[1][1] = 5;
		emp[1][2] = 4;
		emp[1][3] = 3;
		emp[1][4] = 9;
		emp[1][5] = 8;
		
		emp[2][0] = 3;
		emp[2][1] = 4;
		emp[2][2] = 7;
		emp[2][3] = 6;
		emp[2][4] = 7;
		emp[2][5] = 6;
		
		for (int r=0; r<emp.length; r++) {//outer loop
			for (int c=0; c<emp[r].length; c++) { //inner loop
				System.out.print(emp[r][c]);
			}
			System.out.println();
		}
		
		

	}//main

}//class
