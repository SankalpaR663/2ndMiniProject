package com.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.EBillDaoImplementation;
import com.entity.EBill;

public class EBillService 
{
	float costPerUnit=0, bill = 0;
	
	public void displayAll() throws ClassNotFoundException, SQLException
	{
		List<EBill>list = new EBillDaoImplementation().displayAll();
		for(EBill e : list)
		{
			System.out.println(e);
		}
	}
	
	public void insertData() throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the serial no: ");
		int slNo=sc.nextInt();
		System.out.println("Enter the meter number: ");
		int meterNum = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the customer name: ");
		String customerName = sc.nextLine();
		System.out.println("Enter the meter type: ");
		String meterType = sc.nextLine();
		System.out.println("Enter the number of units used: ");
		float noofUnitsUsed = sc.nextFloat();	

		EBill e = new EBill();		
		e.setSlNo(slNo);
		e.setMeterNo(meterNum);
		e.setCustomerName(customerName);
		e.setMeterType(meterType);
		e.setNoofUnitsUsed(noofUnitsUsed);	
		
		new EBillDaoImplementation().insertNewCustomer(e);	
	}
	
	public void updateEBillData() throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the meter number: ");
		int meterNum = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the meter type: ");
		String meterType = sc.nextLine();
		
		if(meterType.equals("Commercial"))
			costPerUnit=7.25f;
		else if(meterType.equals("Domestic"))
			costPerUnit = 3.25f;
			
		System.out.println("Enter the no of units used: ");
		float noofUnitsUsed = sc.nextFloat();
		
		
		EBill e = new EBill();		
		
		e.setMeterNo(meterNum);
		
		e.setMeterType(meterType);
		
		e.setNoofUnitsUsed(noofUnitsUsed);
		
		 bill = costPerUnit * e.getNoofUnitsUsed();
		 
		 e.setEBillAmt(bill); 

		new EBillDaoImplementation().updateCustomerEBillAmt(bill, e);
	}


	public void deleteData() throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the meter number that you want to delete from Ebill: ");
		int meterNo = sc.nextInt();
		
		EBill e =new EBill();
		
		e.setMeterNo(meterNo);
		new EBillDaoImplementation().deleteCustomer(e);
		
	}
}
