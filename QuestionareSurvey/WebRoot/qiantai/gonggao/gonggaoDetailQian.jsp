<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
		
		<link href="<%=path %>/css/layout.css" type="text/css" rel="stylesheet" />
		
		<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
	    <script type="text/javascript">
	    </script>
	</head>

	<body>
		<jsp:include flush="true" page="/qiantai/frame/incTop.jsp"></jsp:include>
		<div class="page_row">
			<div class="page_main_msg left">		
		        <div class="left_row">
		            <div class="list pic_news">
		  	                <div class="list_bar">&nbsp;
		  	                <A href="<%=path %>/qiantai/default.jsp">返回</A>
		  	                </div>
						  	<div class="ctitle ctitle1"><s:property value="#request.gonggao.gonggaoTitle"/></div>
							<div class="ctitleinfo"><s:property value="#request.gonggao.gonggaoData"/>&nbsp;&nbsp;&nbsp;<%--查看次数：5 次--%></div>
							<div class="pbox"><s:property value="#request.gonggao.gonggaoContent" escape="false"/></div>
				            <div class="page_no">
				                <div class="pg-3">
					                 <%--分页--%>
				                </div>
				            </div>
							<div class="arti_ref">
							    <%--【上一篇】: <a href="#" title="">应需而生 长安铃木全新天语SX4突破升级</a>
				                &nbsp;&nbsp;
				                 【下一篇】: <span>没有了</span>--%>
				            </div>	
		             </div>
		         </div>	
	        </div>
			
			
			<div class="page_other_msg right">
				<jsp:include flush="true" page="/qiantai/frame/incLeft.jsp"></jsp:include>
			</div>
			
		</div>
		
		<div class="foot">
		   <jsp:include flush="true" page="/qiantai/frame/incFoot.jsp"></jsp:include>
	    </div>
	</body>
</html>
