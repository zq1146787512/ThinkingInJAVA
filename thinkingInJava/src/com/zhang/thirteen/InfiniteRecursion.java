package com.zhang.thirteen;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
	public String toString() {
		// this ʱ��ǰ��InfiniteRecursion�����ͣ���������+��ʱ���Զ�ת����String���ͣ������õ��ǵ�ǰ��toString��������һֱ�ݹ���ȥ������ʱ����
		// return "InfiniteRecursion Address: "+this+"\n";
		// ���ø����toString��������ʵ�ֵ�ǰ�������ת��ΪString����
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
