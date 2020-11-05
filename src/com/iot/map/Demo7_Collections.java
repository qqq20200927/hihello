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
		
		/*对集合中的元素进行排序
		Collections.sort(list);
		System.out.println(list);*/
		
		
		/*对集合进行二分法查找
		System.out.println(Collections.binarySearch(list, "a"));
		System.out.println(Collections.binarySearch(list, "f"));*/
		
		/*对集合进行排序后再查询最后一个和第一个（位置）
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));*/
		
		/*反转集合
		Collections.reverse(list);
		System.out.println(list);*/
		
		/*随机排序
		Collections.shuffle(list);
		System.out.println(list);*/
	}
}
