package com.yuanzijian.review;
/*
�̣߳�

���̵߳Ĵ��ڵ����壺 �����һ�������������������ͬʱִ�С�

���̵߳Ĵ�����ʽ��
	
	��ʽһ:  �̳�Thread��
		1. �Զ���һ����̳�Thread.
		2. ��дThread��run���������Զ����̵߳�����������run�����ϡ�
		3. ����Thread���������󣬲��ҵ���start���������̡߳�
	
	
	��ʽ���� ʵ��Runnable�ӿڡ���
		1. �Զ���һ����ʵ��Runnable�ӿ�.
		2. ʵ��Runnable��run���������Զ����̵߳�����������run�����ϡ�
		3. ����Runnableʵ����Ķ���
		4. ����Thread�Ķ���Ȼ���Runnableʵ����Ķ�����Ϊ�������ݡ�
		5. ����Thread�����start���������̡߳�

java�е�ͬ�����ƣ�

�����̰߳�ȫ����ĸ���ԭ��
	1. �������������������ϵ��̹߳�������Դ��
	2. ������Դ�Ĵ�����������䡣
	
	
	1. ͬ�������
		
		ͬ�������ĸ�ʽ��
			synchronized(������){
				��Ҫ��ͬ���Ĵ����...
			}
	ͬ�������Ҫע���ϸ�ڣ�
		1.���������������Ķ���
		2. ��������� �Ƕ��̹߳������Դ����������ס��
		3. û���̰߳�ȫ�����ʱ��Ҫʹ��������Ϊ�ᵼ��Ч�ʽ��͡�
		4. ����sleep�����������ͷ������󣬵��ǵ���wait�������߳̾ͻ��ͷ�������
			
	2. ͬ������
			���η� synchronized ����ֵ���� ������(�β��б�..){
			
			}
	ע�⣺ 
		1. ͬ���������������ǲ�������ģ��Ǿ�̬ͬ����������������this���󣬾�̬�������������ǵ�ǰ�ֽ������
		2. ͬ������������������ָ�����ǹ̶��ġ�

 */
class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}




class MyThread extends Thread{
	
	@Override
	public void run() {
		//���Զ����̵߳�����������д�������
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	 }
}

public class Demo14  {
	
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start(); //�������Զ�����̡߳��߳�һ�������ͻ�ִ��run�����еĴ���顣
		
		
		MyThread2 thread2 = new MyThread2();
		//����Thread�Ķ���
		Thread t = new Thread(thread2);
		//����Thread�����start����
		t.start();
		
	}
}
