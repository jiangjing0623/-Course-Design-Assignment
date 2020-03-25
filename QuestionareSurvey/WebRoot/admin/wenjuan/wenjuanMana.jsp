<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
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

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		<script type="text/javascript" src="<%=path %>/js/public.js"></script>
		
        <script language="javascript">
           function wenjuanDel(id)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="<%=path %>/wenjuanDel.action?id="+id;
               }
           }
           
           function wenjuanAdd()
           {
                 var url="<%=path %>/admin/wenjuan/wenjuanAdd.jsp";
				 window.location.href=url;
           }
           
           function toupiaoAdd(id)
           {
                 var strUrl="<%=path %>/admin/toupiao/toupiaoAdd.jsp?wenjuan_id="+id;
				 var ret = window.showModalDialog(strUrl,"","dialogWidth:800px; dialogHeight:500px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
           }
           
           function wenjuanYulan0(id)
           {
                var strUrl = "<%=path %>/admin/wenjuan/wenjuanYulan0.jsp?id="+id;
				var ret = window.showModalDialog(strUrl,"","dialogWidth:900px; dialogHeight:500px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
           }
           
           function wenjuan_jieguo(id)
           {
                var strUrl = "<%=path %>/wenjuan_jieguo.action?id="+id;
                window.location.href=strUrl;
           }
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="33" background="<%=path %>/img/tbg.gif">&nbsp;问卷信息管理&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="5%">序号</td>
					<td width="40%">名称</td>
					<td width="10%">发布时间</td>
					<td width="20%">操作</td>
		        </tr>	
				<c:forEach items="${requestScope.wenjuanList}" var="wenjuan" varStatus="ss">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						${ss.index+1}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${wenjuan.mingcheng}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${wenjuan.shijian}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a style="color: red" href="#" onclick="wenjuanDel(${wenjuan.id})">删除</a>
						<a style="color: red" href="#" onclick="wenjuanYulan0(${wenjuan.id})">问卷预览</a>
						<a style="color: red" href="#" onclick="toupiaoAdd(${wenjuan.id})">添加题目</a>
						<a style="color: red" href="#" onclick="wenjuan_jieguo(${wenjuan.id})">调查结果</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 5px;">
			  <tr>
			    <td>
			      <input type="button" value="添加" style="width: 80px;" onclick="wenjuanAdd()" />
			    </td>
			  </tr>
		    </table>
	</body>
</html>
