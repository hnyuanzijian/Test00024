package com.yuanzijian.tcp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

/*
1. ��дһ������˿��Ը�����ͻ��˷���ͼƬ�� �����̣߳�

*/
public class ImageServer extends Thread {
	
	Socket socket ;
	
	//ʹ�øü��������ڴ洢ip��ַ�ġ�
	static HashSet<String> ips = new HashSet<String>();
	
	public  ImageServer(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			//��ȡ��socket���������
			OutputStream outputStream = socket.getOutputStream();
			//��ȡͼƬ������������
			FileInputStream fileInputStream = new FileInputStream("F:\\��Ů\\3.jpg");
			//��ȡͼƬ���ݣ�������д��
			byte[] buf = new byte[1024];
			int length = 0 ; 
			while((length = fileInputStream.read(buf))!=-1){
				
				outputStream.write(buf,0,length);
			}
			String ip = socket.getInetAddress().getHostAddress();   // socket.getInetAddress() ��ȡ�Է���IP��ַ
			if(ips.add(ip)){
				System.out.println("��ϲ"+ip+"ͬѧ�ɹ����أ���ǰ���ص������ǣ�"+ ips.size());
			}
			
			
			
			//�ر���Դ
			fileInputStream.close();
			socket.close();
		}catch (IOException e) {
			
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		//����tcp�ķ��� ,����Ҫ����һ���˿�
		ServerSocket serverSocket  = new ServerSocket(9090);
		while(true){
			//�����û������ӡ�
			Socket socket = serverSocket.accept();
			new ImageServer(socket).start();
			
		}
	}

}
