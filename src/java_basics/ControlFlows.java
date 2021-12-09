package java_basics;

public class ControlFlows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if, if..else, if..else..if, switch
		
		boolean right;
		right = true;
		if(right) {
			System.out.println("I'm right");
		}
		else {
			System.out.println("never wrong");
		}
		
		if(!right) {
			System.out.println("I'm right");
		}
		else {
			System.out.println("never wrong");
		}
		
		if(true) {
			System.out.println("always right");
		}
		
		int month = 12;
		String monthString = "Jan";
		
		switch(month) {
		
		case 1: monthString = "Jan";
		break;
		case 2: monthString = "Feb";
		break;
		default: monthString = "December";
		break;
		}
		
		System.out.println(monthString);

	}

}
