package com.zhang.ten;

interface Destination{ String readLable(); }
interface Contents{ int value(); }
/**
 * 匿名内部类
 * @author zhang
 *
 */
public class NimingInner {
	public Contents contents(){
		return new Contents(){
			private int i=11;
			public int value(){ return i;}
		};
	}
	public static void main(String[] args) {
		NimingInner niming=new NimingInner();
		Contents c=niming.contents();
		System.out.println(c.value());
	}

}
