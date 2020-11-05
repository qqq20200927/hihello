package com.iot.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo7_Collections {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("r");
		list.add("e");
		list.add("g");
		
		System.out.println(list);
		
		/*�Լ����е�Ԫ�ؽ�������
		Collections.sort(list);
		System.out.println(list);*/
		
		
		/*�Լ��Ͻ��ж��ַ�����
		System.out.println(Collections.binarySearch(list, "a"));
		System.out.println(Collections.binarySearch(list, "f"));*/
		
		/*�Լ��Ͻ���������ٲ�ѯ���һ���͵�һ����λ�ã�
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));*/
		
		/*��ת����
		Collections.reverse(list);
		System.out.println(list);*/
		
		/*�������
		Collections.shuffle(list);
		System.out.println(list);*/
	}
}
