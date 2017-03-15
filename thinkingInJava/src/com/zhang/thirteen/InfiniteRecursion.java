package com.zhang.thirteen;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
	public String toString() {
		// this 时当前类InfiniteRecursion的类型，在遇到“+”时会自动转换称String类型，并调用的是当前的toString方法，会一直递归下去，运行时报错
		// return "InfiniteRecursion Address: "+this+"\n";
		// 调用父类的toString方法来是实现当前类的类型转换为String对象
		return "InfiniteRecursion Address: " + super.toString() + "\n";
	}

	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}

}
