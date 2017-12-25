package com.neuedu.Mokuai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.neuedu.Dao.User;
import com.neuedu.Interface.Mokuai;
import com.neuedu.Util.DButil;

public class Login implements Mokuai{
	private Connection conn ;
	public Login(Connection conn){
		this.conn = conn;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÓÃ»§Ãû£º");
		String username = sc.next();
		System.out.println("ÇëÊäÈëÃÜÂë£º");
		String password = sc.next();
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		Connection conn = null;
		Statement stat = null;
		ResultSet rs =  null;
		try {
					
			stat = conn.createStatement();
			rs = stat.executeQuery("select count(1) from usermanager  where username = '"+user.getUsername()+"' and password = '"+user.getPassword()+"'");
			rs.next();
			int a = rs.getInt(1);
			if(a >0){
				System.out.println("µÇÂ¼³É¹¦");
			}else{
				System.out.println("µÇÂ¼Ê§°Ü");
				print() ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void used() {
		// TODO Auto-generated method stub
		
	}
	
}
