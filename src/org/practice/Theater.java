package org.practice;

public class Theater{
public void book(int a) {
	System.out.println("how many ticket :"+a);
}
public void book(String movie) {
	System.out.println("movie name :"+movie);
}
public void book(int a,String pay) {
	System.out.println("booking ticket"+a+"\n proceed next yes/no :"+pay);
}
public void book(char row) {
	System.out.println("Which row :"+row);
}

public void book(long l,String review)
{
	System.out.println(review +":"+l);
}
public static void main(String[] args) {
	Theater t = new Theater();
	t.book(2);
	t.book("abcd");
	t.book('d');
	t.book(2,"yes");
	t.book(8l,"enter your rating 10 out of ? :");
}
}
