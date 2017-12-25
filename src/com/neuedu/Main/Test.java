package com.neuedu.Main;

import java.sql.Connection;

import com.neuedu.Mokuai.Welcome;
import com.neuedu.Util.DButil;

public class Test {
	public static void main(String[] args) {
		Connection conn = DButil.getInstance().getConnection();
		new Welcome(conn).print();
	}
}
