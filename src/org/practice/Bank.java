package org.practice;

public class Bank extends Employee {
@Override
public void clienLocation(String s) {
	System.out.println("location :"+s);
}

public void bankAddress(String add) {
	System.out.println("Bank Address :"+add);

}
public static void main(String[] args) {
	Bank b = new Bank();
	b.clienLocation("chennai");
	b.bankAddress("abcd 1st street Chennai");
	b.empName();
}
}
