package com.yuanzijian.review;
/*
 ��Ԫ�����:
 
��Ԫ������ĸ�ʽ��
	 �������ʽ?ֵ1:ֵ2
 
����ϵͳ

 	ѧ��                          �ɷ�
 				   1
 				   0
 
 */
public class Demo1 {
	
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.matches("\\w{6}")?"��ȷ":"����");
		
		int a =3;
		System.out.println(3>a?"��һ��":"�ڶ���");
		
		int temp = 1;
		System.out.println(temp==1?"�ɷ�":"δ�ɷ�");
		
		
	}
	

}
