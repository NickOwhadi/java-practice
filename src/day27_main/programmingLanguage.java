package day27_main;

public class programmingLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Java --> programming language
		Selenium --> Test Automation
		TestNG --> Unit Tests
		JUnit --> Unit Tests
		Cucumber --> BDD Style testing
		Git --> Version control
		Maven --> Building and execution for project
		*/
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		for(String tool: tools) {
			switch(tool.toLowerCase()) {
			case "java":
				System.out.println("programming language");
				break;
			case "eslenium":
				System.out.println("Test Automation");
				break;
			case "testNG":
				System.out.println("Unit Tests");
				break;
			case "junit":
				System.out.println("Unit Tests");
				break;
			case "cucumber":
				System.out.println("BDD Style testing");
				break;
			case "git":
				System.out.println("Version control");
				break;
			case "maven":
				System.out.println("Building and execution for project");
				break;
			default:
				System.out.println("unknown ");
			}
			} 
		}
	}


