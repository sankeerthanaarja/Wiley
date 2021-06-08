package com.exercise1;

public class EggUnit {
	int gross,dozen,remaining;
EggUnit(int eggs)
{
	if(eggs<144) this.gross=0;
	else 
		{
		this.gross=(eggs/144);
		eggs-=(gross*144);

		}
	if(eggs<12) this.dozen=0;
	else
	{
		this.dozen=(eggs/12);
		eggs-=dozen*12;
	
	}
	this.remaining=eggs;
}
public int getRemaining() {
	return remaining;
}
	public int getGross() {
		return gross;
	}
	public int getDozen() {
		return dozen;
	}
}
