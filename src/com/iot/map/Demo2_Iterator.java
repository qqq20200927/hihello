package com.iot.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {

	public static void main(String[] args) {
		//demo2();
		//�����ֵ�����ʽ�����ݼ�ֵ�Զ�������ÿһ�Եļ���ֵ
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);
		
		//Map.Entry< , > �������Entry��Map�ӿڵ��ڲ��ӿ�
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();			//ͨ��entrySet����������ÿһ����ֵ�Զ���
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();		//��ȡ������
		
		while(it.hasNext()) {												//����������
			Map.Entry<String, Integer> en = it.next();						//��ȡÿEntry����
			String key = en.getKey();										//��ȡÿһ�Զ����key��value
			Integer value = en.getValue();
			System.out.println(key + "=" + value);
		}
		
		//����Ҳ����ʹ����ǿforѭ��������
		for (Map.Entry<String, Integer> ent : map.entrySet()) {
			System.out.println(ent.getKey() + "=" + ent.getValue());
		}
	}

	public static void demo2() {
		//demo1();
		//�ڶ��ֱ�����ʽ����ǿforѭ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);

		for (String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
	}

	public static void demo1() {
		// ˫�м��ϵĵ�һ�ֱ�����ʽ��������������
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan",23);
		map.put("lisi",24);
		map.put("wangwu",25);

		
		Integer i = map.get("lisi");		//���ݼ����Ի�ȡֵ
		System.out.println(i);
		
		
		//��ȡ���еļ�
		Set<String> keySet = map.keySet();					//��ȡ���еļ����뼯����
		Iterator<String> it = keySet.iterator();			//�����ü��ϵĵ�����
		
		while(it.hasNext()) {								//�����ü���
			String key = it.next();							//��ÿһ�����������ַ�����
			 Integer value = map.get(key);						//ͨ��get���������ݼ���ȡֵ
			 System.out.println(key + "=" + value);
			
		}
	}
	

}
