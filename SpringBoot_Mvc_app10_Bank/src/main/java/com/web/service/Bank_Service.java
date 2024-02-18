package com.web.service;

import java.util.List;

import com.web.model.Bank_Manoj;

public interface Bank_Service {
	public Bank_Manoj saveEmployee_Invoice(Bank_Manoj bank);
	public Bank_Manoj updateEmployee_Invoice(Bank_Manoj bank);
	public void delectEmployee_Invoice(int accountnumber);
	public Bank_Manoj getEmployee_Invoice(int accountnumber);
	public List<Bank_Manoj>getallEmployee_Invoice();


}
