package com.iot.collections;

import java.util.TreeSet;

import com.iot.bean.BaseStudent;
import com.iot.bean.Student;

public class Demo1_Genric{
	public static void main(String[] args) {
		TreeSet<Student> tm = new TreeSet<>();
		tm.add(new Student("zhangsan", 23));
		tm.add(new Student("lisi", 13));
		tm.add(new Student("wangwu", 33));
		tm.add(new Student("zhaoliu", 20));
		
		System.out.println(tm);
		
		TreeSet<BaseStudent> ts1 = new TreeSet<>();
		ts1.add(new BaseStudent("zhangsan", 23));
		ts1.add(new BaseStudent("lisi", 13));
		ts1.add(new BaseStudent("wangwu", 33));
		ts1.add(new BaseStudent("zhaoliu", 20));
		
		System.out.println(ts1);
		
	}
	
	class CompareByAge implements Comparable<Student>{

		@Override
		public int compareTo(Student o) {
			// TODO 自动生成的方法存根
			return 0;
		}



		
	}
}
