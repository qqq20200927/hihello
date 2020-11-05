package com.iot.map;

import java.util.LinkedHashMap;

public class Demo4_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		
		lhm.put("zhangsan", 23);
		lhm.put("lisi", 24);
		lhm.put("wangwu", 25);
		lhm.put("zhaoliu", 26);
		
		//LinkedHashMap会有序输出集合
		System.out.println(lhm);
	}
}
