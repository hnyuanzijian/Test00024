package com.yuanzijian.review;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
��������û���������ͱ���ָ��Ķ���ͳ���Ϊ��������

�����ڲ��ࣺû����������ͳ���Ϊ�����ڲ��ࡣ

�����ڲ���ʹ��ǰ�᣺ ������ڼ̳л���ʵ�ֹ�ϵ��

��Ϊ�����ڲ���û�����������Դ��������ڲ�������ʱ��ͱ���Ҫ����������������ֻ��������ӿڵ������������� 
���������ڲ���ֻ������û��������������һ�ų�Ա���Ǿ߱��ġ�


�����ڲ����Ӧ�ó����� ��Ҫ����Ϊ��������ʹ�á�

 */

interface Dao{
	
	public void add();
}

class Outer{
	
	public void print(){
		new Dao(){ //���ﲻ�Ǵ����ӿ� �Ķ����Ǵ�����Daoʵ����Ķ��󣬵����������һ�������ڲ�����ѣ�û�����������˸��ӿ� �����ֶ��ѡ�
			//�������о�д�����ڲ���ĳ�Ա��
			int  num =10;
			
			@Override
			public void add() {
				System.out.println("���ѧ�� ..");
			}
		}.add();
		
	}
}




public class Demo13 {

	public static void main(String[] args) {
		
		/*Outer outer = new Outer();
		outer.print();*/
		
		JButton button = new JButton("aa");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aaa");
				
			}
		});
		
		
	}
	
}
