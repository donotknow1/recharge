package com.ra.dao;

import com.ra.dtobean.RechargeBean;
import com.ra.exception.RechargeException;

public interface IRechargeDao {

	int rechargeDao(RechargeBean rec) throws RechargeException;

	int historyDao(RechargeBean rec);
	
	
}
