<%@ page language="java" import="java.util.*,com.shc.db.DButils,com.shc.bean.personBean" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String pageNumber =  request.getParameter("pageNumber");
DButils DButils = new DButils();
List list =  DButils.QueryAllUser("","","","");
List list1 =  DButils.QueryUser("","","","",1);
int pageSize = list.size()/10;
if(list.size()%10>0){
	pageSize++;
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>�û���Ϣ��ѯ</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="<%=basePath%>js/jquery-1.9.1.min.js" type="text/javascript" ></script>
	<script src="<%=basePath%>js/demo.js" type="text/javascript" ></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
<!--
body,table{
    font-size:12px;
}
table{
    table-layout:fixed;
    empty-cells:show; 
    border-collapse: collapse;
    margin:0 auto;
}
td{
    height:20px;
}
h1,h2,h3{
    font-size:12px;
    margin:0;
    padding:0;
}

.title { background: #FFF; border: 1px solid #9DB3C5; padding: 1px; width:90%;margin:20px auto; }
    .title h1 { line-height: 31px; text-align:center;  background: #2F589C url(th_bg2.gif); background-repeat: repeat-x; background-position: 0 0; color: #FFF; }
        .title th, .title td { border: 1px solid #CAD9EA; padding: 5px; }

table{
    border:1px solid #9db3c5;
    color:#666;
}
table th {
    background-image: url(images/user/1.gif);
    background-repeat::repeat-x;
    height:30px;
    color:#fff;
}
table td{
    border:1px solid #cad9ea;
    padding:0 2px 0;
}
table th{
    border:1px solid #a7d1fd;
    padding:0 2px 0;
}
table tr.a1{
    background-color:#e8f3fd;
}


-->
</style>
  </head>
  
  <body>
<div class="title">
    <h1>�û���Ϣ��ѯ</h1>
    <table><tr style="height:30"><td style="width:250">���֤��<input style="width:150" id="id"></td>
    <td style="width:180">�ֻ���<input style="width:80" id="phone"></td><td style="width:160">����<input style="width:80" id="name"></td>
    <td style="width:160">����״̬<select id="chudan">
    <option value="0">--��ѡ��--</option>
    <option value="δ����">δ����</option>
    <option value="�ѳ���">�ѳ���</option>
    </select></td>
    <td>
    <input type="button" onclick="query('<%=basePath%>')" value="��ѯ"/>
    </td>
    </tr>
    </table>
</div>
<input type="hidden" id="pageNumber" value="1"/>
<input type="hidden" id="pageSize" value="<%=pageSize%>"/>
    <table width="90%"  border="1" >
  <thead><th width="10%">�ϴ�ʱ��</th><th width="5%">����</th><th width="10%">���֤��</th><th width="5%">�Ա�</th><th width="10%">�ֻ���</th><th width="30%">סַ</th><th width="10%">SAM���</th><th width="10%">У����</th><th width="5%">״̬</th><th width="5%">����</th></thead>
  <tbody id="content">
   <%

   for(int i=0;i<list1.size();i++){
	   if(i%2==0){
	   %><tr class="a1"><%
	    }else{
	    	%><tr><%	
	    }
	   personBean pb =(personBean)list1.get(i);
	   %><td><%
	   out.print(pb.getOp_time());
	   %></td><%
	   %><td><%
	   out.print(pb.getName());
	   %></td><%
	   %><td><%
	   out.print(pb.getId_card());
	   %></td><%
	   %><td><%
	   out.print(pb.getGender());
	   %></td><%
	   %><td><%
	   out.print(pb.getPhone_number());
	   %></td><%
	   %><td><%
	   out.print(pb.getAddress());
	   %></td><%
	   %><td><%
	   out.print(pb.getCustomer_type());
	   %></td><%
	   %><td><%
	   out.print(pb.getCode());
	   %></td><%
	   %><td><%
	   out.print(pb.getStatus()==null?"δ����":"�ѳ���");
	   %></td><%
	   %><td>
	   <input type="button" value="����" onclick="chudan('<%=basePath%>','<%
	   out.print(pb.getCode());
	   %>')"/>
	   <%
	   %></td><%
	   %></tr><%
   } %>
   </tbody>
   <tr style="height:30"><td colspan=8>
   <div style="width:90%;float:left;">
   <div style="width:50%;float:left;padding-left:20px">
   <a href="javascript:left('<%=basePath%>')" >��һҳ</a>
   &nbsp;&nbsp;&nbsp;<a href="javascript:right('<%=basePath%>')" >��һҳ</a>
   &nbsp;&nbsp;&nbsp;<a href="javascript:go('<%=basePath%>')" >goto</a><input id="page" style="width:20px;height:15px"/>ҳ
   </div>
   <div style="width:50%;float:left;text-align:right">
   ��<span id="pagSize"><%=pageSize %></span>ҳ����<span id="count"><%out.print(list.size());%></span>����¼����ǰ��<span id="currentPageNumber">1</span>ҳ
   </div>
   </div>
   </td>
   </tr>
   </table>
  </body>
</html>
