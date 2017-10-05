package com.cg.donor.dao;

import java.sql.SQLException;

import com.cg.donor.DTO.DonorDetails;
import com.cg.donor.exception.DonorRecordException;

public interface IDonorDAO{

	public int addDonorDetails(DonorDetails d) throws DonorRecordException, SQLException;
		
}
