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
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
	
	<script type="text/javascript">
	    function toupiao_zhutu(toupiao_id)
	    {
	        var strUrl = "<%=path %>/toupiao_zhutu.action?toupiao_id="+toupiao_id;
            var ret = window.showModalDialog(strUrl,"","dialogWidth:1100px; dialogHeight:600px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
	    }
	</script>
  </head>
  
  <body>
        <table cellspacing="2" cellpadding="2" align="center">
		   <tr align="left"><td align="center" style="font-size: 22px;">${requestScope.wenjuan.mingcheng}</td></tr>
		</table>
		
		<c:forEach items="${requestScope.wenjuan.toupiaoList}"  varStatus="sta" var="toupiao">
		<table cellspacing="2" cellpadding="2">
			
			<c:forEach items="${toupiao.xuanxiangList}" var="xuanxiang" varStatus="ss">
			<tr>
				<td>
				    <input type="radio" name="111" style="border: 0px;"/> 
				    ${xuanxiang.xuanxiangneirong}
				    (<font style="color: red">${xuanxiang.piaoshu}</font>)
				</td>
			</tr>
			</c:forEach>
		</table>
		<br/>
		</c:forEach>
  </body>
</html>
