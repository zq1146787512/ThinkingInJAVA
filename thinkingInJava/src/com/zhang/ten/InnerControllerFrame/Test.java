package com.zhang.ten.InnerControllerFrame;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	 public static void main(String[] args) {

	        ArrayList<Integer> inputs = new ArrayList<Integer>();
	        Scanner in = new Scanner(System.in);
	        String line = in.nextLine();
	        while(line != null && !line.isEmpty()) {
	            int value = Integer.parseInt(line.trim());
	            if(value == 0) break;
	            inputs.add(value);
	            line = in.nextLine();
	        }
	        int[] A = new int[inputs.size()];
	        for(int i=0; i<inputs.size(); i++) {
	            A[i] = inputs.get(i).intValue();
	        }
	        int res = resolve(A);

	        System.out.println(String.valueOf(res));
	    }

	    // write your code here
	    public static int resolve(int[] A) {
	    	int L=(int)(Math.log(A.length)/Math.log(2))+1;
	    	int k=(int)Math.pow(2, L-1);
	    	int sum=0;
	    	for(int i=k-1;i<A.length;i++){
	    		for(int j=i;j>=1;j=(j+1)/2-1){
	    			sum=sum+getlast(A[j]);}
			sum = sum + getlast(A[0]);
	    	}
	    	return sum;

	    }
	    public static int getlast(int a){
	    	return (a%100)%10;
	    }
	}


