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
	
	//����ȣ�� �Ű������� ���޹޾Ƽ� �� ���� ��� �ֹ������� ArrayList�� ��ȯ�ϴ� �޼ҵ带 ������
	public ArrayList<OrdersVO> searchOrders(int custid){
		
		ArrayList<OrdersVO>list = new ArrayList<OrdersVO>();
		
		String sql = "select * from orders where custid = ?";  //?�ڸ��� �Ű������� ���޹��� custid
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;		
		
		try {
			Class.forName(driver);
			
			conn= DriverManager.getConnection(url, userName, password);
			pstmt = conn.prepareStatement(sql);
			//?�� �����ϰ����ϴ� ���� �����������
			pstmt.setInt(1, custid);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new OrdersVO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5)));
			}
			
		}catch(Exception e) {
			System.out.println("���ܹ߻� : "+e.getMessage());
		}finally {
			
			try{
				//close�޼ҵ嵵 ���ܰ� ������
				if(rs !=null) {
					rs.close();
				}if(conn != null) {
					conn.close();
				}if(pstmt !=null) {
					pstmt.close();
				}
				
			}catch(Exception e) {
				System.out.println("���ܹ߻� : "+e.getMessage());
			}
		}
		
		return list;
		
	}
	

}
