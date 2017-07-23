<%@ page language="java" import="com.shc.bean.personBean,com.shc.client.personC" pageEncoding="GBK"%>
<%
personBean pb = new personBean();
String id = request.getParameter("id");
pb.setId_card(id==null?"":id);
String phone = request.getParameter("phone");
pb.setPhone_number(phone==null?"":phone);
String name = request.getParameter("name");
pb.setName(name==null?"":name);
String nation =request.getParameter("nation");
pb.setNation(nation==null?"":nation);
String address =request.getParameter("address");
pb.setAddress(address==null?"":address);
String start_date =request.getParameter("start_date");
pb.setStart_date(start_date==null?"":start_date);
String end_date =request.getParameter("end_date");
pb.setEnd_date(end_date==null?"":end_date);
String gerder = request.getParameter("gerder");
pb.setGender(gerder==null?"":gerder);
if(id!=null&&id.trim().length()>0){
	pb.setBirth_date(id.substring(6,14));
}
String issuer = request.getParameter("issuer");
pb.setIssuer(issuer==null?"":issuer);

personBean pb1 = new personBean();
String id1 = request.getParameter("id1");
pb1.setId_card(id1==null?"":id1);
String phone1 = request.getParameter("phone1");
pb1.setPhone_number(phone1==null?"":phone1);
String name1 = request.getParameter("name1");
pb1.setName(name1==null?"":name1);
String nation1 =request.getParameter("nation1");
pb1.setNation(nation1==null?"":nation1);
String address1 =request.getParameter("address1");
pb1.setAddress(address1==null?"":address1);
String start_date1 =request.getParameter("start_date1");
pb1.setStart_date(start_date1==null?"":start_date1);
String end_date1 =request.getParameter("end_date1");
pb1.setEnd_date(end_date1==null?"":end_date1);
String gerder1 = request.getParameter("gerder1");
pb1.setGender(gerder1==null?"":gerder1);

if(id1!=null&&id1.trim().length()>0){
	pb1.setBirth_date(id1.substring(6,14));
}
String issuer1 = request.getParameter("issuer1");
pb1.setIssuer(issuer1==null?"":issuer1);

String code = request.getParameter("code");
String ting = request.getParameter("ting");
if(pb.getPhone_number()!=null&&!"".equals(pb.getPhone_number())&&pb1.getPhone_number()!=null&&!"".equals(pb1.getPhone_number())){
	personC pc = new personC();
	String res = pc.tijiao(pb,pb1,code,ting);
	out.print(res);
}else{
	out.print("ÐÅÏ¢ÓÐÎó");
}
%>
