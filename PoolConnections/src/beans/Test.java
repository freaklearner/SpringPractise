package beans;

public class Test {

	public static void main(String[] args) {
		org.apache.tomcat.dbcp.dbcp.BasicDataSource bds = new org.apache.tomcat.dbcp.dbcp.BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost/test");
		bds.setUsername("root");
		bds.setPassword("root123");
		bds.setMaxActive(10);
		bds.setMinIdle(5);
		bds.setMaxWait(1000*5);
		
		for(int i=0;i<20000;i++) {
			try {
					java.sql.Connection con = bds.getConnection();
					System.out.println( con +" "+i);
					con.close();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			
			
		}
	}
}

