package com.zhang.ten;

public class DotNew {
	public class Inner{}
	public static void main(String[] args) {
		DotNew dotnew=new DotNew();
		DotNew.Inner dnin=dotnew.new Inner();
	}

}
