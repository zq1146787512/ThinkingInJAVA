package com.zhang.five;

public enum EnumTest {
	ONE,FIVE,TEN,TEETEN,FIFITY,HUNDRED;
	public static void main(String[] args) {
		for(EnumTest s: EnumTest.values()){
		System.out.println(s.ordinal()+""+s);
	}}
	

}
