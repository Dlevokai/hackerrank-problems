package algorithms;

import java.util.Scanner;

public class BigSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long arr[] = new long[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		long sum = 0;
		for (long value : arr) {
			sum += value;
		}
		System.out.print(sum);
	}
}
