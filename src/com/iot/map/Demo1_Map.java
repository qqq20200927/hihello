package com.iot.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Map<��, ֵ>

public class Demo1_Map {
	public static void main(String[] args) {
		//demo2();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);
		map.put("wangwu",26);
		map.put("lisi",26);
		
		Collection<Integer> c = map.values();			//��ȡ���������е�ֵ�ļ���
		System.out.println(c);
		System.out.println(map.size());					//��ȡ�����еļ��ĸ���
	}

	public static void demo2() {
		//demo1();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);
		
		System.out.println(map);		
		Integer value = map.remove("lisi");					//���ݼ���ɾ��Ԫ��,���ؼ���Ӧ��ֵ
		System.out.println(value + "."+  map);	
		
		boolean b1 = map.containsKey("zhangsan");			//�жϼ����Ƿ����ָ���ļ�
		System.out.println(b1);
		boolean b2 = map.containsValue(24);					//�жϼ����Ƿ����ָ����ֵ
		System.out.println(b2);
	}

	public static void demo1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		Integer i1 = map.put("zhangsan", 23);
		Integer i2 = map.put("lisi", 24);
		Integer i3 = map.put("wangwu", 25);
		Integer i4 = map.put("zhaoliu", 26);
		Integer i5 = map.put("zhangsan", 26);		//��ͬ�ļ����洢��ֵ�Ḳ�ǣ�����ֵ�Ǳ����ǵ�ֵ
		
		System.out.println(map);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}
}
