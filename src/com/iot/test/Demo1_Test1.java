package com.iot.test;

import java.util.HashMap;

public class Demo1_Test1 {

	public static void main(String[] args) {
		
		// TODO �Զ����ɵķ������
		//1.�õ�һ�����в�ͬ�ַ����ַ���
		String s = "aaaaaaaccccccvvvvv";
		//2.���ַ���ת�����ַ�����
		char[] arr = s.toCharArray();
		//3.����һ���������������ַ��ͳ��ֵĴ���
		HashMap<Character , Integer> hm = new HashMap<Character, Integer>();
		//4.�����ַ��������ѳ��ֵ��ַ��ʹ������뼯����
		for (char c : arr) {
			/*if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c) + 1);
			}*/
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
		}
		//5.��ӡ����
		for (Character key : hm.keySet()) {
			System.out.println(key + "=" + hm.get(key));
		}
		
	}

}
