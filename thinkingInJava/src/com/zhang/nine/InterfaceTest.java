package com.zhang.nine;




public class InterfaceTest {
	public class Bimpl3 implements A.B{

		@Override
		public void f() {
			System.out.println("ʵ����A�еĽӿ�B�ĵ�������");
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
			System.out.println("ʵ����A�нӿ�B�ĵ�һ����");
			
		}
		
	}

	class Bimpl2 implements B{
		@Override
		public void f() {
			System.out.println("ʵ����A�нӿ�B�ĵڶ�����");
			
		}
		
	}
	
	private interface C{
		void f();
	}
	private class Cimpl1 implements C{
		@Override
		public void f() {
			System.out.println("ʵ����A��˽�нӿ�C�ĵ�һ����");
			
		}}
	
	private class Cimpl2 implements C{
		@Override
		public void f() {
			System.out.println("ʵ����A��˽�нӿ�C�ĵڶ�����");
			
		}}
	
	public C getC(){
		return new Cimpl2();//����ת��
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



  
