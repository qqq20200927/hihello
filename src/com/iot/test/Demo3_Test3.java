package com.iot.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Demo3_Test3 {
	public static void main(String[] args) {
		//通过设定两个字符串数组来得到扑克牌的点数和花色
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
		String[] color = {"红桃","黑桃","方片","草花"};
		
		//HashMap双列集合用来存入每一张扑克牌的属性
		HashMap<Integer, String> hm = new HashMap<>();
		//ArrayList来存入每一张扑克牌的索引
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;
		
		//将扑克牌的花色和点数拼接起来
		for(String s1 : num) {
			for(String s2 : color) {
				hm.put(index , s2.concat(s1));
				list.add(index);							//把索引都存入在集合中
				index++;
			}
		}
		
		//添加特殊牌，并且把索引也存入
		hm.put(index, "小王");
		list.add(index);
		index++;
		hm.put(index, "大王");
		list.add(index);
		
		//洗牌
		Collections.shuffle(list);
		
		//发牌
		//使用TreeSet集合的原因是，对每个人的牌进行自动的排序
		TreeSet<Integer> p1 = new TreeSet<Integer>();
		TreeSet<Integer> p2 = new TreeSet<Integer>();
		TreeSet<Integer> p3 = new TreeSet<Integer>();
		TreeSet<Integer> dp = new TreeSet<Integer>();
		
		for(int i = 0 ; i < list.size() ; i++) {
			if( i >= list.size() - 3 ) {
				dp.add(list.get(i));									//给底牌添加三张，剩下的51张轮流给三个人发牌
			}else if(i % 3 == 0 ) {
				p1.add(list.get(i));
				
			}else if(i % 3 == 1 ) {
				p2.add(list.get(i));
				
			}else {
				p3.add(list.get(i));
			}
		}
		
		//看牌
		lookpoker(hm, p1, "玩家1");
		lookpoker(hm, p2, "玩家2");
		lookpoker(hm, p3, "玩家3");
		lookpoker(hm, dp, "底牌");
	}
	
	//声明一个方法，用来遍历每个人发的牌，也就是实现看牌操作
	public static void lookpoker(HashMap<Integer , String> hm , TreeSet<Integer> ts , String name) {
		System.out.println(name + "的牌是:");
		for (Integer i1 : ts) {											//i代表双列集合的每一个键
			System.out.print(hm.get(i1) + " ");							//根据键来获取每一个值
		}
		System.out.println();
	}
}

