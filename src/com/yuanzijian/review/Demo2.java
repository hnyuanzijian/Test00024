package com.yuanzijian.review;
/*

continue: ��������ѭ����䣬������һ��ѭ����

continue�����÷�Χ�� ֻ��������ѭ����䡣

һ��ִ����continue��䣬��ô��ѭ������continue֮���ѭ�� �������ִ�С�

break: ���ڽ���һ��ѭ����������һ��switch���.

break���÷�Χ�� ֻ������ѭ����������switch��䡣
 
return
 
 */


public class Demo2 {

	public static void main(String[] args) {
		/*
		 * continue
		 * for(int i = 0 ; i<5 ; i++){
			if(i==1){
				continue;
			}

			System.out.println("i="+i);
		}
		*/
		
		//break
		/*outer:for(int j = 0 ; j<2; j++){ // j=0  j=1
			inner:for(int i = 0 ; i<3 ; i++){ //i=0
				System.out.println("hello world");
				break outer; //������ǰ���ڵ�ѭ���� �����ϱ�ʶ��ʹ�ã���������������forѭ����
			}
		}*/
		
		
		for(int i = 0 ; i<3 ; i++){
			System.out.println("hello world");
			return;
		}
		System.out.println("����");

	}	

	
	
}
