package com.greatlearning.AbhirajThakurOOPsLabSolution;

	import java.util.Scanner;

	public class MergeSort {
		static Scanner sc =new Scanner(System.in);
		public static void display(int[] arr)
		{
		 for (int i=0;i<arr.length;i++)
		 {
			 System.out.println("array is"+ arr[i]);
		 }
		}
		
		public static void mergesort(int[] arr,int left,int right)
		{
			if(left<right)
			{
			int mid = (right+left)/2;
			mergesort(arr,left,mid);
			mergesort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
		}
		
		public static void merge(int []arr,int left,int mid,int right)
		{
			int len1 = mid -left+1;
			int len2 =right-mid;
			int[] la =new int[len1];
			int[] ra =new int[len2];
			
			for (int i=0;i<len1;i++)
				la[i]=arr[left+i];
			for (int j=0;j<len2;j++)
				ra[j]=arr[mid+1+j];
			
			int i =0,j=0;
			int k =left;
			while (i <len1 && j<len2)
			{
				if(la[i] <ra[j])
				{
					arr[k]=la[i];
					i++;
				}
				else
				{
					arr[k] =ra[j];
				j++;
				}
			k++;
			}
			
			//to remove any left out values
			while (i<len1)
			{
				arr[k] =la[i];
				i++;
				k++;
			}
			while (j<len2)
			{
				arr[k] =ra[i];
				j++;
				k++;
			}
			
			
			
		}

	/*	public static void main(String[] args) {
			
			System.out.println("Enter limit of any array:");
			int n= sc.nextInt();
			int[] a =new int[n];
			 for (int i=0;i<a.length;i++)
			 {
				 a[i]=sc.nextInt();
			 }
			System.out.println("Before merging");
			
			display(a);
			mergesort(a,0,a.length-1);
			System.out.println("after merging");
			display(a);
			System.out.println(21%10);
			
		} */

	}


