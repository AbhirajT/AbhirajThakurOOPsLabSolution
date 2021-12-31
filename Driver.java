package com.greatlearning.AbhirajThakurOOPsLabSolution;


import java.util.Scanner;
public class Driver {
	public static void main (String[] args)
	{
		//ini Scanner 
		Scanner sc =new Scanner(System.in);
		//init mergesort and notescount objects
		MergeSort mergessort =new MergeSort();
		NotesCount notescount =new NotesCount();
		System.out.println("Enter the total no of denominations:");
		int totalNoofDeno =sc.nextInt();
		int[] notes =new int[totalNoofDeno];
		System.out.println("enter currency denominations:");
		for (int i=0;i<totalNoofDeno;i++)
		{
			notes[i]=sc.nextInt();
		}
		System.out.println("Enter amount u want to pay:");
		int amount =sc.nextInt();
		mergessort.mergesort(notes, 0, notes.length-1);
		mergessort.display(notes);
		//get size of denoinations
		//get value of denominations
		//apply mergesort
		
		//count notes
		notescount.notesCountImplementation(notes,amount);
		
		
	}

}

