package com.studentManagement.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Db_Operation {

	static PreparedStatement pstmt = null;
	static boolean eQuery = false;
	public static boolean insertStudent(int sId, String sName, String sGender) {
		
		try(Connection con = Db_Connection.createCon();) {
			String iQuery = "insert into student(sId, sname, sgender) values(?, ?, ?)";
			pstmt = con.prepareStatement(iQuery);
			
			// write query
			pstmt.setInt(1, sId);
			pstmt.setString(2, sName);
			pstmt.setString(3, sGender);
			
			pstmt.executeUpdate();
			eQuery = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return eQuery;
	}
	
	public static boolean deleteStudent(String name) {

		try(Connection con = Db_Connection.createCon();) {
			String dQuery = "delete from student where sname = ?";
			pstmt = con.prepareStatement(dQuery);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			eQuery=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return eQuery;
	}
	
	// update sid
	public static boolean updateStudent(int sId, String sName) {
		
		try(Connection con = Db_Connection.createCon()) {
			String uSIdQuery = "update student set sid=? where sname=?";
			// update sid
			pstmt = con.prepareStatement(uSIdQuery);
			pstmt.setInt(1, sId);
			pstmt.setString(2, sName);
			
			pstmt.executeUpdate();
			eQuery = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return eQuery;
	}
	
	// update sname
	public static boolean updateStudent(String sName, int sid) {
		try(Connection con = Db_Connection.createCon()) {
			String uSNameQuery = "update student set sname=? where sid =?";
			
			pstmt = con.prepareStatement(uSNameQuery);
			pstmt.setString(1, sName);
			pstmt.setInt(2, sid);
			
			pstmt.executeUpdate();
			eQuery = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return eQuery;
	}
	
	// update sgender
	public static boolean updateStudent(String sGender, String sName) {
		try(Connection con = Db_Connection.createCon()) {
			String uSGenderQuery = "update student set sgender=? where sname=?";

			pstmt = con.prepareStatement(uSGenderQuery);
			pstmt.setString(1, sGender);
			pstmt.setString(2, sName);
			
			pstmt.executeUpdate();
			eQuery = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return eQuery;
	}
	
	public static boolean selectStudent() {
		
		try(Connection con = Db_Connection.createCon();
				Statement stmt = con.createStatement()) {
			String sQuery = "select * from student";
			
			ResultSet result = stmt.executeQuery(sQuery);
			// write query
			int count = 0;
			while(result.next()) {
				
				int sId = result.getInt(1);
				String sName = result.getString(2);
				String sGender = result.getString(3);
				count++;
				System.out.println("Row "+count);
				System.out.println("Sid : "+sId+" "+"Sname : "+sName+" "+"Sgender : "+sGender);
				System.out.println();
			}
			
			eQuery = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return eQuery;
	}
}



	
