package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.entity.EBill;

public interface EBillDao 
{
	public List<EBill>displayAll() throws ClassNotFoundException, SQLException;

	public void insertNewCustomer(EBill e) throws ClassNotFoundException, SQLException;

	public void deleteCustomer(EBill e) throws ClassNotFoundException, SQLException;
	
	public void updateCustomerEBillAmt(float bill, EBill e) throws ClassNotFoundException, SQLException;
}
