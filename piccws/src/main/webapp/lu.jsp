<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>手工获取验证码</title>
    
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
    <h1>投保人信息录入</h1>
    <table>
    <tr style="height:30"><td style="width:150">身份证号</td><td><input style="width:150" id="id"></td></tr>
    <tr style="height:30"><td style="width:150">姓名</td><td><input style="width:80" id="name"></td></tr>
    <tr style="height:30"><td style="width:150">性别</td><td><select id="gerder">
    <option value="">--请选择--</option>
    <option value="1">男</option>
    <option value="2">女</option><option value="3">未知</option></select></td></tr>
    <tr style="height:30"><td style="width:150">民族</td><td>
    <select id="nation">
       <option value="">--请选择--</option>
            <option value="01">
      				汉</option>
      			 <option value="02">
      				蒙古</option>
      			 <option value="03">
      				回</option>
      			 <option value="04">
      				藏</option>
      			 <option value="05">
      				维吾尔</option>
      			 <option value="06">
      				苗</option>
      			 <option value="07">
      				彝</option>
      			 <option value="08">
      				壮</option>
      			 <option value="09">
      				布依</option>
      			 <option value="10">
      				朝鲜</option>
      			 <option value="11">
      				满</option>
      			 <option value="12">
      				侗</option>
      			 <option value="13">
      				瑶</option>
      			 <option value="14">
      				白</option>
      			 <option value="15">
      				土家</option>
      			 <option value="16">
      				哈尼</option>
      			 <option value="17">
      				哈萨克</option>
      			 <option value="18">
      				傣</option>
      			 <option value="19">
      				黎</option>
      			 <option value="20">
      				僳僳</option>
      			 <option value="21">
      				佤</option>
      			 <option value="22">
      				畲</option>
      			 <option value="23">
      				高山</option>
      			 <option value="24">
      				拉祜</option>
      			 <option value="25">
      				水</option>
      			 <option value="26">
      				东乡</option>
      			 <option value="27">
      				纳西</option>
      			 <option value="28">
      				景颇</option>
      			 <option value="29">
      				柯尔克孜</option>
      			 <option value="30">
      				土</option>
      			 <option value="31">
      				达斡尔</option>
      			 <option value="32">
      				仫佬</option>
      			 <option value="33">
      				羌</option>
      			 <option value="34">
      				布朗</option>
      			 <option value="35">
      				撒拉</option>
      			 <option value="36">
      				毛南</option>
      			 <option value="37">
      				仡佬</option>
      			 <option value="38">
      				锡伯</option>
      			 <option value="39">
      				阿昌</option>
      			 <option value="40">
      				普米</option>
      			 <option value="41">
      				塔吉克</option>
      			 <option value="42">
      				怒</option>
      			 <option value="43">
      				乌孜别克</option>
      			 <option value="44">
      				俄罗斯</option>
      			 <option value="45">
      				鄂温克</option>
      			 <option value="46">
      				崩龙</option>
      			 <option value="47">
      				保安</option>
      			 <option value="48">
      				裕固</option>
      			 <option value="49">
      				京</option>
      			 <option value="50">
      				塔塔尔</option>
      			 <option value="51">
      				独龙</option>
      			 <option value="52">
      				鄂伦春</option>
      			 <option value="53">
      				赫哲</option>
      			 <option value="54">
      				门巴</option>
      			 <option value="55">
      				珞巴</option>
      			 <option value="56">
      				基诺</option>
      			 <option value="57">
      				其他</option>
      			 <option value="58">
      				外国血统</option>
</select>
    </td></tr>
    <tr style="height:30"><td style="width:150">地址</td><td><input style="width:268" id="address"></td></tr>
    <tr style="height:30"><td style="width:150">有效开始时间</td><td><input style="width:80" id="start_date">输入示例：20141122</td></tr>
    <tr style="height:30"><td style="width:150">有效结束时间</td><td><input style="width:80" id="end_date">输入示例：20341122</td></tr>
    <tr style="height:30"><td style="width:150">发证机关</td><td><input style="width:150" id="issuer"></td></tr>
    <tr style="height:30"><td style="width:150">手机号</td><td><input style="width:80" id="phone"></td></tr>
    </table>
    <h1>被保险人信息录入&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:tong1()">同被保险人</a></h1>
    <table>
    <tr style="height:30"><td style="width:150">身份证号</td><td><input style="width:150" id="id1"></td></tr>
    <tr style="height:30"><td style="width:150">姓名</td><td><input style="width:80" id="name1"></td></tr>
    <tr style="height:30"><td style="width:150">性别</td><td><select id="gerder1">
    <option value="">--请选择--</option>
    <option value="1">男</option>
    <option value="2">女</option><option value="3">未知</option></select></td></tr>
    <tr style="height:30"><td style="width:150">民族</td><td>
    <select id="nation1">
    <option value="">--请选择--</option>
            <option value="01">
      				汉</option>
      			 <option value="02">
      				蒙古</option>
      			 <option value="03">
      				回</option>
      			 <option value="04">
      				藏</option>
      			 <option value="05">
      				维吾尔</option>
      			 <option value="06">
      				苗</option>
      			 <option value="07">
      				彝</option>
      			 <option value="08">
      				壮</option>
      			 <option value="09">
      				布依</option>
      			 <option value="10">
      				朝鲜</option>
      			 <option value="11">
      				满</option>
      			 <option value="12">
      				侗</option>
      			 <option value="13">
      				瑶</option>
      			 <option value="14">
      				白</option>
      			 <option value="15">
      				土家</option>
      			 <option value="16">
      				哈尼</option>
      			 <option value="17">
      				哈萨克</option>
      			 <option value="18">
      				傣</option>
      			 <option value="19">
      				黎</option>
      			 <option value="20">
      				僳僳</option>
      			 <option value="21">
      				佤</option>
      			 <option value="22">
      				畲</option>
      			 <option value="23">
      				高山</option>
      			 <option value="24">
      				拉祜</option>
      			 <option value="25">
      				水</option>
      			 <option value="26">
      				东乡</option>
      			 <option value="27">
      				纳西</option>
      			 <option value="28">
      				景颇</option>
      			 <option value="29">
      				柯尔克孜</option>
      			 <option value="30">
      				土</option>
      			 <option value="31">
      				达斡尔</option>
      			 <option value="32">
      				仫佬</option>
      			 <option value="33">
      				羌</option>
      			 <option value="34">
      				布朗</option>
      			 <option value="35">
      				撒拉</option>
      			 <option value="36">
      				毛南</option>
      			 <option value="37">
      				仡佬</option>
      			 <option value="38">
      				锡伯</option>
      			 <option value="39">
      				阿昌</option>
      			 <option value="40">
      				普米</option>
      			 <option value="41">
      				塔吉克</option>
      			 <option value="42">
      				怒</option>
      			 <option value="43">
      				乌孜别克</option>
      			 <option value="44">
      				俄罗斯</option>
      			 <option value="45">
      				鄂温克</option>
      			 <option value="46">
      				崩龙</option>
      			 <option value="47">
      				保安</option>
      			 <option value="48">
      				裕固</option>
      			 <option value="49">
      				京</option>
      			 <option value="50">
      				塔塔尔</option>
      			 <option value="51">
      				独龙</option>
      			 <option value="52">
      				鄂伦春</option>
      			 <option value="53">
      				赫哲</option>
      			 <option value="54">
      				门巴</option>
      			 <option value="55">
      				珞巴</option>
      			 <option value="56">
      				基诺</option>
      			 <option value="57">
      				其他</option>
      			 <option value="58">
      				外国血统</option>
</select>
    </td></tr>
    <tr style="height:30"><td style="width:150">地址</td><td><input style="width:268" id="address1"></td></tr>
    <tr style="height:30"><td style="width:150">有效开始时间</td><td><input style="width:80" id="start_date1">输入示例：20141122</td></tr>
    <tr style="height:30"><td style="width:150">有效结束时间</td><td><input style="width:80" id="end_date1">输入示例：20341122</td></tr>
    <tr style="height:30"><td style="width:150">发证机关</td><td><input style="width:150" id="issuer1"></td></tr>
    <tr style="height:30"><td style="width:150">手机号</td><td><input style="width:80" id="phone1"></td></tr>
    </table>
    <table>
   <tr style="height:30">
   <td style="width:150"><front color="red">营业厅</front></td>
         <td><select id="ting" >
               <option value="0">--请选择--</option>
               <option value="1">安贞</option>
               <option value="2">有研</option>
               <option value="3">密云</option>
               <option value="4">人保海淀支公司</option>
               
                <option value="5">丰台魏开060380</option>
                <option value="6">人保空港297303</option>
                <option value="7">人保丰台060389</option>
                <option value="8">人保海淀086863</option>
                <option value="9">人保昌平140121</option>
                <option value="10">人保海淀086832</option>
                <option value="11">人保海淀086833</option>
                <option value="12">人保昌平140341</option>
                <option value="13">人保门头沟A110112492</option>
                         <option value="14">人保昌平C110100054</option>
                          <option value="15">人保西城A110002238</option>
                           <option value="16">人保东城C110100040</option>
                            <option value="17">北盛朝五</option>
                             <option value="18">人保福耀1102680020</option>
                              <option value="19">燕山人保</option>
               </select>
         </td>
   </tr>
    <tr style="height:30">
         <td style="width:150"></td>
         <td><input style="width:80" id="code">&nbsp;&nbsp;<a href="javascript:getCode('<%=basePath%>');">获取验证码</a></td>
         </tr>
    <tr style="height:30">
         <td colspan="2"><span style="padding-left:500px"><input type="button" onclick="tijiao('<%=basePath%>')" value="上传信息"/></span>
         </td></tr>
    </table>
    
</div>

  </body>
</html>
