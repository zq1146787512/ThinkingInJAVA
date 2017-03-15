package com.zhang.five;

import java.util.Random;

public class ArraysOfPrimitives {
	public static void test(Object...is){
		for(Object s:is){
			System.out.println("s"+s);
			
		}
	}
	public static void main(String[] args) {
		Random rand=new Random(47);
		int[] a={1,2,3,4,5};
		int[] b=new int[rand.nextInt(20)];
		System.out.println(rand.nextInt(20));
		
		
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		for(int j=0;j<a.length;j++){
			b[j]=b[j]+1;
			System.out.println("a["+j+"]="+a[j]);
		}
		test(1,2);
		test("s","ds");
		
		
	}

}
