package com.yuanzijian.review;

import java.util.Arrays;

/*
 ð������ �� ���ڵ�����Ԫ�رȽϣ������������� λ�á�
 
 */
 
public class Demo4 {

	public static void main(String[] args) {
		int[] arr = {2,5,10,8,1};  //��ν��������ǽ�һ���������Ԫ�ط��ڶ�Ӧ ��λ���ϡ�
		
		for(int j = 0 ; j<arr.length -1; j++){  // ���Ƶ�������ÿһ�ֶ������ҳ�һ�����ֵ��
			//�����ֵ�������һ��λ��
			for(int i = 0 ; i<arr.length-1-j ; i++){  //���Ƶ������ڵ�����Ԫ�رȽϡ�
				//���ڵ�����Ԫ�رȽ�
				if(arr[i] >arr[i+1]){
					int temp =arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
	/*	//���϶����ڵ����ڶ���λ����
		for(int i = 0 ; i<arr.length-1-1 ; i++){
			//���ڵ�����Ԫ�رȽ�
			if(arr[i] >arr[i+1]){
				int temp =arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		//���������ڵ���������λ����
		for(int i = 0 ; i<arr.length-1-2 ; i++){
			//���ڵ�����Ԫ�رȽ�
			if(arr[i] >arr[i+1]){
				int temp =arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		//�����ķ��ڵ������ĸ�λ����
		for(int i = 0 ; i<arr.length-1-3 ; i++){
			//���ڵ�����Ԫ�رȽ�
			if(arr[i] >arr[i+1]){
				int temp =arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		*/
		
		System.out.println("�����Ԫ�أ� "+Arrays.toString(arr));
		
		
		
	}

}
