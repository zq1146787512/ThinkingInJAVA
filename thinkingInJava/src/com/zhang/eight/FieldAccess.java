package com.zhang.eight;

class Super{
	public int field=9;
	public int getField(){
		return field;
	}
}

class Sub extends Super{
	public int field=1;
	public int getField(){
		return field;
	}
	public int getSuperField(){
		return super.field;
	}
}
public class FieldAccess {
	public static void main(String[] args) {
		Super sup=new Sub();
		System.out.println("sup.field="+sup.field+",sup.getfield="+sup.getField()+",sup.getsuperfield=");
		Sub sub=new Sub();
		System.out.println("sub.field="+sub.field+",sup.getfield="+sub.getField()+",sub.getsuperfield="+sub.getSuperField());
	}
}
