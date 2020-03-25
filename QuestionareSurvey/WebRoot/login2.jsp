<%@ page language="java"  import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'index.jsp' starting page</title>
		<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<style type="text/css">
            body {background-image: url(img/bg_flower.jpg);}
        </style>
		
		<script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
        
		<script language="javascript">
		 
	        
		 function reg()
	        {
	                var url="<%=path %>/qiantai/userinfo/userReg.jsp";
	                var n="";
	                var w="480px";
	                var h="500px";
	                var s="resizable:no;help:no;status:no;scroll:yes";
				    openWin(url,n,w,h,s);
	        }
	        function login()
	        {
	           if(document.login2.userName.value=="")
	           {
	               alert("请输入用户名");
	               return;
	           }
	           if(document.login2.userPw.value=="")
	           {
	               alert("请输入密码");
	               return;
	           }
	           document.login2.submit();
	        }
	        
		
	    </script>

	</head>

	<body bgColor=lightpink>
	
		<div id="Layer1" style="position:absolute; left:510px; top:247px; width:560px; height:131px; z-index:1">
			<form action="<%=path %>/userLogin.action" name="login2" method="post">
			
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="100%" colspan="2" align="left">
							<font style="font-size: 40px;color: white;font-weight: bolder;display: block;text-align: left">
							    &nbsp;&nbsp;&nbsp;沃兹基德问卷用户登录
				            </font>
						</td>
					</tr>
					<tr>
						<td width="100%" colspan="2" height="20">
							
						</td>
					</tr>
					<tr>
						<td width="15%" height="22">
							<span style="font-size: 12px;">用户:</span>
						</td>
						<td width="85%" height="22">
							<input name="userName" type="text" size="20" style="height:17px; border:solid 1px #bbbbbb">
						</td>
					</tr>
					<tr>
						<td width="15%" height="22">
							<span style="font-size: 12px;">密码:</span>
						</td>
						<td width="85%" height="22">
							<input name="userPw" type="password" size="20" style="height:17px; border:solid 1px #bbbbbb">
						</td>
					</tr>
					<tr>
						<td width="15%" height="22">
							<span style="font-size: 11px;"></span>
						</td>
						<td width="85%" height="22">							
							<input type="button" value="登  录" onclick="login()" style="border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;" />
 						</td>
 						
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
