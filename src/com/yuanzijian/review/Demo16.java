package com.yuanzijian.review;

import java.util.Scanner;
import java.util.TreeMap;

/*
�Ӽ�������һ����ĸ����ַ������ֱ�ͳ��ÿ����ĸ���ֵĴ���(10��)
Ҫ�������Ч��������ĸ��˳�����  a(7)b(5)...
*/
public class Demo16 {

	public static void main(String[] args) {
		System.out.println("������һ���ַ�����");
		Scanner  scanner = new Scanner(System.in);
		String line = scanner.next();
		char[] arr = line.toCharArray();	//�Ȱ��ַ���ת�����ַ����顣
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>(); 
		for(char c : arr){
			if(map.containsKey(c)){ //map�����Ѿ������˸��ַ�
				int count = map.get(c);
				map.put(c, count+1);
			}else{  //û�а���
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		
	}
	
}
