package com;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.dom4j.Document;

import cn.com.epicc.app.service.PICCServicePortType;

import com.shc.bean.personBean;
import com.shc.dom.XMLbuild;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//创建访问wsdl服务地址的url  
			URL url = new URL(
					"http://219.142.99.204:8301/piccws/services/PICCService?wsdl");
			//通过QName指明服务的和具体信息  
			QName sname = new QName("http://service.app.epicc.com.cn",
					"PICCService");
			QName portName = new QName("http://service.app.epicc.com.cn", "PICCServiceHttpSoap11Endpoint");  
			//创建服务  
			Service service = Service.create(url, sname);
			//实现接口  
			PICCServicePortType ps = service.getPort(portName,PICCServicePortType.class);
			personBean pb = new personBean();
			  XMLbuild xmlbuild = new XMLbuild();
				 Document document = xmlbuild.buildPicc(new personBean(), new personBean(), "picc", "picc", "HI789K", "23", "05.03-20120629-0000202551");
				 String xmlStr = document.asXML();
				 System.out.println(xmlStr);
			//System.out.println(ps.sendIDInfo(xmlStr));
		} catch (Exception e) {
			// TODO Auto-generated catch block  
			e.printStackTrace();
		}
	}
}
