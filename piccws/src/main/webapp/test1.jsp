<%@ page language="java" import="java.util.*,com.shc.client.personC" pageEncoding="GBK"%>
<%
String info = request.getParameter("info");
System.out.println("jsp���"+info);
personC pc = new personC();
out.print(pc.tijiao1(info));
%>
