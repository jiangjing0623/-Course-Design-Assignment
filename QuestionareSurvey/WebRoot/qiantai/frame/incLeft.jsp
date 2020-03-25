<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

  <div class="left_row">
    <s:if test="#session.user==null">
  			 欢迎您：<s:property value="#session.user.userName"/> &nbsp;&nbsp;&nbsp;&nbsp;
  			 </s:if>
		    <s:else>
			    <a href="<%=path %>/userLogout.action"><font >安全退出</font></a>
			    </s:else>
	
	<div class="left_row">
	    <div class="list">
	        <div class="list_bar">沃兹基德公告</div>
	        <div class="list_content">
	            <div id="div"> 
	            
	            <!-- strust 在页面中直接调用Action, -->
					<s:action name="gonggaoQian5" executeResult="true" flush="true"></s:action>
		        </div>
		    </div>
	    </div>
	</div>
	
  </body>
</html>
