package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Bank_Manoj;
import com.web.repo.Bank_repo;

@Service
public class Bank_service_imp implements Bank_Service {

	@Autowired
	private Bank_repo repo;
	
	
	@Override
	public Bank_Manoj saveEmployee_Invoice(Bank_Manoj bank) {
		
		// Set default values if not provided
        if (bank.getIfsccode() == null || bank.getIfsccode().isEmpty()) {
            bank.setIfsccode(null);
        }
        if (bank.getBrcode() == 0) {
            bank.setBrcode(05152);
        }
        if (bank.getStatus() == 0) {
            bank.setStatus(1);
        }

        
        return repo.save(bank);
		
		
	}

	@Override
	public Bank_Manoj updateEmployee_Invoice(Bank_Manoj bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delectEmployee_Invoice(int accountnumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public Bank_Manoj getEmployee_Invoice(int accountnumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bank_Manoj> getallEmployee_Invoice() {
		// TODO Auto-generated method stub
		return null;
	}

}
