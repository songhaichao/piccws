package com.shc.porperties;

import com.shc.db.DButils;

public class baseInfo {
	public  DButils  DButils= new DButils();
 public  String getAccount(){
	String account =  DButils.Query("account");
	return account;
 }
 public  void updateAccount(String account){
	 DButils.Update("account",account);
 }
 public  String getSAMbySAM(String SAM){
		String SAMAND =  DButils.QuerySAM(SAM);
		return SAMAND;
}
 public  String getPassword(){
		String password =  DButils.Query("password");
		return password;
 }
 public  void updatePassword(String password){
	 DButils.Update("password",password);
 }
 public  String getUrl(){
	 String url =  DButils.Query("url");
		return url;
 }
 public  void updateUrl(String url){
	 DButils.Update("url",url);
 }
 public  String getSAM(){
	 String sam =  DButils.Query("sam");
		return sam;
 }
 public  void updateSAM(String sam){
	 DButils.Update("sam",sam);
 }
 public  String getSAM1(){
	 String sam =  DButils.Query("sam1");
		return sam;
 }
 public  String getSAMBy(String samCode){
	 String sam =  DButils.Query(samCode);
		return sam;
 }
 public  void updateSAM1(String sam){
	 DButils.Update("sam1",sam);
 }
 public  String getOrg(){
	 String org =  DButils.Query("org");
		return org;
 }
 public  void updateOrg(String org){
	 DButils.Update("org",org);
 }
 public  String getType(){
	 String type =  DButils.Query("type");
		return type;
 }
 public  void updateType(String type){
	 DButils.Update("type",type);
 }
 public String convert(String utfString) {
		StringBuilder sb = new StringBuilder();
		int i = -1;
		int pos = 0;

		while ((i = utfString.indexOf("\\u", pos)) != -1) {
			sb.append(utfString.substring(pos, i));
			if (i + 5 < utfString.length()) {
				pos = i + 6;
				sb.append((char) Integer.parseInt(utfString.substring(i + 2,
						i + 6), 16));
			}
		}
		return sb.toString();
	}  
 public static void main(String arg[]){
	 baseInfo bi = new baseInfo();
	System.out.println( bi.getSAMbySAM("1"));
  }
}
