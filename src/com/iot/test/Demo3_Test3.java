package com.iot.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Demo3_Test3 {
	public static void main(String[] args) {
		//ͨ���趨�����ַ����������õ��˿��Ƶĵ����ͻ�ɫ
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
		String[] color = {"����","����","��Ƭ","�ݻ�"};
		
		//HashMap˫�м�����������ÿһ���˿��Ƶ�����
		HashMap<Integer, String> hm = new HashMap<>();
		//ArrayList������ÿһ���˿��Ƶ�����
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;
		
		//���˿��ƵĻ�ɫ�͵���ƴ������
		for(String s1 : num) {
			for(String s2 : color) {
				hm.put(index , s2.concat(s1));
				list.add(index);							//�������������ڼ�����
				index++;
			}
		}
		
		//��������ƣ����Ұ�����Ҳ����
		hm.put(index, "С��");
		list.add(index);
		index++;
		hm.put(index, "����");
		list.add(index);
		
		//ϴ��
		Collections.shuffle(list);
		
		//����
		//ʹ��TreeSet���ϵ�ԭ���ǣ���ÿ���˵��ƽ����Զ�������
		TreeSet<Integer> p1 = new TreeSet<Integer>();
		TreeSet<Integer> p2 = new TreeSet<Integer>();
		TreeSet<Integer> p3 = new TreeSet<Integer>();
		TreeSet<Integer> dp = new TreeSet<Integer>();
		
		for(int i = 0 ; i < list.size() ; i++) {
			if( i >= list.size() - 3 ) {
				dp.add(list.get(i));									//������������ţ�ʣ�µ�51�������������˷���
			}else if(i % 3 == 0 ) {
				p1.add(list.get(i));
				
			}else if(i % 3 == 1 ) {
				p2.add(list.get(i));
				
			}else {
				p3.add(list.get(i));
			}
		}
		
		//����
		lookpoker(hm, p1, "���1");
		lookpoker(hm, p2, "���2");
		lookpoker(hm, p3, "���3");
		lookpoker(hm, dp, "����");
	}
	
	//����һ����������������ÿ���˷����ƣ�Ҳ����ʵ�ֿ��Ʋ���
	public static void lookpoker(HashMap<Integer , String> hm , TreeSet<Integer> ts , String name) {
		System.out.println(name + "������:");
		for (Integer i1 : ts) {											//i����˫�м��ϵ�ÿһ����
			System.out.print(hm.get(i1) + " ");							//���ݼ�����ȡÿһ��ֵ
		}
		System.out.println();
	}
}

