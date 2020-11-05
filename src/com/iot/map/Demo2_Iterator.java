package com.iot.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {

	public static void main(String[] args) {
		//demo2();
		//第三种迭代方式，根据键值对对象，来找每一对的键和值
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);
		
		//Map.Entry< , > 这里代表Entry是Map接口的内部接口
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();			//通过entrySet方法来返回每一个键值对对象
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();		//获取迭代器
		
		while(it.hasNext()) {												//遍历迭代器
			Map.Entry<String, Integer> en = it.next();						//获取每Entry对象
			String key = en.getKey();										//获取每一对对象的key和value
			Integer value = en.getValue();
			System.out.println(key + "=" + value);
		}
		
		//这里也可以使用增强for循环来遍历
		for (Map.Entry<String, Integer> ent : map.entrySet()) {
			System.out.println(ent.getKey() + "=" + ent.getValue());
		}
	}

	public static void demo2() {
		//demo1();
		//第二种遍历方式（增强for循环）
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);

		for (String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
	}

	public static void demo1() {
		// 双列集合的第一种遍历方式（迭代器遍历）
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);

		
		Integer i = map.get("lisi");		//根据键可以获取值
		System.out.println(i);
		
		
		//获取所有的键
		Set<String> keySet = map.keySet();					//获取所有的键存入集合中
		Iterator<String> it = keySet.iterator();			//创建该集合的迭代器
		
		while(it.hasNext()) {								//遍历该集合
			String key = it.next();							//把每一个键都存入字符串中
			 Integer value = map.get(key);						//通过get方法来根据键获取值
			 System.out.println(key + "=" + value);
			
		}
	}
	

}
