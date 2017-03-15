package com.zhang.eight;


public class TestCycle{
	public static  void ridee(Cycle c){
		c.ride();
	}

	public static void main(String[] args) {
		Cycle c=new Unicycle();
		ridee(c);
	}
	
}
