package com.yuanzijian.review;
/*
 ����������: ��һ�����г��������� ���������� ��ͬ����������Ϊ���������ء�
 
 �������ص����ã� һ������������Ӧ�Ը��ֲ�ͬ���͵Ĳ�����
 
�������ص�Ҫ��
	1. ������һ�¡�
	2. �β��б�һ�£��βεĸ�����һ�»������βζ�Ӧ �����Ͳ�һ�£�
	3. �뷵��ֵ�����޹ء�
	

������д���Ӹ��������ͬ���ĺ�������Ϊ��������д��

������д����Ҫ���ڼ̳еĹ�ϵ�Ŵ��ڵġ�

������д������ ����Ĺ����޷��������������

������д��Ҫ��
	1. �Ӹ���ĺ��������β��б����һ�¡�
	2. �����Ȩ�����η����� Ҫ���ڻ��ߵ��ڸ����Ȩ�����η���
	3. ����ķ���ֵ���ͱ���ҪС�ڻ��ߵ��ڸ���ķ������͡�
	4. �����׳����쳣���ͱ���ҪС�ڻ��ߵ��ڸ����׳����쳣���͡�
	

 */

class Animal{
}

class Cat extends Animal{}

class Fu{
	
	public Animal eat(int num){
		System.out.println("�����eat����");
		return new Animal();
	}
	
}

class Zi extends Fu{
	
	public Animal eat(int num){
		System.out.println("�����eat����..");
		return new Animal();
	}
}



public class Demo3 {

	public static void main(String[] args) {
		/*int[] arr = {1,2,4};
		double[] arr2 = {2.14,3.14,5.0};
		sort(arr);
		sort(arr2);*/
		
		Zi z = new Zi();
		z.eat(11);
		
		
	}
	
	public static void sort(int[] arr){
		for(int i = 0 ; i< arr.length-1; i++){
			for(int j = i+1 ; j<arr.length ; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
	}
	
	
	public static void sort(double[] arr){
		for(int i = 0 ; i< arr.length-1; i++){
			for(int j = i+1 ; j<arr.length ; j++){
				if(arr[i]>arr[j]){
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
	}
	
	
}
