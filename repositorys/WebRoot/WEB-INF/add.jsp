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
    <form action="repository/insert"  method="POST">
  	<table>
  	  <tr><th>分类编号</th><td><input type="text"  name="typeID" /> </td></tr>
  	  <tr><th>上级编号</th><td><input type="text"  name="parentTypeID"/> </td></tr>
  	  <tr><th>分类名称</th><td><input type="text"  name="typeName"/></td></tr>
  	 </table>
  	  <a href="repository"><input type="submit" value="添加"></a>
  	</form>
    
  </body>
</html>
