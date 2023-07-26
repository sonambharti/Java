public class StringFormatting {
	
	public static void main(String[] args) {
		System.out.println("===== String formatting =====");
		System.out.println();
		String firstName = "Andrii";
		
		String greetingsTemplate = "Hello, dear %s! Good %s!";
		
		String morning = "morning";
		String afternoon = "afternoon";
		String evening = "evening";
		String formattedString1 = String.format(greetingsTemplate, firstName, morning);
		System.out.println(formattedString1);

        String formattedString2 = String.format(greetingsTemplate, firstName, afternoon);
		System.out.println(formattedString2);

        String formattedString3 = String.format(greetingsTemplate, firstName, evening);
		System.out.println(formattedString3);
		
		System.out.printf("You have %d computers available at store\n", 10);
	}

}