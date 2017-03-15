package com.zhang.six;

/**
 * 访问权限的控制
 * @author admin
 *
 */
public class IceCream{
	public static void main(String[] args) {
		Sundae sundae=Sundae.makeSundae();
		
	}
	
}

class Sundae {
	//将默认构造器设为private，通过静态方法来实现对象的创建，该方法必须是静态方法，因为构造器其实就是静态的方法。
	private Sundae(){}
	 static Sundae makeSundae(){
		return new Sundae();
	}
}
