<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>�ֹ���ȡ��֤��</title>
    
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
    <h1>Ͷ������Ϣ¼��</h1>
    <table>
    <tr style="height:30"><td style="width:150">���֤��</td><td><input style="width:150" id="id"></td></tr>
    <tr style="height:30"><td style="width:150">����</td><td><input style="width:80" id="name"></td></tr>
    <tr style="height:30"><td style="width:150">�Ա�</td><td><select id="gerder">
    <option value="">--��ѡ��--</option>
    <option value="1">��</option>
    <option value="2">Ů</option><option value="3">δ֪</option></select></td></tr>
    <tr style="height:30"><td style="width:150">����</td><td>
    <select id="nation">
       <option value="">--��ѡ��--</option>
            <option value="01">
      				��</option>
      			 <option value="02">
      				�ɹ�</option>
      			 <option value="03">
      				��</option>
      			 <option value="04">
      				��</option>
      			 <option value="05">
      				ά���</option>
      			 <option value="06">
      				��</option>
      			 <option value="07">
      				��</option>
      			 <option value="08">
      				׳</option>
      			 <option value="09">
      				����</option>
      			 <option value="10">
      				����</option>
      			 <option value="11">
      				��</option>
      			 <option value="12">
      				��</option>
      			 <option value="13">
      				��</option>
      			 <option value="14">
      				��</option>
      			 <option value="15">
      				����</option>
      			 <option value="16">
      				����</option>
      			 <option value="17">
      				������</option>
      			 <option value="18">
      				��</option>
      			 <option value="19">
      				��</option>
      			 <option value="20">
      				����</option>
      			 <option value="21">
      				��</option>
      			 <option value="22">
      				�</option>
      			 <option value="23">
      				��ɽ</option>
      			 <option value="24">
      				����</option>
      			 <option value="25">
      				ˮ</option>
      			 <option value="26">
      				����</option>
      			 <option value="27">
      				����</option>
      			 <option value="28">
      				����</option>
      			 <option value="29">
      				�¶�����</option>
      			 <option value="30">
      				��</option>
      			 <option value="31">
      				���Ӷ�</option>
      			 <option value="32">
      				����</option>
      			 <option value="33">
      				Ǽ</option>
      			 <option value="34">
      				����</option>
      			 <option value="35">
      				����</option>
      			 <option value="36">
      				ë��</option>
      			 <option value="37">
      				����</option>
      			 <option value="38">
      				����</option>
      			 <option value="39">
      				����</option>
      			 <option value="40">
      				����</option>
      			 <option value="41">
      				������</option>
      			 <option value="42">
      				ŭ</option>
      			 <option value="43">
      				���α��</option>
      			 <option value="44">
      				����˹</option>
      			 <option value="45">
      				���¿�</option>
      			 <option value="46">
      				����</option>
      			 <option value="47">
      				����</option>
      			 <option value="48">
      				ԣ��</option>
      			 <option value="49">
      				��</option>
      			 <option value="50">
      				������</option>
      			 <option value="51">
      				����</option>
      			 <option value="52">
      				���״�</option>
      			 <option value="53">
      				����</option>
      			 <option value="54">
      				�Ű�</option>
      			 <option value="55">
      				���</option>
      			 <option value="56">
      				��ŵ</option>
      			 <option value="57">
      				����</option>
      			 <option value="58">
      				���Ѫͳ</option>
</select>
    </td></tr>
    <tr style="height:30"><td style="width:150">��ַ</td><td><input style="width:268" id="address"></td></tr>
    <tr style="height:30"><td style="width:150">��Ч��ʼʱ��</td><td><input style="width:80" id="start_date">����ʾ����20141122</td></tr>
    <tr style="height:30"><td style="width:150">��Ч����ʱ��</td><td><input style="width:80" id="end_date">����ʾ����20341122</td></tr>
    <tr style="height:30"><td style="width:150">��֤����</td><td><input style="width:150" id="issuer"></td></tr>
    <tr style="height:30"><td style="width:150">�ֻ���</td><td><input style="width:80" id="phone"></td></tr>
    </table>
    <h1>����������Ϣ¼��&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:tong1()">ͬ��������</a></h1>
    <table>
    <tr style="height:30"><td style="width:150">���֤��</td><td><input style="width:150" id="id1"></td></tr>
    <tr style="height:30"><td style="width:150">����</td><td><input style="width:80" id="name1"></td></tr>
    <tr style="height:30"><td style="width:150">�Ա�</td><td><select id="gerder1">
    <option value="">--��ѡ��--</option>
    <option value="1">��</option>
    <option value="2">Ů</option><option value="3">δ֪</option></select></td></tr>
    <tr style="height:30"><td style="width:150">����</td><td>
    <select id="nation1">
    <option value="">--��ѡ��--</option>
            <option value="01">
      				��</option>
      			 <option value="02">
      				�ɹ�</option>
      			 <option value="03">
      				��</option>
      			 <option value="04">
      				��</option>
      			 <option value="05">
      				ά���</option>
      			 <option value="06">
      				��</option>
      			 <option value="07">
      				��</option>
      			 <option value="08">
      				׳</option>
      			 <option value="09">
      				����</option>
      			 <option value="10">
      				����</option>
      			 <option value="11">
      				��</option>
      			 <option value="12">
      				��</option>
      			 <option value="13">
      				��</option>
      			 <option value="14">
      				��</option>
      			 <option value="15">
      				����</option>
      			 <option value="16">
      				����</option>
      			 <option value="17">
      				������</option>
      			 <option value="18">
      				��</option>
      			 <option value="19">
      				��</option>
      			 <option value="20">
      				����</option>
      			 <option value="21">
      				��</option>
      			 <option value="22">
      				�</option>
      			 <option value="23">
      				��ɽ</option>
      			 <option value="24">
      				����</option>
      			 <option value="25">
      				ˮ</option>
      			 <option value="26">
      				����</option>
      			 <option value="27">
      				����</option>
      			 <option value="28">
      				����</option>
      			 <option value="29">
      				�¶�����</option>
      			 <option value="30">
      				��</option>
      			 <option value="31">
      				���Ӷ�</option>
      			 <option value="32">
      				����</option>
      			 <option value="33">
      				Ǽ</option>
      			 <option value="34">
      				����</option>
      			 <option value="35">
      				����</option>
      			 <option value="36">
      				ë��</option>
      			 <option value="37">
      				����</option>
      			 <option value="38">
      				����</option>
      			 <option value="39">
      				����</option>
      			 <option value="40">
      				����</option>
      			 <option value="41">
      				������</option>
      			 <option value="42">
      				ŭ</option>
      			 <option value="43">
      				���α��</option>
      			 <option value="44">
      				����˹</option>
      			 <option value="45">
      				���¿�</option>
      			 <option value="46">
      				����</option>
      			 <option value="47">
      				����</option>
      			 <option value="48">
      				ԣ��</option>
      			 <option value="49">
      				��</option>
      			 <option value="50">
      				������</option>
      			 <option value="51">
      				����</option>
      			 <option value="52">
      				���״�</option>
      			 <option value="53">
      				����</option>
      			 <option value="54">
      				�Ű�</option>
      			 <option value="55">
      				���</option>
      			 <option value="56">
      				��ŵ</option>
      			 <option value="57">
      				����</option>
      			 <option value="58">
      				���Ѫͳ</option>
</select>
    </td></tr>
    <tr style="height:30"><td style="width:150">��ַ</td><td><input style="width:268" id="address1"></td></tr>
    <tr style="height:30"><td style="width:150">��Ч��ʼʱ��</td><td><input style="width:80" id="start_date1">����ʾ����20141122</td></tr>
    <tr style="height:30"><td style="width:150">��Ч����ʱ��</td><td><input style="width:80" id="end_date1">����ʾ����20341122</td></tr>
    <tr style="height:30"><td style="width:150">��֤����</td><td><input style="width:150" id="issuer1"></td></tr>
    <tr style="height:30"><td style="width:150">�ֻ���</td><td><input style="width:80" id="phone1"></td></tr>
    </table>
    <table>
   <tr style="height:30">
   <td style="width:150"><front color="red">Ӫҵ��</front></td>
         <td><select id="ting" >
               <option value="0">--��ѡ��--</option>
               <option value="1">����</option>
               <option value="2">����</option>
               <option value="3">����</option>
               <option value="4">�˱�����֧��˾</option>
               
                <option value="5">��̨κ��060380</option>
                <option value="6">�˱��ո�297303</option>
                <option value="7">�˱���̨060389</option>
                <option value="8">�˱�����086863</option>
                <option value="9">�˱���ƽ140121</option>
                <option value="10">�˱�����086832</option>
                <option value="11">�˱�����086833</option>
                <option value="12">�˱���ƽ140341</option>
                <option value="13">�˱���ͷ��A110112492</option>
                         <option value="14">�˱���ƽC110100054</option>
                          <option value="15">�˱�����A110002238</option>
                           <option value="16">�˱�����C110100040</option>
                            <option value="17">��ʢ����</option>
                             <option value="18">�˱���ҫ1102680020</option>
                              <option value="19">��ɽ�˱�</option>
               </select>
         </td>
   </tr>
    <tr style="height:30">
         <td style="width:150"></td>
         <td><input style="width:80" id="code">&nbsp;&nbsp;<a href="javascript:getCode('<%=basePath%>');">��ȡ��֤��</a></td>
         </tr>
    <tr style="height:30">
         <td colspan="2"><span style="padding-left:500px"><input type="button" onclick="tijiao('<%=basePath%>')" value="�ϴ���Ϣ"/></span>
         </td></tr>
    </table>
    
</div>

  </body>
</html>
