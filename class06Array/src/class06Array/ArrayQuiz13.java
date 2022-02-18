package class06Array;

public class ArrayQuiz13 {

	public static void main(String[] args) {
		//print 4 5 6
		//      8 5 4
		//      3 4 7
		//      6 7 9
		int age[][]= new int [4][3];
		age[0][0] = 4 ;
		age[0][1] = 5 ;
		age[0][2] = 6 ;
		
		age[1][0] = 8 ;
		age[1][1] = 5 ;
		age[1][2] = 4 ;
		
		age[2][0] = 3 ;
		age[2][1] = 4 ;
		age[2][2] = 7 ;
		
		age[3][0] = 6 ;
		age[3][1] = 7 ;
		age[3][2] = 9 ;
		
		for (int r=0; r<age.length; r++) {//outer loop
			for (int c=0; c<age[c].length; c++) {
				System.out.print(age[r][c]);
				
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
