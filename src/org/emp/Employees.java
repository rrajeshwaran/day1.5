package org.emp;

public class Employees {
	public void empId() {
System.out.println("1234");

	}
	public void empName() {
System.out.println("bala");
	}
public static void main(String[] args) {
	Employees e = new Employees();
	e.empId();
	e.empName();
	Company c = new Company();
	c.comId();
	c.comName();
}
}
