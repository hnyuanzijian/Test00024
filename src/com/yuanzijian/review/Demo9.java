package com.yuanzijian.review;
/*
�������飺���������ͳһ�ĳ�ʼ��������

Ӧ�ó����� ��δ�����������ʱ����Ҫ����ĳ������Ϊ�ö�����г�ʼ��ʱ����ʱ��Ϳ���ʹ�ù������顣

��̬�����:

��̬������Ǿ�̬������������౻���ص��ڴ��ʱ��ִ�еġ�


��̬������Ӧ�ó����� �Ժ���Ҫ����׼��һ����Ŀ�ĳ�ʼ�������� 
	���磺 �����������ļ��ж�ȡ���ݿ��û��������롣


 */

class Baby{
	
	int id;
	
	String name;
	
	//��������Ĵ�����ʵ���ڹ��캯����ִ�еġ�	
	{
		
		cry();
	}
	
	static{
		System.out.println("��̬�����ִ����...");
	}

	public Baby(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public Baby(){
		
	}
	
	public void cry(){
		System.out.println("��...");
	}
	
	@Override
	public String toString() {
		return " ��ţ�"+this.id+" ������"+ this.name;
	} 
}




public class Demo9 {
	
	public static void main(String[] args) {
		Baby b1 = new Baby();
		Baby b2 = new Baby(110, "����");
	}

}
	