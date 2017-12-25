package com.neuedu.Mokuai;

import java.sql.Connection;
import java.util.Scanner;

import com.neuedu.Interface.Mokuai;
import com.neuedu.Util.ScannerUtil;

public class Welcome implements Mokuai{
	private Connection conn ;
	public Welcome(Connection conn){
		this.conn = conn;
	}
	public  void print(){
		System.out.println("��ӭʹ��neuedu�û�����ϵͳ");
		System.out.println("===================");
		System.out.println("�û���¼-------------1");
		System.out.println("�û�ע��-------------2");
		System.out.println("�û��˳�-------------3");		
		used();
	}
	
	public  void used(){
		Scanner sc= new Scanner(System.in);
		String a = null;
		int b = -1;
		while(true){
			a = sc.next();
			b = ScannerUtil.getInt(a,1,3);
			if(b != -1){
				break;
			}
			System.out.println("����������");
			
		}
		switch (b) {
		case 1:
			new Login(conn).print();
			break;
		case 2:
			System.out.println("ע��ɹ�");
			break;
		case 3:
			System.exit(0);;
			break;			
		}
		
		
		
	
		
	}
}
