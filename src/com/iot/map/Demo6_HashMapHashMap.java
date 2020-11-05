package com.iot.map;

import java.util.HashMap;

import com.iot.bean.Student;

public class Demo6_HashMapHashMap {
	//HashMap集合的嵌套
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashMap<Student , String> hm1 = new HashMap<Student, String>();
		hm1.put(new Student("zhangsan", 23) , "beijing");
		hm1.put(new Student("lisi", 24) , "shanghai");
	
		HashMap<Student , String> hm2 = new HashMap<Student, String>();
		hm2.put(new Student("wangwu", 25) , "guangzhou");
		hm2.put(new Student("zhouliu", 26) , "shenzhen");
		
		HashMap<HashMap<Student , String> , String> hm = new HashMap<>();
		hm.put(hm1, "一班");
		hm.put(hm2, "二班");
		
		for(HashMap<Student , String> h :hm.keySet()) {
			String value = hm.get(h);
			for(Student key : h.keySet()) {
				String value1 = h.get(key);
				System.out.println(key + "=" + value1 + "=" + value);
			}
		}
		
		
		
	}

}
