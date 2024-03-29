<%@page import="com.sist.vo.OrdersVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.OrdersDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="SearchOrders.jsp" method="post">
		고객번호를 입력하세요 ==> <input type="text" name="custid">
		<input type="submit" value="검색">
	</form>
	
	<%
		if(request.getParameter("custid") != null){
			int custid = Integer.parseInt( request.getParameter("custid"));
			OrdersDAO dao = new OrdersDAO();
			ArrayList<OrdersVO> list = dao.searchOrders(custid);
			%>
			<table border="1">
				<tr>
					<td>주문번호</td>
					<td>고객번호</td>
					<td>도서번호</td>
					<td>구매금액</td>
					<td>구매날짜</td>
				</tr>
				<%
					for(OrdersVO o:list){
						%>
							<tr>
								<td><%= o.getOrderid() %> </td>
								<td><%= o.getCustid() %> </td>
								<td><%= o.getBookid() %> </td>
								<td><%= o.getSaleprice() %> </td>
								<td><%= o.getOrderdate() %> </td>
							</tr>
						<%
					}
				
				%>
				
			</table>
			<%
		}
	%>
</body>
</html>