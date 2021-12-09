package com.aris.model;

public class EmployeeModel {

	@Override
	public String toString() {
		return "EmployeeModel [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", job=" + job
				+ ", salary=" + salary + "]";
	}
	public EmployeeModel(String iD, String firstName, String lastName, String job, String salary) {
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.salary = salary;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	private String ID;
	private String  firstName;
	private String  lastName;
	private String  job;
	private String  salary;
}
