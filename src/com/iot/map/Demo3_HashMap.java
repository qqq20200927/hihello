package com.iot.map;

import java.util.HashMap;

import com.iot.bean.Student;

public class Demo3_HashMap {
		/*HashMap���ϼ���Student ֵ��String
		 * ����ѧ�����󣬴���ÿһ��ѧ��
		 * ֵ���ַ������󣬴���ÿһ��ѧ���Ĺ�����
		 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("zhangsan" , 23), "hushi");
		hm.put(new Student("zhangsan" , 23), "baotou");
		hm.put(new Student("lisi" , 24), "eerduosi");
		hm.put(new Student("wangwu" , 25), "chifeng");
		
		System.out.println(hm);				//����֮����baotouû��hushi���ǵ�������Ϊÿһ��Student����ͬ����������֮ǰ����
		//��ʱ�����дStudent���е�HashCode������equles��������ô����ͻḲ��
	
	}

}
