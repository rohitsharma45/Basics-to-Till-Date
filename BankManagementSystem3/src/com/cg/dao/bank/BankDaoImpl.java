package com.cg.dao.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.bean.bank.BankBean;
import com.cg.dbutil.bank.DBUtil;


public class BankDaoImpl implements IBankDao {




	public int insertDetails(BankBean bean) {
		int row=0;
		Connection conn=null;
		try{
		conn=DBUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into CUSTOMERDETAILS values(cust_id_seq.nextval,?,?,?,?)");
		ps.setString(1, bean.getCustomerName());
		ps.setString(2,bean.getPhoneNo());
		ps.setString(3,bean.getPassword());
		ps.setString(4, bean.getReenterPassword());
		
			row=ps.executeUpdate();
			
		
		
		
		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return row;
		
	}

}
