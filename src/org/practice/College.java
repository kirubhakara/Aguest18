package org.practice;

public  class College extends Details
{

	@Override
	public void ug() {
		System.out.println("ug pass out in : 2022");
		
	}

	public static void main(String[] args) {
	College c = new College();
	c.ug();
	c.pg("2020");
	}
}
