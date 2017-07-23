<%@ page language="java" import="java.util.*,com.shc.db.DButils,com.shc.bean.personBean" pageEncoding="GBK"%>
<%
String id = request.getParameter("id");
if(id==null){
	id="";
}
String name = request.getParameter("name");
if(name==null){
	name="";
}
String phone = request.getParameter("phone");
if(phone==null){
	phone="";
}
String chudan = request.getParameter("chudan");
if(chudan==null){
	chudan="";
}
DButils DButils = new DButils();
List list =  DButils.QueryAllUser(id,name,phone,chudan);
out.print(list.size());
%>