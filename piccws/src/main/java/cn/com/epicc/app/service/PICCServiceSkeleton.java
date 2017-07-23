
/**
 * PICCServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */
    package cn.com.epicc.app.service;

import org.dom4j.Document;

import com.shc.bean.personBean;
import com.shc.client.personC;
import com.shc.dom.XMLbuild;
import com.shc.log.logServer;
import com.shc.porperties.baseInfo;
    /**
     *  PICCServiceSkeleton java skeleton for the axisService
     */
    public class PICCServiceSkeleton implements PICCServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param sendIDInfo0
         */
        
                 public cn.com.epicc.app.service.SendIDInfoResponseDocument sendIDInfo
                  (
                  cn.com.epicc.app.service.SendIDInfoDocument sendIDInfo0
                  )
            {
                	 boolean print = false;
                	 baseInfo baseInfo = new baseInfo();
                	// System.out.println("songhaichao1:"+sendIDInfo0.getSendIDInfo().xmlText());
                	 String sourceStr = sendIDInfo0.getSendIDInfo().xmlText();
                	 sendIDInfo0.getSendIDInfo().getArgs0();
                	 String subStr = sourceStr.substring(sourceStr.indexOf("<![CDATA[")+9);
                	 subStr = subStr.substring(0,subStr.lastIndexOf("]]>"));
                	// System.out.println("songhaichao2:"+subStr);
                	 logServer LOG = new logServer();
                	 String shuangyinStr = subStr.replaceAll("'", "\"");
                	 LOG.logPadUp(shuangyinStr);
                	 XMLbuild xb = new XMLbuild();
                	 Document doc = xb.createDocumentByString(shuangyinStr);
                	 doc.getRootElement().element("HEAD").element("USER").setText(baseInfo.getAccount());
                	 doc.getRootElement().element("HEAD").element("PASSWORD").setText(baseInfo.getPassword());
                	 String zhongheSAM = doc.getRootElement().element("BODY").element("BASE_PART").element("MACHINE_CODE").getText();
                	 String renbaoSAM = baseInfo.getSAMbySAM(zhongheSAM);
                	 if(renbaoSAM==null||"".equals(renbaoSAM)||"null".equals(renbaoSAM)){
                    	 doc.getRootElement().element("BODY").element("BASE_PART").element("MACHINE_CODE").setText(baseInfo.getSAM());
                	 }else{
                    	 doc.getRootElement().element("BODY").element("BASE_PART").element("MACHINE_CODE").setText(renbaoSAM);
                	 }
                	 
                	 doc.getRootElement().element("BODY").element("BASE_PART").element("SALES_CHANNEL").setText(baseInfo.getType());
            		 String xmlStr = xb.formatXML(doc, "GBK");
                	 personBean pb = new personBean();
                	 if(doc.getRootElement().element("BODY").element("BASE_PART").element("CHECKCODE")!=null&&
                			 !"".equals(doc.getRootElement().element("BODY").element("BASE_PART").element("CHECKCODE").getTextTrim())){
                		 print =true;
                		 pb.setCode(doc.getRootElement().element("BODY").element("BASE_PART").element("CHECKCODE").getTextTrim());
                		 if(doc.getRootElement().element("BODY").element("HOLDER_LIST").element("HOLDER_DATA").element("CUSTOMER_TYPE").getTextTrim().equals("2")){
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
          	    	   pb.setCustomer_type(zhongheSAM);	
                		 }else if(doc.getRootElement().element("BODY").element("INSURED_LIST").element("INSURED_DATA").element("CUSTOMER_TYPE").getTextTrim().equals("2")){
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
      		    	   pb.setCustomer_type(zhongheSAM);
                		 }
                		 LOG.insertPerson(pb);
                		 LOG.logPiccUp(xmlStr);
                    	 personC pc = new personC();
                    	 System.out.println("songhaichao3333333333---"+xmlStr);
                    	 String reStr =  pc.sendInfo(xmlStr);
                    	 System.out.println("songhaichao444444444---"+reStr);
                    	 cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse sendIDInfoResponse =  cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse.Factory.newInstance();
                    	 sendIDInfoResponse.setReturn(reStr);
                    	 cn.com.epicc.app.service.SendIDInfoResponseDocument sendIDInfoResponseDocument = cn.com.epicc.app.service.SendIDInfoResponseDocument.Factory.newInstance();
                    	 sendIDInfoResponseDocument.setSendIDInfoResponse(sendIDInfoResponse);
                    	 System.out.println("-------------"+print);
                    	 return sendIDInfoResponseDocument; 
                	 }else{
                		 print =false;
                		 System.out.println("songhaichao11111111111---"+xmlStr);
                    	 LOG.logPiccUp(xmlStr);
                    	 personC pc = new personC();
                    	 String reStr =  pc.sendInfo(xmlStr);
                    	 System.out.println("songhaichao2222222222222---"+reStr);
                    	 cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse sendIDInfoResponse =  cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse.Factory.newInstance();
                    	 sendIDInfoResponse.setReturn(reStr);
                    	 cn.com.epicc.app.service.SendIDInfoResponseDocument sendIDInfoResponseDocument = cn.com.epicc.app.service.SendIDInfoResponseDocument.Factory.newInstance();
                    	 sendIDInfoResponseDocument.setSendIDInfoResponse(sendIDInfoResponse);
                    	 System.out.println("-------------"+print);
                    	 return sendIDInfoResponseDocument; 
                    	 
                	 }
        }
     
    }
    