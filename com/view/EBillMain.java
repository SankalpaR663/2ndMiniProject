package com.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.EBillService;

public class EBillMain
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		System.out.println("Electricity Bill Management System");
		
		System.out.println("1. Display All Customer Data");
		System.out.println("2. Insert New Customer Data");
		System.out.println("3. Calculate and Update Customer's Electricity Bill Data");
		System.out.println("4. Delete Customer Data");
		String s;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the choice: ");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					new EBillService().displayAll();
					break;
				case 2:
					new EBillService().insertData();
					break;
				case 3:
					new EBillService().updateEBillData();
					break;
				case 4:
					new EBillService().deleteData();
					break;
					
					
			}
			System.out.println("Do u want to continue: ");
			s=sc.next();
					
		}while(s.equals("yes"));
	
	}

}
