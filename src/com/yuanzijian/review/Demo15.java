package com.yuanzijian.review;

import java.util.HashSet;
import java.util.Iterator;

/*
 
����

��������
----------| Collection ���м��ϵĸ��ӿ�
----------------| List �����ʵ����List�ӿڼ�����߱����ص㣺 ���򣬿��ظ���
-------------------| ArrayList   �ײ�ʹ��Object����ʵ�ֵġ� �ص㣺 ��ѯ�ٶȿ죬��ɾ����
-------------------| LinkedList  �ײ���ʹ���������������ݽṹʵ�ֵġ� �ص㣺 ��ѯ������ɾ�졣
-------------------| Vector(�˽�)   �ײ�ʹ��Object����ʵ�ֵģ� ʵ����ArrayList��һ����ֻ�������̰߳�ȫ�ģ�����Ч�ʵ͡�

----------------| Set  �����ʵ����Set�ӿڼ�����߱����ص㣺 ���򣬲����ظ���
------------------| HashSet  �ײ�ʹ�õ��ǹ�ϣ��ʵ�ֵġ�  
------------------| TreeSet  �ײ�ʹ�ö�����ʵ�֡� 

˫�м��ϣ�
--------| Map  (ֻ��Ҫ��Map�ӿڵķ���ȫ����ϰһ�μ��ɡ�)
-----------| HashMap  �ײ�ʹ�õ��ǹ�ϣ��ʵ�ֵġ�  
-----------| TreeMap   �ײ�ʹ�ö�����ʵ��
-----------| HashTable���˽⣩

 */
class Book{
	
	String name;
	
	double price;

	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Book b  = (Book)obj;
		return this.name.equals(b.name);
	}
	
	
	@Override
	public String toString() {
		return "[������"+ this.name+" �۸�"+this.price+"]";
	}
}

public class Demo15 {
	
	public static void main(String[] args) {
		//�������ظ����������ڡ�
		HashSet<Book> books = new HashSet<Book>();
		books.add(new Book("����javaweb",34));
		books.add(new Book("java����",78));
	
		//�޸�����
		Iterator<Book> it = books.iterator();
		while(it.hasNext()){
			Book b = it.next();
			if(b.name.equals("java����")){
				b.name = "java���˼��";
			}
		}
		
		//Ϊʲô�޸�����֮����ɾ������?
		books.remove(new Book("java����",78));
		
		System.out.println("���ϵ�Ԫ�أ�"+ books);
		
		
		
		
	}
	
}
