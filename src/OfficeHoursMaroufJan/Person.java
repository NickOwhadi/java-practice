package OfficeHoursMaroufJan;

public class Person {
private String firstName;
private String lastName;
private String birthday;


public Person(String bDay) {
	System.out.println(bDay);
	birthday=bDay;
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
public String getBirthday() {
	return birthday;
}

}
