package com.zhang.ten;

/**
 * 普通的内部类的表现形式
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
