<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action ="Hello_input.jsp" method ="post">	
	이름을 입력하시오 ==><input type ="text" name="user_name">
	<input type = "submit" value ="확인">
	</form>
	
	<%
	request.setCharacterEncoding("euc-kr");
	String name = request.getParameter("user_name");
	if(name != null){
		
		%>		
		안녕하세요. <%= name %>입니다!
		<%
		
	}
	
	%>

</body>
</html>