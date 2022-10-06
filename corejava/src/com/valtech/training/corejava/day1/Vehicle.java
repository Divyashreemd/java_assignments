package com.valtech.training.corejava.day1;

public  abstract class Vehicle {
	
	public  void start() {
		System.out.println("start Button Pressed....");
	}
	
	public  void stop() {
		System.out.println("Stop Button Pressed....");
	}
	
	public abstract void accelerate();
	
	public abstract void applybreaks();

	public  final void driveSomeBreaks() {
		start();
		accelerate();
		applybreaks();
		stop();
	}
	
	
	public static void main(String[] args) {
		Vehicle es= new ElectricalScooter();
		es.driveSomeBreaks();
	}
}
