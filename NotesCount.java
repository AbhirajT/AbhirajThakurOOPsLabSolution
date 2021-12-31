package com.greatlearning.AbhirajThakurOOPsLabSolution;

import java.util.Arrays;

public class NotesCount {
	
	public void notesCountImplementation(int notes[],int amount)
	{
		int [] notesCounter =new int[notes.length];
		int i =notes.length-1;
		while (i>0)
		{
			notesCounter[i] =amount/notes[i];
			amount=amount%notes[i];
			i--;
		}
		for (int j=0;j<notesCounter.length;j++)
		{
			System.out.println("Denominations of "+ notes[j]+":"+notesCounter[j]);
		}
	}

}
