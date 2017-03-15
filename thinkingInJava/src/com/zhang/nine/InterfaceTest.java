package com.zhang.nine;




public class InterfaceTest {
	public class Bimpl3 implements A.B{

		@Override
		public void f() {
			System.out.println("实现类A中的接口B的第三个类");
		}
		
	}
	public static void main(String[] args) {
		A a=new A();
		a.receiveC(a.getC());
		
	;
	}

}

class A{
	interface B{
		void f();
	}
	
	class Bimpl1 implements B{
		@Override
		public void f() {
			System.out.println("实现类A中接口B的第一个类");
			
		}
		
	}

	class Bimpl2 implements B{
		@Override
		public void f() {
			System.out.println("实现类A中接口B的第二个类");
			
		}
		
	}
	
	private interface C{
		void f();
	}
	private class Cimpl1 implements C{
		@Override
		public void f() {
			System.out.println("实现类A中私有接口C的第一个类");
			
		}}
	
	private class Cimpl2 implements C{
		@Override
		public void f() {
			System.out.println("实现类A中私有接口C的第二个类");
			
		}}
	
	public C getC(){
		return new Cimpl2();//向上转型
	}
	public void receiveC(C c){
		c.f();
	}
	
}

interface D{
	interface E{
		int s=1;
		void si();
		void sd();
	}
	interface F{}
}



  
