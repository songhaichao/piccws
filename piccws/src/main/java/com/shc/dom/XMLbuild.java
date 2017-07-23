package com.shc.dom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.shc.bean.personBean;

public class XMLbuild {
	public static String testStr="<?xml version=\"1.0\" encoding=\"GBK\"?><PACKET type=\"REQUEST\" version=\"1.0\"><HEAD><REQUEST_TYPE>B3</REQUEST_TYPE><USER>picc</USER><PASSWORD>picc</PASSWORD></HEAD><BODY><BASE_PART><TYPE>1</TYPE><AMEND_QUERY_NO></AMEND_QUERY_NO><CANCEL_QUERY_NO></CANCEL_QUERY_NO><CLAIM_CODE></CLAIM_CODE><MACHINE_CODE>05.03-20120629-0000202551</MACHINE_CODE><SALES_CHANNEL>23</SALES_CHANNEL><CHECKCODE>HI789K</CHECKCODE></BASE_PART></BODY><HOLDER_LIST><HOLDER_DATA><NAME> </NAME><GENDER> </GENDER><NATION> </NATION><BIRTH_DATE> </BIRTH_DATE><ADDRESS> </ADDRESS><CERTI_CODE> </CERTI_CODE><ISSUER> </ISSUER><CERTI_START_DATE> </CERTI_START_DATE><CERTI_END_DATE> </CERTI_END_DATE><TELEPHONE> </TELEPHONE><CUSTOMER_TYPE>1</CUSTOMER_TYPE><INSUREDFLAG>1</INSUREDFLAG></HOLDER_DATA></HOLDER_LIST><INSURED_LIST><INSURED_DATA><NAME> </NAME><GENDER> </GENDER><NATION> </NATION><BIRTH_DATE> </BIRTH_DATE><ADDRESS> </ADDRESS><CERTI_CODE> </CERTI_CODE><ISSUER> </ISSUER><CERTI_START_DATE> </CERTI_START_DATE><CERTI_END_DATE> </CERTI_END_DATE><TELEPHONE> </TELEPHONE><CUSTOMER_TYPE>1</CUSTOMER_TYPE><INSUREDFLAG>2</INSUREDFLAG></INSURED_DATA></INSURED_LIST></PACKET>";
public Document buildPicc(personBean bean,personBean bean1,String account,String pwd,String check_code,String channel,String machine){
	Document document = DocumentHelper.createDocument();
	document.setXMLEncoding("GBK");
	Element root = document.addElement("PACKET");
	root.addAttribute("type", "REQUEST").addAttribute("version", "1.0");
	//head
	Element HEAD = root.addElement("HEAD"); 
	 Element REQUEST_TYPE = HEAD.addElement("REQUEST_TYPE");
	  REQUEST_TYPE.setText("B3");
	 Element USER = HEAD.addElement("USER");
	  USER.setText("picc");
	 Element PASSWORD = HEAD.addElement("PASSWORD");
	 PASSWORD.setText("picc");
	//body
	Element BODY = root.addElement("BODY"); 
	//BASE_PART
	Element BASE_PART = BODY.addElement("BASE_PART"); 
	  Element TYPE = BASE_PART.addElement("TYPE"); 
	    TYPE.setText("1");
//	  Element AMEND_QUERY_NO = BASE_PART.addElement("AMEND_QUERY_NO"); 
//	    AMEND_QUERY_NO.setText("");
//	  Element CANCEL_QUERY_NO = BASE_PART.addElement("CANCEL_QUERY_NO");
//	    CANCEL_QUERY_NO.setText("");
//	  Element CLAIM_CODE = BASE_PART.addElement("CLAIM_CODE");
//	    CLAIM_CODE.setText("");
	  Element MACHINE_CODE = BASE_PART.addElement("MACHINE_CODE");
	    MACHINE_CODE.setText(machine);
	  Element SALES_CHANNEL = BASE_PART.addElement("SALES_CHANNEL"); 
	    SALES_CHANNEL.setText(channel);
	  Element CHECKCODE = BASE_PART.addElement("CHECKCODE"); 
	    CHECKCODE.setText(check_code);
	//HOLDER
	Element HOLDER_LIST = BODY.addElement("HOLDER_LIST");
	  Element HOLDER_DATA = HOLDER_LIST.addElement("HOLDER_DATA");	
	    Element NAME = HOLDER_DATA.addElement("NAME");
	      NAME.setText(bean.getName()==null?"":bean.getName());
	    Element GENDER = HOLDER_DATA.addElement("GENDER");
	      GENDER.setText(bean.getGender()==null?"":bean.getGender());
	    Element NATION = HOLDER_DATA.addElement("NATION");
	      NATION.setText(bean.getNation()==null?"":bean.getNation());
	    Element BIRTH_DATE = HOLDER_DATA.addElement("BIRTH_DATE");
	      BIRTH_DATE.setText(bean.getBirth_date()==null?" ":bean.getBirth_date());
	    Element ADDRESS = HOLDER_DATA.addElement("ADDRESS");
	      ADDRESS.setText(bean.getAddress()==null?"":bean.getAddress());
	    Element CERTI_CODE = HOLDER_DATA.addElement("CERTI_CODE");
	      CERTI_CODE.setText(bean.getId_card()==null?" ":bean.getId_card());
	    Element ISSUER = HOLDER_DATA.addElement("ISSUER");
	      ISSUER.setText(bean.getIssuer()==null?"":bean.getIssuer());
	    Element CERTI_START_DATE = HOLDER_DATA.addElement("CERTI_START_DATE");
	      CERTI_START_DATE.setText(bean.getStart_date()==null?"":bean.getStart_date());
	    Element CERTI_END_DATE = HOLDER_DATA.addElement("CERTI_END_DATE");
	      CERTI_END_DATE.setText(bean.getEnd_date()==null?"":bean.getEnd_date());
	    Element TELEPHONE = HOLDER_DATA.addElement("TELEPHONE");
	      TELEPHONE.setText(bean.getPhone_number()==null?"":bean.getPhone_number());
	    Element CUSTOMER_TYPE = HOLDER_DATA.addElement("CUSTOMER_TYPE");
	      CUSTOMER_TYPE.setText(bean.getName()==null||"".equals(bean.getName())||bean.getName().length()==0?"1":"2");
	    Element INSUREDFLAG = HOLDER_DATA.addElement("INSUREDFLAG");
	      INSUREDFLAG.setText("1");

	//INSURED
	Element INSURED_LIST = BODY.addElement("INSURED_LIST");
	  Element INSURED_DATA = INSURED_LIST.addElement("INSURED_DATA");	
	    Element NAME1 = INSURED_DATA.addElement("NAME");
	      NAME1.setText(bean1.getName()==null?"":bean1.getName());
	    Element GENDER1 = INSURED_DATA.addElement("GENDER");
	      GENDER1.setText(bean1.getGender()==null?"":bean1.getGender());
	    Element NATION1 = INSURED_DATA.addElement("NATION");
	      NATION1.setText(bean1.getNation()==null?"":bean1.getNation());
	    Element BIRTH_DATE1 = INSURED_DATA.addElement("BIRTH_DATE");
	      BIRTH_DATE1.setText(bean1.getBirth_date()==null?"":bean1.getBirth_date());
	    Element ADDRESS1 = INSURED_DATA.addElement("ADDRESS");
	      ADDRESS1.setText(bean1.getAddress()==null?"":bean1.getAddress());
	    Element CERTI_CODE1 = INSURED_DATA.addElement("CERTI_CODE");
	      CERTI_CODE1.setText(bean1.getId_card()==null?"":bean1.getId_card());
	    Element ISSUER1 = INSURED_DATA.addElement("ISSUER");
	      ISSUER1.setText(bean1.getIssuer()==null?"":bean1.getIssuer());
	    Element CERTI_START_DATE1 = INSURED_DATA.addElement("CERTI_START_DATE");
	      CERTI_START_DATE1.setText(bean1.getStart_date()==null?"":bean1.getStart_date());
	    Element CERTI_END_DATE1 = INSURED_DATA.addElement("CERTI_END_DATE");
	      CERTI_END_DATE1.setText(bean1.getEnd_date()==null?"":bean1.getEnd_date());
	    Element TELEPHONE1 = INSURED_DATA.addElement("TELEPHONE");
	      TELEPHONE1.setText(bean1.getPhone_number()==null?"":bean1.getPhone_number());
	    Element CUSTOMER_TYPE1 = INSURED_DATA.addElement("CUSTOMER_TYPE");
	      CUSTOMER_TYPE1.setText(bean1.getName()==null||"".equals(bean1.getName())||bean1.getName().length()==0?"1":"2");
	    Element INSUREDFLAG1 = INSURED_DATA.addElement("INSUREDFLAG");
	      INSUREDFLAG1.setText("2");
	return document;
}
 public static void main(String arg[]){
	 File outputFile = new File("c://1.xml"); 
	 XMLWriter xmlWriter = null;
	try {
		 xmlWriter = new XMLWriter(new FileOutputStream(outputFile));
		 XMLbuild xmlbuild = new XMLbuild();
		 Document document = xmlbuild.buildPicc(new personBean(), new personBean(), "picc", "picc", "HI789K", "23", "05.03-20120629-0000202551");
		 xmlWriter.write(document);
		 xmlWriter.close();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  

 }
 public static void shuchu(String xmlStr){
	 File f = new File("c://1.xml"); 
	  String s = new String();
	  try {
	   if(f.exists()){
	    System.out.print("文件存在");
	   }else{
	    System.out.print("文件不存在");
	    f.createNewFile();//不存在则创建
	   }
	   BufferedReader input = new BufferedReader(new FileReader(f));
	   
	   while((s = input.readLine())!=null){
		   xmlStr += s+"\n";
	   }
	   System.out.println(xmlStr);
	   input.close();
	   
	   
	   BufferedWriter output = new BufferedWriter(new FileWriter(f));
	   output.write(xmlStr);
	   output.close();
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
 }

 public static String formatXML(Document document, String charset) { 
         OutputFormat format = OutputFormat.createPrettyPrint(); 
         format.setEncoding(charset); 
         StringWriter sw = new StringWriter(); 
         XMLWriter xw = new XMLWriter(sw, format); 
         try { 
                 xw.write(document); 
                 xw.flush(); 
                 xw.close(); 
         } catch (IOException e) { 
                e.printStackTrace();
         } 
         return sw.toString();
     }
 public  Document createDocumentByString(String xmlStr) {
		Document doc = null;
		try {  
			doc = DocumentHelper.parseText(xmlStr);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return doc;
	}
 
}
