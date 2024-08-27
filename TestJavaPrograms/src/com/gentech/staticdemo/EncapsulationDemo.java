package com.gentech.staticdemo;
class Bank
{
	private int accountNo;
	private String acountHolderName;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAcountHolderName() {
		return acountHolderName;
	}
	public void setAcountHolderName(String acountHolderName) {
		this.acountHolderName = acountHolderName;
	}
	
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Bank axis=new Bank();
		axis.setAccountNo(10000001);
		axis.setAcountHolderName("Santosh");
		
		int accNo=axis.getAccountNo();
		System.out.println(accNo);
		
		String name=axis.getAcountHolderName();
		System.out.println(name);
	}

}
