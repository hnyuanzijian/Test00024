package com.yuanzijian.review;

class Person{

	int id;
	
	String name;

	@Override
	public String toString() {
		return "��ţ�"+this.id+" ������"+this.name;
	}
	
}

public class Demo6 {
	
	public static void main(String[] args) {
		Person p  = new Person();
		p.id= 110;
		p.name = "����";
				
		System.out.println(p);
		
	}
	
}
