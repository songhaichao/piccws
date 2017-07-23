package com.shc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.dom4j.Document;

import cn.com.epicc.app.service.PICCServicePortType;

import com.shc.bean.personBean;
import com.shc.dom.XMLbuild;
import com.shc.log.logServer;
import com.shc.porperties.baseInfo;

public class personC {
		public String sendInfo(String xmlStr) {
			String returnStr = null;
			try {
				baseInfo baseInfo = new baseInfo(); 
				URL url = new URL(baseInfo.getUrl());
						//"http://219.142.99.204:8301/piccws/services/PICCService?wsdl");
				QName sname = new QName("http://service.app.epicc.com.cn",
						"PICCService");
				QName portName = new QName("http://service.app.epicc.com.cn", "PICCServiceHttpSoap11Endpoint");  
				Service service = Service.create(url, sname);
				PICCServicePortType ps = service.getPort(portName,PICCServicePortType.class);
					 returnStr= ps.sendIDInfo(xmlStr);
			} catch (Exception e) {
				// TODO Auto-generated catch block  
				e.printStackTrace();
			}
			return returnStr;
		}
	public String tijiao(personBean pb,personBean pb1,String code,String ting){
		 baseInfo bi = new baseInfo();
		 XMLbuild xmlbuild = new XMLbuild();
		 Document document = null;
		 document = xmlbuild.buildPicc(pb,  pb1, bi.getAccount(), bi.getPassword(), code, bi.getType(), bi.getSAMBy("sam"+ting)); 
		// if(ting!=null&&ting.equals("1")){
		//	 document = xmlbuild.buildPicc(pb,  pb1, bi.getAccount(), bi.getPassword(), code, bi.getType(), bi.getSAM()); 
		// }else if(ting!=null&&ting.equals("2")){
		//	 document = xmlbuild.buildPicc(pb,  pb1, bi.getAccount(), bi.getPassword(), code, bi.getType(), bi.getSAM1()); 
		// }else{
			
		// }
		 String xmlStr = xmlbuild.formatXML(document, "GBK");
	   	 XMLbuild xb = new XMLbuild();
	   	 String returnXml = send(xmlStr);
	   	 Document doc = xb.createDocumentByString(returnXml);
		 return doc.getRootElement().element("HEAD").element("ERROR_MESSAGE").getText();
		}
	public String tijiao1(String xmlStr){
	   	String returnXml = send(xmlStr);
	     XMLbuild xb = new XMLbuild();
	   	 Document doc = xb.createDocumentByString(returnXml);
		 return doc.getRootElement().element("HEAD").element("ERROR_MESSAGE").getText();
		}
	public String  send(String xmlStr){
		boolean print = false;
   	 logServer LOG = new logServer();
   	 XMLbuild xb = new XMLbuild();
   	 Document doc = xb.createDocumentByString(xmlStr);

   	 personBean pb = new personBean();
   	 if(doc.getRootElement().element("BODY").element("BASE_PART").element("CHECKCODE")!=null&&
   			 !"".equals(doc.getRootElement().element("BODY").element("BASE_PART").element("CHECKCODE").getTextTrim())){
   		 print =true;
   		 pb.setCode(doc.getRootElement().element("BODY").element("BASE_PART").element("CHECKCODE").getTextTrim());
   		 if(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("CUSTOMER_TYPE").getTextTrim().equals("2")){
   			 //投保人
	    	   pb.setName(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("NAME").getText());
	    	   pb.setGender(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("GENDER").getText());
	    	   pb.setNation(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("NATION").getText());
	    	   pb.setBirth_date(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("BIRTH_DATE").getText());
	    	   pb.setAddress(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("ADDRESS").getText());
	    	   pb.setId_card(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("CERTI_CODE").getText());
	    	   pb.setIssuer(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("ISSUER").getText());
	    	   pb.setStart_date(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("CERTI_START_DATE").getText());
	    	   pb.setEnd_date(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("CERTI_END_DATE").getText());
	    	   pb.setPhone_number(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("TELEPHONE").getText());
	    	   pb.setCustomer_type(doc.getRootElement().element("BODY").element("BASE_PART").element("MACHINE_CODE").getText());	
   		 }else if(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("CUSTOMER_TYPE").getTextTrim().equals("2")){
   			 //被投保人
	    	   pb.setName(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("NAME").getText());
	    	   pb.setGender(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("GENDER").getText());
	    	   pb.setNation(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("NATION").getText());
	    	   pb.setBirth_date(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("BIRTH_DATE").getText());
	    	   pb.setAddress(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("ADDRESS").getText());
	    	   pb.setId_card(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("CERTI_CODE").getText());
	    	   pb.setIssuer(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("ISSUER").getText());
	    	   pb.setStart_date(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("CERTI_START_DATE").getText());
	    	   pb.setEnd_date(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("CERTI_END_DATE").getText());
	    	   pb.setPhone_number(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("TELEPHONE").getText());
	    	   pb.setCustomer_type(doc.getRootElement().element("BODY").element("BASE_PART").element("MACHINE_CODE").getText());
   		 }
   		 System.out.println("songhaichao5555555555---"+xmlStr);
   		 LOG.insertPerson(pb);

   		 //�����˱��ӿ�
       	 personC pc = new personC();
       	LOG.logPiccUp(xmlStr);
       	 String reStr =  pc.sendInfo(xmlStr);
       	 System.out.println("songhaichao666666666666---"+reStr);
       	 System.out.println("-------------"+print);
       	 return reStr; 
   	 }else{
   		 print =false;
   		//��¼����PICC��־
       	 LOG.logPiccUp(xmlStr);
       	 personC pc = new personC();
       	 String reStr =  pc.sendInfo(xmlStr);
       	 System.out.println("songhaichao7777777777---"+reStr);
       	 System.out.println("-------------"+print);
       	 return reStr; 
       	 
   	 }
	}
}
