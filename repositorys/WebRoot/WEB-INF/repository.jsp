<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>知识库</title>
	<link rel="stylesheet" type="text/css" href="../jquery-easyui-1.4.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../jquery-easyui-1.4.3/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../jquery-easyui-1.4.3/demo/demo.css">
	<script type="text/javascript" src="../jquery-easyui-1.4.3/jquery.min.js"></script>
	<script type="text/javascript" src="../jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
	<script type="text/javascript">
	</script>
	
</head>
<body>
    <from action="repository/login" method="POST">
	<div style="margin:20px 0;"></div>
	<div class="easyui-panel" style="padding:5px">
		<ul class="easyui-tree">
			<li>
				<span>知识库</span>
					<ul>
					    <c:forEach items="${knowledgeTypeList}" var="knowledgeType">
						   <li data-options="state:'closed'"><span>${knowledgeType.typeName}</span></li>
					    </c:forEach>
				    </ul>	
			</li>
		</ul>
	</div>
	<a href="add"><input type="button" value="添加"></a>&nbsp;&nbsp;&nbsp;
	<a href="update"><input type="button" value="修改"></a>&nbsp;&nbsp;&nbsp;
    <a href="select"><input type="button" value="查询"></a>&nbsp;&nbsp;&nbsp;
    <a href="http://localhost:8080/repositorys/repository/delect"><input type="button" value="删除"></a>
    </from>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#dlg').dialog('open')"></a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#dlg').dialog('close')">Close</a>
	</div>
	<div id="dlg" class="easyui-dialog" title="Basic Dialog" data-options="iconCls:'icon-save'" style="width:400px;height:200px;padding:10px">
		The dialog content.
	</div>
    
    
	
    
</body>
</html>

  