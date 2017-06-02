package com.yuanzijian.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;


/*
2.  ʵ�ֵ�½��ע�� ���ܡ�  
	�ͻ������������ӵ�ʱ�򣬾�Ҫ��ʾ�ͻ�����ѡ���ܡ�
	
	�ͻ���ע���ʱ���û��������붼�Ƿ��͸������ �ģ��������Ҫ�����ݱ��浽����˵��ļ��ϡ�
	
	��½�� ��½��ʱ��ͻ��������û��������뷢�͸�����ˣ��������ҪУ�飬���ؽ�����ͻ��ˡ�
*/

public class LoginClinet {
	
	public static void main(String[] args) throws IOException {		
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		//��ȡsocket�����������
		OutputStreamWriter  socketOut = new OutputStreamWriter(socket.getOutputStream());
		
		//��ȡ��socket������������
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//��ȡ�����̵�����������
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("��ѡ���ܣ� A(��½)  B(ע��)");
			String option = keyReader.readLine();
			if("a".equalsIgnoreCase(option)){
				getInfo(socketOut, keyReader, option);
				//��ȡ��������������Ϣ
				String line = socketReader.readLine();
				System.out.println(line);
			}else if("b".equalsIgnoreCase(option)){
				getInfo(socketOut, keyReader, option);
				//��ȡ��������������Ϣ
				String line = socketReader.readLine();
				System.out.println(line);
			}

		}
		
		
	}

	public static void getInfo(OutputStreamWriter  socketOut,BufferedReader keyReader, String option)
			throws IOException {
		System.out.println("�������û���:");
		String userName = keyReader.readLine();
		System.out.println("���������룺");
		String password = keyReader.readLine();
		String info = option +" "+userName+" "+password+"\r\n";
		socketOut.write(info);
		socketOut.flush();
	}
	
}
