package com.yuanzijian.review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 ��̬�� ������������ͱ���ָ��������Ķ��󣬻����ǽӿڵ��������ͱ���ָ��ӿ�ʵ����Ķ��� 
 
Ӧ�ã� 
	1. ��̬Ӧ�����β����͵�ʱ�򣬿��Խ��ո������͵Ĳ�����
		sort(List  list)
		sort(ArrayList list)
		sort(LinkedList list)
		 
	2. ��̬���ڷ���ֵ���͵�ʱ����Է��ظ������͵Ĳ�����

�����������ã� ���ڻ�ȡ�����е�Ԫ�ء� 	
	
 �ڲ��ࣺ 
 
�ڲ���ĺô��� �ڲ������ֱ�ӷ����ⲿ��ĳ�Ա��
 
 */

interface MyList{
	
	List subList(int fromIndex, int toIndex);
}






public class Demo12 {
	
	public static void main(String[] args) {
		/*Collections.sort(new ArrayList());
		Collections.sort(new LinkedList());*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(19);
		list.add(12);
		list.add(6);
		
		Iterable<Integer> it = (Iterable<Integer>) list.iterator();
		
		List<Integer> list2 = list.subList(1, 3);
		
		
	}

}
