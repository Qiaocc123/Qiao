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
  
  	<form action="repository/updater" >
  	请输入修改的ID<input type="text"  name="typeID" />
  	<table>
  	  <tr><th>分类编号</th><td><input type="text"  name="typeID"  value="${knowledgeType.typeID}"/> </td></tr>
  	  <tr><th>上级编号</th><td><input type="text"  name="parentTypeID" value="${knowledgeType.parentTypeID}"/> </td></tr>
  	  <tr><th>分类名称</th><td><input type="text"  name="typeName" value="${knowledgeType.typeName}"/></td></tr>
  	  <tr>
  			<td colspan="2"><input type="submit" value="修改"> </td>
  		</tr>
  	</table>
  	</form>
  	
    
  </body>
</html>