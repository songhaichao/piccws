<%@ page language="java" import="java.util.*,com.shc.porperties.baseInfo" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
baseInfo bi = new baseInfo();
String account = bi.getAccount();
String password = bi.getPassword();
String url = bi.getUrl();
String sam = bi.getSAM();
String type = bi.getType();
String sam1 = bi.getSAM1();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>更新配置信息</title>
    
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
    <h1>更新配置信息</h1>
    <table>
    <tr style="height:30"><td style="width:150">登陆名</td><td><input style="width:80" id="account" value="<%out.print(account==null?"":account); %>"></td></tr>
    <tr style="height:30"><td style="width:150">登陆密码</td><td><input style="width:80" id="password" value="<%out.print(password==null?"":password );%>"></td></tr>
    <tr style="height:30"><td style="width:150">安贞SAM编号</td><td><input style="width:268" id="sam" value="<%out.print(sam==null?"":sam );%>"></td></tr>
    <tr style="height:30"><td style="width:150">有研SAM编号</td><td><input style="width:268" id="sam1" value="<%out.print(sam1==null?"":sam1 );%>"></td></tr>
    <tr style="height:30"><td style="width:150">PICC服务地址</td><td><input style="width:500" id="url" value="<%out.print(url==null?"":url); %>"></td></tr>
    <tr style="height:30"><td style="width:150">类型</td><td><input style="width80" id="type" value="<%out.print(type==null?"":type); %>"></td></tr>
    </table>
    <table>
    <tr style="height:30">
         <td colspan="2"><span style="padding-left:500px"><input type="button" onclick="saveInfo('<%=basePath%>')" value="保存"/></span>
         </td></tr>
    </table>
</div>
  </body>
</html>
