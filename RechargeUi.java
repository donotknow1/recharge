package com.ra.ui;


import java.time.*;
import java.util.List;
import java.util.Scanner;

import com.ra.dtobean.RechargeBean;
import com.ra.exception.RechargeException;
import com.ra.service.IRechargeService;
import com.ra.service.RechargeServiceImpl;

public class RechargeUi {

	static Scanner scan=null;
	static IRechargeService recServ=null;
	
	public static void main(String[] args) throws RechargeException {
		
		System.out.println("--------------------------------");
		System.out.println("         1.Recharge             ");
		System.out.println("      2.Recharge History        ");
		System.out.println("          3.exit                ");
		System.out.println("--------------------------------");
		
		scan=new Scanner(System.in);
		int option=scan.nextInt();
		
		switch(option) {
		
		case 1:
			
			System.out.println("Enter Your Name : ");
			String name=scan.next();
			System.out.println("Enter Mobile number : ");
			int mobile=scan.nextInt();
			System.out.println("Enter your Plan : ");
			String plan=scan.next();
			System.out.println("Enter recharge Amount : ");
			int amount=scan.nextInt();
		
			
			RechargeBean rec=new RechargeBean(name,mobile,plan,amount);
			int fin=0;
			try {
		    fin=recharge(rec);
			}
			catch(RechargeException e) {
				System.out.println(e.getMessage()+"ui");
			}
			if(fin>0) {
				System.out.println(fin+" data is inserted");
			}
			else
			{
				System.out.println("data is not inserted");
			}
		    break;
		    
		case 2 :
			
			List<RechargeBean> finList=null;
			
			finList=rechargeHistory();
				
				
			}
			
		    
		    
		}
		

		
		
		
		
		
	
	
	
	
	public static int recharge(RechargeBean rec) throws RechargeException {
		
		recServ=new RechargeServiceImpl();
		int result=recServ.rechargeServ(rec);
		return result;
		
	}
	 
	public static List<RechargeBean> rechargeHistory() {
	
		
		
		
		return null;
		
		
	}	
		
	
	
	
	
	
}
