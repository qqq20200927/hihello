package com.iot.test;

import java.util.HashMap;

public class Demo1_Test1 {

	public static void main(String[] args) {
		
		// TODO 自动生成的方法存根
		//1.得到一串带有不同字符的字符串
		String s = "aaaaaaaccccccvvvvv";
		//2.把字符串转化成字符数组
		char[] arr = s.toCharArray();
		//3.创建一个集合用来存入字符和出现的次数
		HashMap<Character , Integer> hm = new HashMap<Character, Integer>();
		//4.遍历字符串，并把出现的字符和次数存入集合中
		for (char c : arr) {
			/*if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c) + 1);
			}*/
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
		}
		//5.打印集合
		for (Character key : hm.keySet()) {
			System.out.println(key + "=" + hm.get(key));
		}
		
	}

}
