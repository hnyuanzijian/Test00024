package com.yuanzijian.tcp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//����ͼƬ�Ŀͻ���
public class ImageClient {

	public static void main(String[] args) throws Exception{
		//����tcp�ķ���
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		//��ȡsocket������������
		InputStream inputStream = socket.getInputStream();
		//��ȡ�ļ������������
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\3.jpg");
		//�߶���д
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length = inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//�ر���Դ
		fileOutputStream.close();
		socket.close();
		
	}
	
}
