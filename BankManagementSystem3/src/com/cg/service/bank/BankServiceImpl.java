package com.cg.service.bank;

import com.cg.bean.bank.BankBean;
import com.cg.dao.bank.BankDaoImpl;
import com.cg.dao.bank.IBankDao;


public class BankServiceImpl implements IBankService {

	IBankDao dao=new BankDaoImpl();
	public int insertDetails(BankBean bean) {
		
		return dao.insertDetails(bean);
	}

}
