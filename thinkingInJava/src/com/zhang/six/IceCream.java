package com.zhang.six;

/**
 * ����Ȩ�޵Ŀ���
 * @author admin
 *
 */
public class IceCream{
	public static void main(String[] args) {
		Sundae sundae=Sundae.makeSundae();
		
	}
	
}

class Sundae {
	//��Ĭ�Ϲ�������Ϊprivate��ͨ����̬������ʵ�ֶ���Ĵ������÷��������Ǿ�̬��������Ϊ��������ʵ���Ǿ�̬�ķ�����
	private Sundae(){}
	 static Sundae makeSundae(){
		return new Sundae();
	}
}
