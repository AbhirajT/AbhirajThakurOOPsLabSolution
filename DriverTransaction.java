package com.greatlearning.driver;

import java.util.Scanner;
public class DriverTransaction {
	public static void main (String[] args)
	{
		TransactionTargetAlogo transactionTargetAlogo =new TransactionTargetAlogo();
		Scanner sc =new Scanner(System.in);
		//get total no. of txns for txn array
		System.out.println("Enter the total no. of txn:");
		int totalnotxn =sc.nextInt();
		int[] txn =new int[totalnotxn];
		System.out.println("Enter the values of the txn:");
		for (int i=0;i<totalnotxn;i++)
		{
			txn[i]=sc.nextInt();
			
		}
		System.out.println("Enter the total no. of targets to be reached:");
		int targetcount=sc.nextInt();
		System.out.println("enter the value of targets");
		int target ;
		for (int i=0;i<targetcount;i++)
		{
		target=sc.nextInt();	
		TransactionTargetAlogo(txn,target);
		
		}
		//get totalNoof txns
		//init txn array
		//get txn array
		//get total no of targets
		//get targets
		//process
		
	}

	private static void TransactionTargetAlogo(int[] txn, int target) {
		// TODO Auto-generated method stub
		
	}

}
