package com.cg.donor.service;

import java.sql.SQLException;

import com.cg.donor.DTO.DonorDetails;
import com.cg.donor.exception.DonorRecordException;

public interface IDonorService {

	public int addDonorDetails(DonorDetails d) throws DonorRecordException, SQLException;

	public boolean validateName(String name);
	public boolean validatePhoneNo(String phone);
	public boolean validateAddress(String address);
	public boolean validateDonamt(String donamt);
}
