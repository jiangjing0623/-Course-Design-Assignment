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
    <base target="_self">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	
	<script type="text/javascript">
	    function window.onload()
        {
            var sb = new StringBuffer(); 
            <c:forEach items="${requestScope.wenjuan.toupiaoList}" var="toupiao">
                sb.append(${toupiao.id});
            </c:forEach>
            document.getElementById("xxxxx").value=sb.toString();
        }
	    
	    
	    function check()
        {
            <s:if test="#session.user==null">
                alert("请先登录");
            </s:if>
            <s:else>
		        //alert(document.getElementById("xxxxx").value);
                document.form1.submit();
			</s:else>
        }
	    
	    function StringBuffer()
        { 
		   this._strs = new Array; 
		} 
		StringBuffer.prototype.append = function (str) 
		{ 
		   this._strs.push(str); //添加
		} 
		StringBuffer.prototype.pop = function (str) 
		{ 
		   this._strs.pop(str); //删除最后一个
		} 
		StringBuffer.prototype.toString = function()
	    { 
		   return this._strs.join(","); 
		}
	</script>
	
	
  </head>
  
  <body>
        <form action="<%=path %>/wenjuan_canyu.action" name="form1" method="post">
        <table cellspacing="2" cellpadding="2" align="center">
		   <tr align="center">
		   <td align="center" style="font-size: 22px;">
		   ${requestScope.wenjuan.mingcheng}
		   </td>
		   </tr>
		</table>
		
		<c:forEach items="${requestScope.wenjuan.toupiaoList}"  varStatus="sta" var="toupiao">
		<!-- 显示填写问卷调查网页 -->
		<table cellspacing="2" cellpadding="2">
			<tr>
				<td colspan="2">
					${sta.index+1 }：${toupiao.title }
				</td>
			</tr>
			
			<c:forEach items="${toupiao.xuanxiangList}" var="xuanxiang" varStatus="ss">
			
			<tr>
				<td>
				    <input type="radio" name="${toupiao.id}" value="${xuanxiang.id}" style="border: 0px;"/>${xuanxiang.xuanxiangneirong}<br/>
				</td>
			</tr>
			</c:forEach>
		</table>
		<br/>
		</c:forEach>
		
		<table width="99%" border="0" cellpadding="2" cellspacing="1" bgcolor="#FFFFFF" align="center" style="margin-top:8px">
		     <tr align='center' bgcolor="#FFFFFF" height="22">
			     <td width="100%" bgcolor="#FFFFFF" align="left">
			          <input type="hidden" name="xxxxx" id="xxxxx" value="">
			          <input type="button" value="提交" onclick="check()"/>&nbsp; 
			     </td>
			 </tr>
      	</table>
      	</form>
  </body>
</html>
