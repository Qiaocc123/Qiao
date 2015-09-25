<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <base href="<%=basePath%>">
    <title>index</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <form action="repository/selecter"  method="POST">
  	请输入要查询的ID<input type="text"  name="typeID"/>
  	<table>
  	  <tr><td>分类编号</td><td>上级编号</td><td>分类名称</td></tr>
  	  <% session.getAttribute("kt"); %>
  	  <tr><td>${kt.typeID}</td><td>${kt.parentTypeID}</td><td>${kt.typeName}</td></tr>
  	 </table>
  	  <a href="repository"><input type="submit" value="查询"></a>
  	</form>
    
  </body>
</html>
