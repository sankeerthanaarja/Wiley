package com.exercise4;

public class WorkerMain {

	public static void main(String[] args) {
	  DailyWorker w=  new DailyWorker();
	  Worker w1= new SalariedWorker();
	  w.pay(20);
	  w1.pay();
	}

}
