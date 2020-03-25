<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" /><!-- 访问者将无法脱机浏览 -->
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="description" content="This is my page" />	
		<link href="<%=path %>/css/layout.css" type="text/css" rel="stylesheet" />
	    <script type="text/javascript">
	       function wenjuanDetailQian(id)
           {
                var strUrl = "<%=path %>/wenjuanDetailQian.action?id="+id;
				var ret = window.showModalDialog(strUrl,"","dialogWidth:800px; dialogHeight:600px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
           } 
	    </script>
	</head>

	<body>
		<jsp:include flush="true" page="/qiantai/frame/incTop.jsp"></jsp:include>
		<div class="page_row">
			<div class="page_main_msg left">
			     <div class="left_row">
		              <div class="list pic_news">
				          <div class="list_bar">问卷信息列表</div>
				          <div class="list_content" style="height: 445px;">
                              <div class="c1-body">
                              
                                  <s:iterator value="#request.wenjuanList" id="wenjuan">
                                  
                                  <div class="c1-bline" style="padding:7px 0px;">
                                       <div class="f-left">
                                           
                                            <a href="#" onclick="wenjuanDetailQian(<s:property value="#wenjuan.id"/>)"><s:property value="#wenjuan.mingcheng"/></a>
                                       
                                       </div>
                                       <div class="f-right"><s:property value="#wenjuan.shijian"/></div>
                                       <div class="clear"></div>
                                  </div>
                                  </s:iterator>
								  <div class="pg-3">
									   <!--  分页-->
								  </div>		  
						      </div>
						  </div>
					  </div>	
				      <div style="clear:both;"></div>
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
