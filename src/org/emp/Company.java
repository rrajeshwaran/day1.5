package org.emp;

public class Company extends Details {
	public void comId() {
System.out.println("789");
	}
	
	public void comName() {
System.out.println("tcs");
}
public static void main(String[] args) {
	Company c = new Company();
	c.comId();
	c.comName();
	c.detId();
	c.batId();
	
}
}
