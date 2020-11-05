package com.iot.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Map<键, 值>

public class Demo1_Map {
	public static void main(String[] args) {
		//demo2();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);
		map.put("wangwu",26);
		map.put("lisi",26);
		
		Collection<Integer> c = map.values();			//获取集合中所有的值的集合
		System.out.println(c);
		System.out.println(map.size());					//获取集合中的键的个数
	}

	public static void demo2() {
		//demo1();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);
		
		System.out.println(map);		
		Integer value = map.remove("lisi");					//根据键来删除元素,返回键对应的值
		System.out.println(value + "."+  map);	
		
		boolean b1 = map.containsKey("zhangsan");			//判断集合是否包含指定的键
		System.out.println(b1);
		boolean b2 = map.containsValue(24);					//判断集合是否包含指定的值
		System.out.println(b2);
	}

	public static void demo1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		Integer i1 = map.put("zhangsan", 23);
		Integer i2 = map.put("lisi", 24);
		Integer i3 = map.put("wangwu", 25);
		Integer i4 = map.put("zhaoliu", 26);
		Integer i5 = map.put("zhangsan", 26);		//相同的键不存储，值会覆盖，返回值是被覆盖的值
		
		System.out.println(map);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}
}
