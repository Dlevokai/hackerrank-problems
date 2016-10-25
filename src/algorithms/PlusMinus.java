package algorithms;

import java.math.BigDecimal;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        double negativeCount=0;
        double zeroCount=0;
        double positiveCount=0;
        
        for(int value: arr){
        	if(value<0){
        		negativeCount++;
        	}
        	else if(value==0){
        		zeroCount++;
        	}
        	else{
        		positiveCount++;
        	}
        }
        
        BigDecimal positiveVal = new BigDecimal(positiveCount/n);
        BigDecimal negativeVal = new BigDecimal(negativeCount/n);
        BigDecimal zeroVal = new BigDecimal(zeroCount/n);
        
        positiveVal = positiveVal.setScale(5, BigDecimal.ROUND_HALF_UP);
        negativeVal = negativeVal.setScale(5, BigDecimal.ROUND_HALF_UP);
        zeroVal = zeroVal.setScale(5, BigDecimal.ROUND_HALF_UP);
        
        System.out.println(positiveVal);
        System.out.println(negativeVal);
        System.out.println(zeroVal);
    }
}
