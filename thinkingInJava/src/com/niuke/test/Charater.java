package com.niuke.test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Charater {
	 public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		String k=s.nextLine();
//		String[] charater=k.split(" ");//��������ַ����ֿո�������ŵ��ַ��������С�
		
		
			  // TODO Auto-generated method stub
			  String likeType = "*dfa*";
			 
			  String sourceStr = "adfadf";
			    System.out.println(Pattern.matches(sourceStr, likeType)); 
		
		
	}
	 public static int charaternum(String[] a){
		 String k=a[0]+a[0];
		 int sum=0;
		 for(int i=0;i<a.length;i++){
			 if(Pattern.matches(k, a[i])){//�ַ���ƥ��
				 sum+=1;
				 k=a[i]+a[i];
				 
			 }
		 }
		 return sum;
	 }

}
