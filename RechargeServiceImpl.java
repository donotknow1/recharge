package com.ra.service;

import com.ra.dao.IRechargeDao;
import com.ra.dao.RechargeDaoImpl;
import com.ra.dtobean.RechargeBean;
import com.ra.exception.RechargeException;

public class RechargeServiceImpl implements IRechargeService{
	
	static IRechargeDao recDao=null;
	
	
	
	
	
	@Override
	public int rechargeServ(RechargeBean rec) throws RechargeException {
		
		recDao=new RechargeDaoImpl();
		int result1=recDao.rechargeDao(rec);	
		return result1;
	}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
