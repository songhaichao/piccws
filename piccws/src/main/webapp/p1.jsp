<%@ page language="java" import="java.util.*,com.shc.porperties.baseInfo" pageEncoding="GBK"%>
<%
//String path = request.getContextPath();
//String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
baseInfo bi = new baseInfo();
String account = request.getParameter("account");
String password = request.getParameter("password");
String url = request.getParameter("url");
String sam = request.getParameter("sam");
String sam1 = request.getParameter("sam1");
String type = request.getParameter("type");
bi.updateAccount(account);
bi.updatePassword(password);
bi.updateUrl(url);
bi.updateSAM(sam);
bi.updateSAM1(sam1);
bi.updateType(type);
out.print("±£´æÍê³É");
%>