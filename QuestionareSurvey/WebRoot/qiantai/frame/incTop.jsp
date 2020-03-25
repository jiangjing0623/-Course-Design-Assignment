<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <style type="text/css">
        .Header {background:  #fff5ee repeat-x left top; height: 70px;width: 966px;}
        .HeaderTop {margin: 0px auto;}
    </style>
     <script type="text/javascript">
            function myXinxi()
	        {
	        //从session中取出user的值,并且判断其是否为k
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                var url="<%=path %>/qiantai/userinfo/userXinxi.jsp";
	                var n="";
	                var w="480px";
	                var h="500px";
	                var s="resizable:no;help:no;status:no;scroll:yes";
				    openWin(url,n,w,h,s);
	            </s:else>
	        }
	        
	        function reg()
	        {
	                var url="<%=path %>/qiantai/userinfo/userReg.jsp";
	                var n="";
	                var w="480px";
	                var h="500px";
	                var s="resizable:no;help:no;status:no;scroll:yes";
				    openWin(url,n,w,h,s);
	        }
     </script>
  </head>
  
  <body>
        <div class="Header HeaderTop">
			<br/>
			<font style="font-size: 40px;color: #4798b3;font-weight: bolder;display: block;text-align: center;">沃兹基德问卷<br><br></font>
		</div>
		<div class="topmenu cbody1">
			<ul>
				<li class="thisclass">
					<A href="<%=path %>/qiantai/default.jsp">首页</A>
				</li>
				<li class="thisclass">
					<A target="_blank" href="<%=path %>/qiantai/userinfo/userReg.jsp">免费注册</A>
				</li>
				<li class="thisclass">
					<A target="_blank" href="<%=path %>/login2.jsp">用户登录</A>
				</li>
				<li class="thisclass">
				<a target="_blank"  href="<%=path %>/login.jsp">管理员登录</a>
				</li>
		<!-- 失败的信息功能 -->
				<!--<li class="thisclass">
					<A  href="#" onclick="myXinxi()">我的信息</A>
				</li>
			--></ul>
		</div>
		<form id="searchForm" action="<%=path %>/wenjuan_search.action" method="post">
			<div class="topsearch">
			<!--
	失败的搜索功能
				--><!--<div class="title"></div>
				--><!--<div id="page_search_left">
					<input class="inputText" id="" size="16" onkeypress="if(event.keyCode==13){searchFormSubmit();return false;}" name="mingcheng" type="text" />
				</div>
				<div id="page_search_btn">
					<input type="submit" value="搜索">
				</div>
				-->
				<!--
				
	报时功能
				--><div id="page_search_right">
					<script>
						<!--var day="";
						var month="";
						var ampm="";
						var ampmhour="";
						var myweekday="";
						var year="";
						mydate=new Date();
						myweekday=mydate.getDay();
						mymonth=mydate.getMonth()+1;
						myday= mydate.getDate();
						year= mydate.getFullYear();
						if(myweekday == 0)
						weekday=" 星期日 ";
						else if(myweekday == 1)
						weekday=" 星期一 ";
						else if(myweekday == 2)
						weekday=" 星期二 ";
						else if(myweekday == 3)
						weekday=" 星期三 ";
						else if(myweekday == 4)
						weekday=" 星期四 ";
						else if(myweekday == 5)
						weekday=" 星期五 ";
						else if(myweekday == 6)
						weekday=" 星期六 ";
						document.write(year+"年"+mymonth+"月"+myday+"日 "+weekday);
						//-->
					</script>
				</div>
				<div style="clear: both"></div>
			</div>
		</form>
  </body>
</html>
