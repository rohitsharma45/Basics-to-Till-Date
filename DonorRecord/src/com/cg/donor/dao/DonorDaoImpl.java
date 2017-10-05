package com.cg.donor.dao;

import java.io.IOException;
import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.donor.DTO.DonorDetails;
import com.cg.donor.DbUtil.DbUtil;
import com.cg.donor.exception.DonorRecordException;

public class DonorDaoImpl implements IDonorDAO{
	Connection conn=null;
	public int addDonorDetails(DonorDetails d) throws DonorRecordException
	{ int res=0;
		try {
			conn=DbUtil.getConnection();
			System.out.println(conn);
			String insertQuery=
					"Insert into donordetails values(donor_seq_id.nextval,?,?,?,?,SYSDATE)";
			PreparedStatement ds=conn.prepareStatement(insertQuery);
			ds.setString(1,d.getDonor_name());
			ds.setString(2,d.getPhoneno());
			ds.setString(3,d.getAddress());
			ds.setInt(4,d.getDonation_amount());
				res=ds.executeUpdate();
				System.out.println(res);
			}
		catch(IOException e){
			
		}
		catch(SQLException e){
			
			throw new DonorRecordException(e.getMessage());

		}
		return res;
	
	}
		

}


