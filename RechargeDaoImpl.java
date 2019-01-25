package com.ra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ra.dtobean.RechargeBean;
import com.ra.exception.RechargeException;
import com.ra.util.DbUtil;


public class RechargeDaoImpl implements IRechargeDao{
	 
	Connection conn=null;
	@Override
	public int rechargeDao(RechargeBean rec) throws RechargeException {
		
		int status=0;
		Connection conn=DbUtil.getDbConnection();
		try {
		PreparedStatement insert=conn.prepareStatement(IQueryMapper.INSERT_QRY);
		insert.setString(1,rec.getCustomerName());
		insert.setInt(2,rec.getMobileNo());
		insert.setInt(3,rec.getRechargeAmount());
		insert.setString(4, rec.getRechargePlan());
		
		status=insert.executeUpdate();		
		}
		catch(SQLException e){
			
			throw new RechargeException("data not stored : "+e.getMessage());
		}
			
		
		return status;
		
		
		
	}
	@Override
	public int historyDao(RechargeBean rec) {
		
		public List<RechargeBean>
		
		
		
		
		
		
		
		
		
		return 0;
	}

	
	
	
	
}
