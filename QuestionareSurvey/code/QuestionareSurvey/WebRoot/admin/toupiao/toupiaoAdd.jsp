<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page isELIgnored="false" %> 
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"%>

<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	    <base target="_self"/>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
        
        <link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
        
        <script language="javascript">
            function add()
            {
              var div1=document.getElementById("div1");
             
              var br=document.createElement("br");
             
              var input=document.createElement("input");
              input.setAttribute("type","text");
              input.setAttribute("name","xuanxiangneirong");
              input.setAttribute("size","60");
              
              var button=document.createElement("button");
              button.setAttribute("type","button");
              button.setAttribute("style","border: 1px solid #ababab;");
              button.setAttribute("value","删除");
              button.onclick=function()
              {
                  div1.removeChild(br);
                  div1.removeChild(input);
                  div1.removeChild(button);
              }
              
              div1.appendChild(br);
              div1.appendChild(input);
              div1.appendChild(button);
          }
          
          
          
          function c()
          {
               if(document.formAdd.title.value=="")
               {
                   alert("请输入题目标题");
                   return false;
               }
               
               document.formAdd.submit();
          }
        </script>
	</head>

	<body leftmargin="1" topmargin="3" background='<%=path %>/img/allbg.gif'>
			<form action="<%=path %>/toupiaoAdd.action" name="formAdd" method="post">
				     <table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
						<tr bgcolor="#E7E7E7">
							<td height="14" colspan="10" background="<%=path %>/img/tbg.gif">&nbsp;题目信息管理&nbsp;</td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="10%" bgcolor="#FFFFFF" align="right">
						         题目标题：
						    </td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						       	 <input type="text" name="title" size="80"/>
						       	 <input type="button" value="添加选项" onclick="add()"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="10%" bgcolor="#FFFFFF" align="right">
						        
						    </td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						    <div id="div1">
	                        </div>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="10%" bgcolor="#FFFFFF" align="right">
						        &nbsp;
						    </td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						    
						       <input type="hidden" name="wenjuan_id" value="<%=request.getParameter("wenjuan_id")%>"/>
						       <input type="button" value="提交" onclick="c()"/>&nbsp; 
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>
