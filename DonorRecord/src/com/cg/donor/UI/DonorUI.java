package com.cg.donor.UI;

import java.sql.SQLException;
import java.util.Scanner;

import com.cg.donor.DTO.DonorDetails;
import com.cg.donor.exception.DonorRecordException;
import com.cg.donor.service.DonorServiceImpl;
import com.cg.donor.service.IDonorService;


public class DonorUI {

	static Scanner sc=new Scanner(System.in);
	int choice=0;
	static DonorDetails details=null;
	static IDonorService service=null;
	public static void main(String[] args) throws DonorRecordException, SQLException{
	 
		System.out.println("Donor Record");
		System.out.println("*******************");
		while(true)
		{
			System.out.println("1.Enter Donor Details");
			System.out.println("2.Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: addDonorDetails();
			break;
			case 2: System.exit(0);
			break;
			}
		
}
}
	private static void addDonorDetails() throws DonorRecordException, SQLException{
		
		try{
			service= new DonorServiceImpl();
		
		System.out.println("Enter Donor name");
		String name=sc.next();
		if(service.validateName(name))
		
		System.out.println("Enter Phone Number");
		String phone=sc.next();
		if(service.validatePhoneNo(phone))
		
		System.out.println("Enter Address");
		String addr=sc.next();
		if(service.validateAddress(addr))
		
		System.out.println("Enter Donation Amount");
		int donamt=sc.nextInt();
		String num=String.valueOf(donamt);
		
		if(service.validateDonamt(num))
		{
		details=new DonorDetails(name,phone,addr,donamt);
		service=new DonorServiceImpl();
		int res=service.addDonorDetails(details);
		System.out.println(res+"  inserted");
		if(res==1)
		{
			System.out.println("Value added in database");
		}
		else
		{
			System.out.println("Value not added");
		}
		}
		}
		catch(DonorRecordException e){
			throw new DonorRecordException(e.getMessage());
		}
	
	}
}
