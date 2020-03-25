<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="<%=path %>/css/base.css" rel="stylesheet" type="text/css">
    <script language='javascript'>
		var preFrameW = '206,*';
		var FrameHide = 0;
		var curStyle = 1;
		var totalItem = 9;
		function ChangeMenu(way){
			var addwidth = 10;
			var fcol = top.document.all.btFrame.cols;
			if(way==1) addwidth = 10;
			else if(way==-1) addwidth = -10;
			else if(way==0){
				if(FrameHide == 0){
					preFrameW = top.document.all.btFrame.cols;
					top.document.all.btFrame.cols = '0,*';
					FrameHide = 1;
					return;
				}else{
					top.document.all.btFrame.cols = preFrameW;
					FrameHide = 0;
					return;
				}
			}
			fcols = fcol.split(',');
			fcols[0] = parseInt(fcols[0]) + addwidth;
			top.document.all.btFrame.cols = fcols[0]+',*';
		}
		
		function logout()
		{
		   if(confirm("确定要退出本系统吗??"))
		   {
			   window.parent.location="<%=path %>/login.jsp";
		   }
		}
    </script>
  </head>
  
  <body bgColor='#fff5ee' style="margin: 0;padding: 0">
	<table width="100%" border="0" cellpadding="0" cellspacing="0" >
	  <tr>
	    <td width='90%' align="center" height="80" style="font-size:35px; color:#4798b3; font-weight: bold;">&nbsp;&nbsp;沃兹基德问卷</td>
	    <td width='10%' align="right">
	    
	    	<table width="750" border="0" cellspacing="0" cellpadding="0">
		      <tr>
			      <td align="right" height="26" style="padding-right:10px;line-height:26px;font-size:17px">
			        	[<a href="#" onclick="logout()">注销退出</a>]	
			      </td>
	          </tr>
	        </table>
	    </td>
	  </tr>
	</table>
  </body>
</html>
