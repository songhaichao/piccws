<%@ page language="java" import="com.shc.db.DButils" pageEncoding="GBK"%>
<%
String code = request.getParameter("code");
String updatesql = "update person  set status ='�ѳ���' where code = '"+code+"'";
DButils db = new DButils();

db.UpdateBysql(updatesql);
out.print("������ϣ�");
%>
