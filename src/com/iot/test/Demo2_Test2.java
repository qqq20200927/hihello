package com.iot.test;

import java.util.*;
import java.util.Collections;

public class Demo2_Test2 {
		//模拟斗地主的洗牌发牌看牌
	
	public static void main(String[] args) {
		
		//通过设定两个字符串数组来得到扑克牌的点数和花色
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"红桃","黑桃","方片","草花"};
		
		//创建一个扑克牌集合
		ArrayList<String> poker = new ArrayList<>();
		
		//通过for循环的嵌套来把点数和花色拼接起来，用到了concat方法，这里也可以使用增强for循环来遍历for(String s1 : num)...
		for (int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < color.length ; j++) {
				poker.add(color[j].concat(num[i]));	
			}
		}
		//再来添加特殊的两张牌
		poker.add("大王");
		poker.add("小王");
		
		//洗牌
		Collections.shuffle(poker);
		
		//创建三名玩家和底牌的数组
		ArrayList<String> p1 = new ArrayList<>();
		ArrayList<String> p2 = new ArrayList<>();
		ArrayList<String> p3 = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		//发牌（通过对三取余结果的不同，来进行模拟发牌）
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
		
		//看牌
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(dipai);
	}
}
