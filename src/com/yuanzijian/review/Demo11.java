package com.yuanzijian.review;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 �������Ӧ�ó���������һ�������ʱ���������ȷʵ����ĳ����Ϊ������Ŀǰ������Ϊ���ǲ������
 ��ʱ��Ϳ��԰�������Ϊ�����ɳ��� ����Ϊ����ʱ��ʹ�ó���
 
����������ʵ�����е�Ӧ�ó�����
 
����˽�еĳ�Ա���ܱ��̳С� 
 
�̳е����⣺ ��ʽ�̳С� 
 
 */

//����
class Worker{
	
	private String name;
	
	public void setInfo(String name){
		this.name = name;
		System.out.println("������"+ this.name);
	}
	
}

class Teacher extends Worker{
	
}

public class Demo11 {
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		//t.name ="����";
		t.setInfo("����");
		
	}

}
