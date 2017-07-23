package com.shc.log;

import com.shc.bean.personBean;
import com.shc.db.DButils;

public class logServer {
	public  DButils  DButils= new DButils();
 public void logPiccUp(String xmlStr){
	 java.util.Date date = new java.util.Date();
	 java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 int id = getMaxId("PICC_LOG");
	 id++;
	 String insertSql = "insert into PICC_LOG(id,id_str,op_time) values("+id+",'"+xmlStr+"',timestamp('"+format.format(date)+"'))";
	 //System.out.println(insertSql);
	 DButils.UpdateBysql(insertSql);
 }
 public void logPadUp(String xmlStr){
	 java.util.Date date = new java.util.Date();
	 java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 int id = getMaxId("PAD_LOG");
	 id++;
	 String insertSql = "insert into PAD_LOG(id,id_str,op_time) values("+id+",'"+xmlStr+"',timestamp('"+format.format(date)+"'))";
	//System.out.println(insertSql);
	 DButils.UpdateBysql(insertSql);
 }
 public int getMaxId(String id){
	return DButils.QueryID(id);
 }
 public void getPerson(){
	 
 }
 public void insertPerson(personBean pb){
	 java.util.Date date = new java.util.Date();
	 java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 String insertSql = "INSERT INTO PERSON( ID, NAME, PHONE, GERDER, NATION, BIRTH_DATE, ADDRESS, CERTI_START_DATE, CERTI_END_DATE, OP_TIME, CUSTOM_TYPE,CODE,ISSUER ) "+
                        " VALUES ( '"+pb.getId_card()+"', '"+pb.getName()+"', " +
                        		" '"+pb.getPhone_number()+"', '"+pb.getGender()+"'," +
                        				" '"+pb.getNation()+"', '"+pb.getBirth_date()+"'," +
                        						" '"+pb.getAddress()+"', '"+pb.getStart_date()+"'," +
                        								" '"+pb.getEnd_date()+"', timestamp('"+format.format(date)+"'),'"+pb.getCustomer_type()+"','"+pb.getCode()+"','"+pb.getIssuer()+"' ) ";
	// System.out.println(insertSql);
	 DButils.UpdateBysql(insertSql);
 }
}
