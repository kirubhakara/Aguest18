package org.practice;

public class Selenium implements ClassRoom ,JavaClass {

	@Override
	public void students() {
		System.out.println("Name is Ravi");
	}

	@Override
	public void mentors() {
		System.out.println("Raj");
		
	}

	@Override
	public void score() {
		System.out.println(10);
		
	}

	@Override
	public void online() {
		System.out.println("online class");		
	}

	@Override
	public void mark() {
		System.out.println("50/100");
		
	}
	public static void main(String[] args) {
		Selenium s = new Selenium();
		s.students();
		s.mentors();
		s.score();
		s.online();
		s.mark();
		
	}

}
