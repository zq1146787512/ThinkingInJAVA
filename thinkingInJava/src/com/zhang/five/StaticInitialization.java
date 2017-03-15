package com.zhang.five;

import static net.mindview.util.Print.*;


/**
 * ��̬���ݵĳ�ʼ��
 * @author admin
 *
 */
public class StaticInitialization {
	public static void main(String[] args) {
		print("creating new Cupboard() in main");
		new Cupboard();
		print("Creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}
	//�����ʼ������Ӧ���౻���أ�Ȼ�����еĳ�ʼ��˳���ǣ���̬����-->����-->������-->����
	static Table table=new Table();
	static Cupboard cupboard=new Cupboard();

}
class Bowl {
	Bowl(int marker){
		print("Bowl("+marker+")");
	}
	 void f1(int marker){
		print("f1("+marker+")");
	}
	static {
		print("��̬����bowl");
	}
}
class Table{
	static {print("��̬����table");}
	static Bowl b1=new Bowl(1);
	Table(){
		print("table()");
		b2.f1(1);
	}
	void f2(int marker){
		print("f1("+marker+")");
	}
	static Bowl b2=new Bowl(2);
}

class Cupboard{
	Bowl b3=new Bowl(3);
	static Bowl b4=new Bowl(4);
	Cupboard(){
		print("Cupboard()");
		b4.f1(2);
	}
	void f3(int marker){
		print("f3("+marker+")");
	}
	static Bowl b5=new Bowl(5);
}
