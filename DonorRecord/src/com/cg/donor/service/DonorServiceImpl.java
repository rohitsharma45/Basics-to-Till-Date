package com.cg.donor.service;

import java.sql.SQLException;
import java.util.regex.Pattern;

import com.cg.donor.DTO.DonorDetails;
import com.cg.donor.dao.DonorDaoImpl;
import com.cg.donor.dao.IDonorDAO;
import com.cg.donor.exception.DonorRecordException;

public class DonorServiceImpl implements IDonorService
{
	IDonorDAO dao=null;

	public int addDonorDetails(DonorDetails d) throws DonorRecordException, SQLException{
		dao=new DonorDaoImpl();
		return dao.addDonorDetails(d);
	}
	
	public boolean validateName(String name)
	{
		String ptn="[A-Z]{1}[A-Za-z]{2,20}";
		if(Pattern.matches(ptn,name))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter valid name");
			return false;
		}
	}
	
	public boolean validatePhoneNo(String phone) {
		String phonePattern="[0-9]{10}";
		if(Pattern.matches(phonePattern,phone))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter valid phone number");
		return false;
		}
	}
	
	public boolean validateAddress(String address)
	{
		String ptn="[A-Z]{1}[A-Za-z]{2,40}";
		if(Pattern.matches(ptn,address))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter valid address");
			return false;
		}
	}
	
	public boolean validateDonamt(String donamt) {
		String donamtPattern="[1-9]{1}[0-9]{1,}";
		if(Pattern.matches(donamtPattern,donamt))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter valid donation amount");
		return false;
		}
	}





	}

