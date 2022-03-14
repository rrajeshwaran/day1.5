package org.com;

import org.emp.Employees;

public class Client {
	private void cliId() {
System.out.println("678");
	}
	private void cliName() {
System.out.println("HCL");
System.out.println("hcl1");
	}
	public static void main(String[] args) {
		Client c = new Client();
		c.cliId();
		c.cliName();
		Employees e = new Employees();
		e.empId();
		e.empName();
			}

}
