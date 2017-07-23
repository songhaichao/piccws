<%@ page language="java" import="java.util.*,com.shc.db.DButils,com.shc.bean.personBean" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String pageNumber = request.getParameter("pageNumber");
if(pageNumber==null){
	pageNumber="1";
}
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
List list =  DButils.QueryUser(id,name,phone,chudan,Integer.valueOf(pageNumber));
int pageSize = list.size()/10;
if(pageSize%10>0){
	pageSize++;
}
%>
   <%

   for(int i=0;i<list.size();i++){
	   if(i%2==0){
	   %><tr class="a1"><%
	    }else{
	    	%><tr><%	
	    }
	   personBean pb =(personBean)list.get(i);
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
	   out.print(pb.getStatus()==null?"未出单":"已出单");
	   %></td><%
	   %><td>
	   <input type="button" value="出单" onclick="chudan('<%=basePath%>','<%
	   out.print(pb.getCode());
	   %>')"/>
	   <%
	   %></td><%
	   %></tr><%
   } %>

