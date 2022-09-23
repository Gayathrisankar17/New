package org.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("bike cost is 150000");
				
	}

	@Override
	public void speed() {
		System.out.println("speed is 60km/hr");
		
		
	}
	
	public static void main(String[] args) {
		Ktm a=new Ktm();
		
		a.cost();
		a.speed();
		System.out.println("created");
	}
	
	

}
