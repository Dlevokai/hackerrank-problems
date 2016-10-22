package algorithms;

import java.util.Scanner;

public class DiagDiff {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		int sumFirstDiag = 0;
		int sumSecondDiag = 0;
		int reverseIterator = 0;
		
		for(int i = 0; i<a.length; i++){
			sumFirstDiag += a[i][i];
		}	
		for(int i =a.length-1; i>=0; i--){
			sumSecondDiag += a[reverseIterator][i];
			reverseIterator++;
		}
		System.out.print(Math.abs(sumFirstDiag-sumSecondDiag));
	}
}
