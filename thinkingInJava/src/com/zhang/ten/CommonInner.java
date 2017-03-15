package com.zhang.ten;

/**
 * ��ͨ���ڲ���ı�����ʽ
 * 
 * @author zhang
 * 
 */
public class CommonInner {
	public Destination destination(String s) {
		class IDestination implements Destination {
			private String lable;

			private IDestination(String whereTo) {
				lable = whereTo;
			}

			@Override
			public String readLable() {
				return lable;
			}
		}
		return new IDestination(s);

	}

	public static void main(String[] args) {
		CommonInner c=new CommonInner();
		Destination d=c.destination("gogogogo!!");
		System.out.println(d.readLable());
	}

}
