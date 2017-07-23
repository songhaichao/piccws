//package com.shc.server;
//
//import javax.jws.WebService;
//
//import org.dom4j.Document;
//import org.dom4j.Element;
//
//import com.shc.bean.personBean;
//import com.shc.client.personC;
//import com.shc.dom.XMLbuild;
//import com.shc.porperties.baseInfo;
//
//@WebService(endpointInterface="com.shc.server.PICCService") 
//public class PICCServiceHttpSoap11EndpointImpl implements PICCService{
//	    public String sendInfo(String xmlStr) {  
//	       System.out.println("xmlStr:"+xmlStr);
//	       XMLbuild xb = new XMLbuild();
//	       Document doc = xb.createDocumentByString(xmlStr);
//	       //Document doc = xb.createDocumentByString(xb.testStr);
//	       //解析文件
//	       personBean pb = new personBean();
//	       boolean HOLDER = false;
//	       if(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("CUSTOMER_TYPE")!=null&&
//	    		  "2".equals(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("CUSTOMER_TYPE")) ){
////	    	   pb.setName(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("NAME").getText());
////	    	   pb.setGender(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("GENDER").getText());
////	    	   pb.setNation(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("NATION").getText());
////	    	   pb.setBirth_date(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("BIRTH_DATE").getText());
////	    	   pb.setAddress(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("ADDRESS").getText());
////	    	   pb.setId_card(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("CERTI_CODE").getText());
////	    	   pb.setIssuer(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("ISSUER").getText());
////	    	   pb.setStart_date(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("CERTI_START_DATE").getText());
////	    	   pb.setEnd_date(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("CERTI_END_DATE").getText());
////	    	   pb.setPhone_number(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("TELEPHONE").getText());
//	    	   HOLDER = true;
//	       }
//	       personBean pb1 = new personBean();
//	       boolean INSURED = false;
//	       if(doc.getRootElement().element("INSURED_LIST").element("INSURED_DATA").element("CUSTOMER_TYPE")!=null&&
//		    		  "2".equals(doc.getRootElement().element("INSURED_LIST").element("INSURED_DATA").element("CUSTOMER_TYPE")) ){
////		    	   pb1.setName(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("NAME").getText());
////		    	   pb1.setGender(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("GENDER").getText());
////		    	   pb1.setNation(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("NATION").getText());
////		    	   pb1.setBirth_date(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("BIRTH_DATE").getText());
////		    	   pb1.setAddress(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("ADDRESS").getText());
////		    	   pb1.setId_card(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("CERTI_CODE").getText());
////		    	   pb1.setIssuer(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("ISSUER").getText());
////		    	   pb1.setStart_date(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("CERTI_START_DATE").getText());
////		    	   pb1.setEnd_date(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("CERTI_END_DATE").getText());
////		    	   pb1.setPhone_number(doc.getRootElement().element("HOLDER_LIST").element("HOLDER_DATA").element("TELEPHONE").getText());
//		    	   INSURED = true;
//		       }
//	       if(!HOLDER&&!INSURED){
//	    	   Element des = doc.addElement("DESCRIPTION");
//	    	   des.addText("投保人和被投保人都为空，参考CUSTOMER_TYPE = 1");
//	       }else{
//	    	 //更新局部数据
//	    	   doc.getRootElement().element("HEAD").element("USER").setText(baseInfo.getAccount());
//	    	   doc.getRootElement().element("HEAD").element("PASSWORD").setText(baseInfo.getPassword());
//	    	   doc.getRootElement().element("BODY").element("BASE_PART").element("MACHINE_CODE").setText(baseInfo.getSAM());
//	    	 //调用picc服务
//	    	   personC pc = new personC();
//	    	  String returnXml =  pc.sendInfo(doc.asXML());
//	    	  System.out.println("返回信息如下："+returnXml);
//	       }
//	       return doc.asXML();  
//	   }
//}
