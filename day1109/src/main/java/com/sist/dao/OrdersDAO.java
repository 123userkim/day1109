package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sist.vo.OrdersVO;

public class OrdersDAO {
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String userName="c##madang";
	String password ="madang";
	
	//고객번호를 매개변수로 전달받아서 그 고객의 모든 주문내역을 ArrayList로 반환하는 메소드를 정의함
	public ArrayList<OrdersVO> searchOrders(int custid){
		
		ArrayList<OrdersVO>list = new ArrayList<OrdersVO>();
		
		String sql = "select * from orders where custid = ?";  //?자리에 매개변수로 전달받은 custid
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;		
		
		try {
			Class.forName(driver);
			
			conn= DriverManager.getConnection(url, userName, password);
			pstmt = conn.prepareStatement(sql);
			//?에 설정하고자하는 값을 설정해줘야함
			pstmt.setInt(1, custid);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new OrdersVO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5)));
			}
			
		}catch(Exception e) {
			System.out.println("예외발생 : "+e.getMessage());
		}finally {
			
			try{
				//close메소드도 예외가 존재함
				if(rs !=null) {
					rs.close();
				}if(conn != null) {
					conn.close();
				}if(pstmt !=null) {
					pstmt.close();
				}
				
			}catch(Exception e) {
				System.out.println("예외발생 : "+e.getMessage());
			}
		}
		
		return list;
		
	}
	

}
