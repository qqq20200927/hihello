package com.iot.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.iot.bean.Student;

public class Demo5_TreeMap {
	public static void main(String[] args) {
		//demo1();
		TreeMap<Student , String> tm =  new TreeMap<Student, String>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO 自动生成的方法存根
				int num = s1.getName().compareTo(s2.getName());				//优先姓名比较
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
		});
		tm.put(new Student("zhangsan" , 23), "beijing");
		tm.put(new Student("lisi" , 14), "shanghai");
		tm.put(new Student("wangwu" , 25), "guangzhou");
		tm.put(new Student("zhouliu" , 24), "shenzhen");
		
		System.out.println(tm);
	}

	public static void demo1() {
		TreeMap<Student , String> tm =  new TreeMap<Student, String>();
		tm.put(new Student("zhangsan" , 23), "beijing");
		tm.put(new Student("lisi" , 14), "shanghai");
		tm.put(new Student("wangwu" , 25), "guangzhou");
		tm.put(new Student("zhouliu" , 24), "shenzhen");
		
		System.out.println(tm);
	}
}
