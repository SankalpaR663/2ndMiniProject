package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.EBill;

public class EBillDaoImplementation implements EBillDao
{

	@Override
	public List<EBill> displayAll() throws ClassNotFoundException, SQLException 
	{
		ArrayList<EBill> list = new ArrayList<EBill>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exlbatch","root","Lashu*663");
		PreparedStatement st = con.prepareStatement("select * from Ebill");
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
			EBill e = new EBill();
			
			e.setSlNo(rs.getInt(1));
			e.setMeterNo(rs.getInt(2));
			e.setCustomerName(rs.getString(3));
			e.setMeterType(rs.getString(4));
			e.setNoofUnitsUsed(rs.getFloat(5));
			e.setEBillAmt(rs.getFloat(6));
			list.add(e);
			
		}
		return list;
	}

	@Override
	public void insertNewCustomer(EBill e) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");//load the diver
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exlbatch","root","Lashu*663");//connection
		    PreparedStatement st=con.prepareStatement("insert into Ebill values(?,?,?,?,?,?) ");
		    st.setInt(1, e.getSlNo());
		    st.setInt(2, e.getMeterNo());
		    st.setString(3, e.getCustomerName());
		    st.setString(4, e.getMeterType());
		    st.setFloat(5, e.getNoofUnitsUsed());
		    st.setFloat(6, e.getEBillAmt());

		    st.executeUpdate();
		    System.out.println("Insert success");
		
	}

	@Override
	public void deleteCustomer(EBill e) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");//load the diver
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exlbatch","root","Lashu*663");//connection
		    PreparedStatement st=con.prepareStatement("delete from Ebill where meterNo = ?");
		    st.setInt(1, e.getMeterNo());
			st.executeUpdate();
			con.close();
			System.out.println("Deleted successfully");
		    		
	}

	@Override
	public void updateCustomerEBillAmt(float bill,EBill e) throws ClassNotFoundException, SQLException 
	{
		int row=0;
		Class.forName("com.mysql.jdbc.Driver");//load the diver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exlbatch","root","Lashu*663");
		    PreparedStatement st=con.prepareStatement("update Ebill set EBillAmt=? where meterNo=? and meterType = ? and noofUnitsUsed = ?");
		   
		    st.setFloat(1, e.getEBillAmt());
		   
		    st.setInt(2, e.getMeterNo());
		    st.setString(3, e.getMeterType());
		    st.setFloat(4, e.getNoofUnitsUsed());
		    row=st.executeUpdate();
		    System.out.println("update success");
		
	}

	
	

}
