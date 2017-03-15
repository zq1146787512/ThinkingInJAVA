package com.zhang.twelve;

public class ExceptionTest {
	public static void main(String[] args) {
		String s=new StringBuilder("zhang").append("").toString();
		System.out.println(s.intern()==s);
		String s1=new StringBuilder("com.zhan2g.").append("twelve.ExceptionTest").toString();
		System.out.println(s1.intern()==s1);
	}

}
