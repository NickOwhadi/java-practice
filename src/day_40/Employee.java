package day_40;

public class Employee {
	public String name;
	public String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name+"is working");
	}
	public void attendMeeting() {
		System.out.println(name+"is attending meeting");
	}
	public void introduce() {
		System.out.println("Name"+name+"Job Title"+ jobTitle
				+"Salary"+salary);
	}
	
	
	
	

}
