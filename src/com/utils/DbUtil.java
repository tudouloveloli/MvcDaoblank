package com.utils;
import java.sql.*;
public class DbUtil {
/*
 * user, password and database
 * */
	private static final String URL="jdbc:mysql://localhost:3306/db_user";
	private static final String USER="root";
	private static final String PASSWORD="wei112303130...";
	
/*	
 * JDBC object
*/
	protected static Statement s=null;
	protected static ResultSet rs=null;
	protected static Connection conn=null;
	/*
	 * database connection
	 * @return conn
	 * */
	public static synchronized Connection getConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	/*
	 * execute INSERT UPADTE DELETE
	 * @param sql statement String type
	 * @return int type 
	 * */
	
	public static int executeUpdate(String sql){
		int result=0;
		try {
			s=getConnection().createStatement();
			result=s.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;	
	}
	/*
	 * execute SELECT 
	 * @param sql statement String type
	 * @return ResultSets
	 * */
	
	public static ResultSet executeQuery(String sql){
		
		try {
			s=getConnection().createStatement();
			rs=s.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return rs;
		
	}
	/*
	 * execute preparedStetement 
	 * @param sql中含有参数的动态SQl语句
	 * @return PreparedStatement对象
	 * */
	public static PreparedStatement executePreparedStatement(String sql){
		
		PreparedStatement ps=null;
		try {
			ps=getConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ps;
		
	}
	/*
	 * 事务回滚
*/
	public static void rollback(){
		
		try {
			getConnection().rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*
	 * 关闭数据库的连接
	 * */
	public static void close(){
		
			try {
				if(rs!=null){
					rs.close();
				}if(s!=null){
					s.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
