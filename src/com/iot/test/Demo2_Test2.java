package com.iot.test;

import java.util.*;
import java.util.Collections;

public class Demo2_Test2 {
		//ģ�⶷������ϴ�Ʒ��ƿ���
	
	public static void main(String[] args) {
		
		//ͨ���趨�����ַ����������õ��˿��Ƶĵ����ͻ�ɫ
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"����","����","��Ƭ","�ݻ�"};
		
		//����һ���˿��Ƽ���
		ArrayList<String> poker = new ArrayList<>();
		
		//ͨ��forѭ����Ƕ�����ѵ����ͻ�ɫƴ���������õ���concat����������Ҳ����ʹ����ǿforѭ��������for(String s1 : num)...
		for (int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < color.length ; j++) {
				poker.add(color[j].concat(num[i]));	
			}
		}
		//������������������
		poker.add("����");
		poker.add("С��");
		
		//ϴ��
		Collections.shuffle(poker);
		
		//����������Һ͵��Ƶ�����
		ArrayList<String> p1 = new ArrayList<>();
		ArrayList<String> p2 = new ArrayList<>();
		ArrayList<String> p3 = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		//���ƣ�ͨ������ȡ�����Ĳ�ͬ��������ģ�ⷢ�ƣ�
		for(int a = 0 ; a < poker.size() ; a++) {
			if(a >= poker.size() - 3 ) {
				dipai.add(poker.get(a));
			}else if(a % 3 == 0 ) {
				p1.add(poker.get(a));
			}else if(a % 3 == 1 ) {
				p2.add(poker.get(a));
			}else {
				p3.add(poker.get(a));
			}
		}
		
		//����
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(dipai);
	}
}
