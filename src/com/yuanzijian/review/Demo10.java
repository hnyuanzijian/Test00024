package com.yuanzijian.review;
/*
 instanceof  �ж�ָ���Ķ����Ƿ�����ĳ�����
 
 instanceof ʹ��ǰ�᣺ �жϵĶ�������������ڼ̳л���ʵ�ֵĹ�ϵ��
  
 instanceof ʹ�ø�ʽ��
 		���� instanceof ���
 
 �ж�̬�ſ���ʹ�õ�instanceof�ؼ��֣�
 
 ��Ҫ��Ӧ�ó����� ��������ǿת֮ǰ���жϡ�
 
 */
class Fish extends Animal{
	
}

class  Mouse extends Animal{}


public class Demo10 {

	public static void main(String[] args) {
		/*Fish f = new Fish();
		Animal a = new Animal();
		System.out.println("�������ڶ�������"+  (f instanceof Animal));
		System.out.println("��������������?"+ (a instanceof Fish));*/
		
		Animal a = getAnimal(1);
		if(a instanceof Fish){			
			Fish f =(Fish) a;
		}else if(a instanceof Mouse){
			Mouse m = (Mouse)a;
		}
		
	}
	
	
	public static Animal getAnimal(int i){
		if(i==0){
			return new Fish();
		}else{
			return new Mouse();
		}
	}
	
	
}
