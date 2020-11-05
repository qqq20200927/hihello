package com.iot.map;

import java.util.HashMap;

import com.iot.bean.Student;

public class Demo3_HashMap {
		/*HashMap集合键是Student 值是String
		 * 键是学生对象，代表每一个学生
		 * 值是字符串对象，代表每一个学生的归属地
		 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("zhangsan" , 23), "hushi");
		hm.put(new Student("zhangsan" , 23), "baotou");
		hm.put(new Student("lisi" , 24), "eerduosi");
		hm.put(new Student("wangwu" , 25), "chifeng");
		
		System.out.println(hm);				//这里之所以baotou没把hushi覆盖掉，是因为每一个Student对象不同，而并非是之前那样
		//这时如果重写Student类中的HashCode方法和equles方法，那么结果就会覆盖
	
	}

}
