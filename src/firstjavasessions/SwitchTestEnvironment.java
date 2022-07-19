package firstjavasessions;

public class SwitchTestEnvironment {

	public static void main(String[] args) {


		String testEnv="STAGEm";
		switch (testEnv) {
		case "TEST":
			System.out.println("in Test env");
			
			break;
			
		case "QA":
			System.out.println("in QA env");
			
			break;
			
		case "PROD":
			System.out.println("in PROD env");
			
			break;
			
		case "UAT":
			System.out.println("in UAT env");
			
			break;
			
		case "STAGE":
			System.out.println("in STAGE env");
			
			break;
			
		case "PQA":
			System.out.println("in PQA env");
			
			break;
			
		case "PROD ":
			System.out.println("in PROD env");
			
			break;

		default:
			System.out.println("enter valid environment");
			break;
		}

	}

}
