package com.yuanzijian.review;
/*
��װ��

��װ�Ĳ��裺
	1. ˽�л�Ҫ��װ�����ԡ�
	2. ���������ṩ��Ӧ��get������set������

 ��װ�ĺô���
 	1. ������ݵİ�ȫ�ԡ�
 	2. �����򵥡�
 	3�� ����ʵ�֡�
 	
��װһ�����õĳ����������ʵ����ĳ�Ա���ԣ���������ʵ������ȫ������װ������

 */
class Member{
	
	private String name;
	
	private String sex;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex){
		if("��".equals(sex)||"Ů".equals(sex)){
			this.sex = sex;
		}
	}
	
	public String getSex(){
		
		return sex;
	}
	
	
}
public class Demo8 {
	
	public static void main(String[] args) {
		Member m = new Member();
		m.setName("����");
		m.setSex("��");
	}
}
