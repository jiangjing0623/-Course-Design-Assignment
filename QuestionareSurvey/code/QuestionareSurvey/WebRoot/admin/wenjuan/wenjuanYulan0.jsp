<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/interface/dwrService.js'> </script>
        <script type="text/javascript">
			   function firstDwr()
			   { 
			       var id="<%=request.getParameter("id") %>";
			       dwrService.getForwardHTMLPage(id,callback);
			   } 
			   function callback(data)
			   {
			      document.getElementById("img1").style.display="none";
			      dwr.util.setValue("result", data, { escapeHtml:false });
			   }
			   setTimeout(firstDwr,100)
    </script>
        
	</head>

	<body>&nbsp; 
        <img id="img1" src="<%=path %>/img/loading.gif"/>
        <div id="result"></div>
   </body>

</html>

