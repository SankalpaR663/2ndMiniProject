package com.entity;

public class EBill 
{
	private int slNo;
	private int meterNo;
	private String customerName;
	private String meterType;
	private float noofUnitsUsed;
	private float EBillAmt;
	
	public EBill() 
	{
		super();
	}

	public EBill(int slNo, int meterNo, String customerName, String meterType, float noofUnitsUsed,
		 float EBillAmt) {
		super();
		this.slNo = slNo;
		this.meterNo = meterNo;
		this.customerName = customerName;
		this.meterType = meterType;
		this.noofUnitsUsed = noofUnitsUsed;
		this.EBillAmt = EBillAmt;
	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMeterType() {
		return meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}

	public float getNoofUnitsUsed() {
		return noofUnitsUsed;
	}

	public void setNoofUnitsUsed(float noofUnitsUsed) {
		this.noofUnitsUsed = noofUnitsUsed;
	}

	public float getEBillAmt()
	{
		return EBillAmt;
	}
	
	public void setEBillAmt(float EBillAmt)
	{
		this.EBillAmt = EBillAmt;
	}

	@Override
	public String toString() {
		return "EBill [slNo=" + slNo + ", meterNo=" + meterNo + ", customerName=" + customerName + ", meterType="
				+ meterType + ", noofUnitsUsed=" + noofUnitsUsed + ", EBillAmt=" + EBillAmt + "]";
	}

	
	
	
	
	
}
