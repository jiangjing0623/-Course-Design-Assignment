<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
        <table cellspacing="2" cellpadding="2" align="center">
		   <tr align="center"><td align="center" style="font-size: 22px;">${requestScope.wenjuan.mingcheng}</td></tr>
		</table>
		
		<c:forEach items="${requestScope.wenjuan.toupiaoList}"  varStatus="sta" var="toupiao">
		<table cellspacing="2" cellpadding="2">
			<tr>
				<td colspan="2">
					${sta.index+1 }：${toupiao.title }
				</td>
			</tr>
			<c:forEach items="${toupiao.xuanxiangList}" var="xuanxiang">
			<tr>
				<td>
				    <input type="radio" name="111" style="border: 0px;"/> ${xuanxiang.xuanxiangneirong}<br/>
				</td>
			</tr>
			</c:forEach>
		</table>
		<br/>
		</c:forEach>
  </body>
</html>
