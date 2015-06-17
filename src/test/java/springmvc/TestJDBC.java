package springmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestJDBC {
	

	@Test
	public void testJdbc() throws SQLException{
		ApplicationContext ac =  new ClassPathXmlApplicationContext("springmvc-mybatis.xml");
		ComboPooledDataSource c = (ComboPooledDataSource) ac.getBean("readdataSource");
		Connection conn = c.getConnection();
		String sql = "select * from user";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/springmvc", "root", "root");
		ApplicationContext ac =  new ClassPathXmlApplicationContext("springmvc-mybatis.xml");
		ComboPooledDataSource c = (ComboPooledDataSource) ac.getBean("readdataSource");
		Connection conn = c.getConnection();
		String sql="update user set age=10 where id=1 ";
		PreparedStatement ps=conn.prepareStatement(sql);
		
		try {
			int rs=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
