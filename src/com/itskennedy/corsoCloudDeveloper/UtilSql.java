package com.itskennedy.corsoCloudDeveloper;

import java.sql.Connection;
import java.sql.SQLException;

public class UtilSql {

	public static void caricaDriver(String nomeDriver) throws ClassNotFoundException {
		Class.forName(nomeDriver);
	}
	
	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
		}
	}
	
}
