package com.shc.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shc.bean.personBean;

public class DButils {
	public static Connection getConnection() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/",
					"sa", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn != null)
			return conn;
		else
			return null;
	}

	public  String QuerySAM(String SAM) {
		String id_str = null;
		try {
			Connection conn = DButils.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt
					.executeQuery(" SELECT  RENBAOSM FROM SM_SM_INFO WHERE ZHONGHESM = '"+SAM+"' ");
			while (rs.next()) {
				id_str = rs.getString("RENBAOSM");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id_str;
	}
	public  String Query(String id) {
		String id_str = null;
		try {
			Connection conn = DButils.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt
					.executeQuery("select ID_STR from BASE_INFO where id='"
							+ id + "'");

			while (rs.next()) {
				id_str = rs.getString("ID_STR");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id_str;
	}
	public  String QueryBySamCode(String id) {
		String id_str = null;
		try {
			Connection conn = DButils.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt
					.executeQuery("select ID_STR from BASE_INFO where id='"
							+ id + "'");

			while (rs.next()) {
				id_str = rs.getString("ID_STR");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id_str;
	}
	public  void Update(String id, String id_str) {
		try {
			Connection conn = DButils.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("update BASE_INFO set id_str= '" + id_str
					+ "' where id='" + id + "'");
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public  int QueryID(String id) {

		int id_str = 1;
		try {
			Connection conn = DButils.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select max(id) ID from " + id);

			while (rs.next()) {
				id_str = rs.getInt("ID");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id_str;
	}

	public  void UpdateBysql(String sql) {
		try {
			Connection conn = DButils.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public  List QueryLog(String tablename) {
          List list = new ArrayList();
		try {
			Connection conn = DButils.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select  ID,ID_STR,OP_TIME from " + tablename+" ORDER BY ID DESC");
			while (rs.next()) {
				Map map = new HashMap();
				int id = rs.getInt("ID");
				map.put("ID", id);
				String id_str = ClobToString(rs.getClob("ID_STR"));
				map.put("ID_STR", id_str);
				String op_time = rs.getString("OP_TIME");
				map.put("OP_TIME", op_time.substring(0,20));
				list.add(map);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
    public String ClobToString(Clob clob) {
        String reString = "";
        Reader is = null;
        try {
            is = clob.getCharacterStream();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(is);
        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        StringBuffer sb = new StringBuffer();
        while (s != null) {
            sb.append(s);
            try {
                s = br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
			is.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        reString = sb.toString();
        return reString;
    }
	public  List QueryUser(String id,String name,String phone,String chudan,int page) {
        List list = new ArrayList();
		try {
			Connection conn = DButils.getConnection();
			Statement stmt = conn.createStatement();
			int start = (page-1)*10;
			String sql = " SELECT LIMIT "+start+" 10 ";
			sql+=" ID,NAME,PHONE,GERDER,NATION,BIRTH_DATE,ADDRESS,CERTI_START_DATE,CERTI_END_DATE,OP_TIME,CUSTOM_TYPE,CODE,ISSUER,STATUS FROM PERSON ";   
			if(id!=null&&!"".equals(id)||name!=null&&!"".equals(name)||phone!=null&&!"".equals(phone)||chudan!=null&&!"".equals(chudan)){
				sql+= " where 1=1 ";
			}
			
			   if(id!=null&&!"".equals(id)){
			    	sql+= " and ID like '%"+id+"%' ";   
			       }
			    if(name!=null&&!"".equals(name)){
			    	sql+= " and NAME like '%"+name+"%' ";  
			    }
			    if(phone!=null&&!"".equals(phone)){
			    	sql+= " and PHONE like '%"+phone+"%' ";  
			    }
			    if(chudan!=null&&!"".equals(chudan)&&!"0".equals(chudan)){
			    	
			    	if(chudan.equals("δ����"))
			    		sql+= " and (STATUS = '"+chudan+"'   or status is null or status = '')";  
			    	else{
			    		sql+= " and STATUS = '"+chudan+"' ";  
			    	}
			    }
			       sql+= "  ORDER BY OP_TIME DESC ";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				personBean pb = new personBean();
				pb.setId_card(rs.getString("ID"));
				pb.setAddress(rs.getString("ADDRESS"));
				pb.setBirth_date(rs.getString("BIRTH_DATE"));
				pb.setCode(rs.getString("CODE"));
				pb.setCustomer_type(rs.getString("CUSTOM_TYPE"));
				pb.setEnd_date(rs.getString("CERTI_END_DATE"));
				String gerder = rs.getString("GERDER");
				if(gerder!=null&&"1".equals(gerder)){
					pb.setGender("��");
				}else if(gerder!=null&&"2".equals(gerder)){
					pb.setGender("Ů");
				}else {
					pb.setGender("δ֪");
				}
				pb.setName(rs.getString("NAME"));
				pb.setNation(rs.getString("NATION"));
				pb.setPhone_number(rs.getString("PHONE"));
				pb.setStart_date(rs.getString("CERTI_START_DATE"));
				pb.setIssuer(rs.getString("ISSUER"));
				pb.setStatus(rs.getString("STATUS"));
				pb.setOp_time(rs.getString("OP_TIME")==null?"":rs.getString("OP_TIME").substring(0,19));
				list.add(pb);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public  List QueryAllUser(String id,String name,String phone,String chudan) {
        List list = new ArrayList();
		try {
			Connection conn = DButils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = " SELECT ";
			sql+=" ID,NAME,PHONE,GERDER,NATION,BIRTH_DATE,ADDRESS,CERTI_START_DATE,CERTI_END_DATE,OP_TIME,CUSTOM_TYPE,CODE,ISSUER,STATUS FROM PERSON ";   
			if(id!=null&&!"".equals(id)||name!=null&&!"".equals(name)||phone!=null&&!"".equals(phone)||chudan!=null&&!"".equals(chudan)){
				sql+= " where 1=1 ";
			}
			
			   if(id!=null&&!"".equals(id)){
			    	sql+= " and ID like '%"+id+"%' ";   
			       }
			    if(name!=null&&!"".equals(name)){
			    	sql+= " and NAME like '%"+name+"%' ";  
			    }
			    if(phone!=null&&!"".equals(phone)){
			    	sql+= " and PHONE like '%"+phone+"%' ";  
			    }
			    if(chudan!=null&&!"".equals(chudan)&&!"0".equals(chudan)){
			    	
			    	if(chudan.equals("δ����"))
			    		sql+= " and (STATUS = '"+chudan+"'  or status is null or status = '')";  
			    	else{
			    		sql+= " and STATUS = '"+chudan+"' ";  	
			    	}
			    }
			       sql+= "  ORDER BY OP_TIME DESC ";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				personBean pb = new personBean();
				pb.setId_card(rs.getString("ID"));
				pb.setAddress(rs.getString("ADDRESS"));
				pb.setBirth_date(rs.getString("BIRTH_DATE"));
				pb.setCode(rs.getString("CODE"));
				pb.setCustomer_type(rs.getString("CUSTOM_TYPE"));
				pb.setEnd_date(rs.getString("CERTI_END_DATE"));
				pb.setGender(rs.getString("GERDER"));
				pb.setName(rs.getString("NAME"));
				pb.setNation(rs.getString("NATION"));
				pb.setPhone_number(rs.getString("PHONE"));
				pb.setStart_date(rs.getString("CERTI_START_DATE"));
				pb.setIssuer(rs.getString("ISSUER"));
				pb.setStatus(rs.getString("STATUS"));
				pb.setOp_time(rs.getString("OP_TIME")==null?"":rs.getString("OP_TIME").substring(0,19));
				list.add(pb);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String arg[]){
		DButils DButils = new DButils();
		DButils.QueryLog("PAD_LOG");
	}
}
