package algorithms;

import java.util.Scanner;

public class Triplets {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	        
	        int aliceScore = 0;
	        int bobScore = 0;
	        int[] aliceValues = {a0, a1, a2};
	        int[] bobValues = {b0, b1, b2};
	        
	        for(int i =0; i<3; i++){
	        	if(aliceValues[i]<bobValues[i]){
	        		bobScore++;
	        	}
	        	else if(bobValues[i]<aliceValues[i]){
	        		aliceScore++;
	        	}
	        }
	       
	        System.out.println(aliceScore + " " + bobScore);
	    }
}
