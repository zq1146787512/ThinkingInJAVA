package com.zhang.five;

import static net.mindview.util.Print.*;

public class ExplicitStatic {
	public static void main(String[] args) {
		print("Inside main()");
		Cups.cup1.f(99);
	}
//	static Cups cup3=new Cups();

}

class Cup{
	Cup(int marker){
		print("Cup("+marker+")");
	}
	void f(int marker){
		print("f("+marker+")");
	}
}
class Cups{
	static Cup cup1;
	static Cup cup2;
	static {
		cup1=new Cup(1);
		cup2=new Cup(2);
	}
	Cups(){
		print("Cups()");
	}
}
