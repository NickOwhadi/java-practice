package OfficeHoursMaroufJan;

public class CreatPeopleHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person john= new Person("01/01/2000");
		john.setFirstName("John");
		john.setLastName("Doe");
		
		
		
		System.out.println(john.getFirstName());
		System.out.println(john.getLastName());
		System.out.println(john.getBirthday());
		john.setLastName("Smith");
		
		System.out.println(john.getBirthday());

	}

}
