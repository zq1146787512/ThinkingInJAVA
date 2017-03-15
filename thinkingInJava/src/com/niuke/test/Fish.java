package com.niuke.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fish {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int minSize = s.nextInt();
		int maxSize = s.nextInt();
		int n = s.nextInt();
		int[] fishSize = new int[n];
		for (int i = 0; i < n; i++) {
			fishSize[i] = s.nextInt();
		}
		
		Fish fish=new Fish();
		int k=fish.howmanyfish(minSize, maxSize, n, fishSize);
		System.out.println(k);
	}
//������
	public int howmanyfish(int min, int max, int n, int[] k) {
		List<Integer> s = new ArrayList<>();// ����ܹ�������������
		Arrays.sort(k);//��ԭ�е����������
		boolean flag = false;//�ж��Ƿ��ǿ��Լ������
		//�Լ�����������е�������ж�
		for (int i = min; i <= max; i++) {
			for (int j = 0; j <= k.length - 1; j++) {
				if ((k[j] >= 2 * i && k[j] <= 10 * i)
						||(i >= 2 * k[j] && i <= 10 * k[j])) {
					flag=false;
					break;
				}
				flag=true;
			}

//			if (!s.isEmpty() && s.size() > 0) {
//				for (int j = 0; j <= s.size()-1; j++) {
//					if ((s.get(j) >= 2 * i && s.get(j) <= 10 * i)
//							||(i >= 2 * s.get(j) && i <= 10 * s.get(j))) {
//						flag=false;
//						break;
//					}
//					flag=true;
//				}
//			}
			if (flag) {
				s.add(i);
//				System.out.println(i);
			}
		}
		return s.size()>0?s.size():0;
	}
	

}
