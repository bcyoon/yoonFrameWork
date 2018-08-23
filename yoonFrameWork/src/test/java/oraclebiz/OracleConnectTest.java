package oraclebiz;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConnectTest {

	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@172.20.10.42:1885:BAQDBP02";
	public static final String USER = "nsshop";
	public static final String PW = "1!nsghatyvld";
	
	// 테스트가 잘되는 버전
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
			
}
