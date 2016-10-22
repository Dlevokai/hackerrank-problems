import java.util.Scanner;

public class WarmUp {
   
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int sum=0;
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        sum = returnSumOfArray(n, arr);
	        System.out.println(sum);
	   }
	 
	 public static int returnSumOfArray(int length, int[] values){
		 int sum=0;
		 for (int value:values){
			 sum+=value;
		 }
		 return sum;
	 }
}
