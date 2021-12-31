package com.greatlearning.driver;

import java.util.Scanner;
public class TransactionTargetAlogo {

	public void processtxn(int[] txns,int target)
	{
		int flag =0;
		int sum=0;
		for(int i=0;i<txns.length;i++)
		{
			sum+=txns[i];
		
		if(sum >= target)
		{
			System.out.println("Target  achevied after "+i+1+"transactions");
		}
		flag =1;
		break;
		}
	
		if (flag ==0)
			System.out.println("given target not acheived");
		
		

	}

}

