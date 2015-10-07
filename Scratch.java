public class Scratch {
	public static void main(String[] args) {
		
		//Constructor example using a char[] to create a String
		char javaArray[] = new char[] {'J', 'a', 'v', 'a'};
		String javaString = new String(javaArray);
		System.out.println(javaString);
		
		// Object equality
		String anotherJavaString = new String(javaArray);
		if(javaString == anotherJavaString) {
			System.out.println("The Strings are equal");
		} else {
			System.out.println("The Strings are NOT equal");
		}
		
		String yetAnotherJavaString = javaString;
		if(javaString == yetAnotherJavaString) {
			System.out.println("The Strings are equal");
		} else {
			System.out.println("The Strings are NOT equal");
		}
		
		if(javaString.equals(anotherJavaString)) {
			System.out.println("The Strings are equal");
		} else {
			System.out.println("The Strings are NOT equal");
		}
		
		// The null reference
		String myString = null;
		System.out.println("myString is "+myString);
		
		String nullString = "null";
		if(nullString.equals(myString)) {
			System.out.println("nullString is equal to myString");
		} else {
			System.out.println("nullString is NOT equal to myString");
		}
		
		// boolean b = myString.equals(nullString);   // this will cause a NullPointerException at runtime
		
		if(myString == null) {
			System.out.println("myString is a null reference");
		}
		
		// instance variables
		int lengthOfJava = javaArray.length;
		System.out.println("Java is "+lengthOfJava+" characters long.");
		
		// instance methods
		lengthOfJava = javaString.length();
		System.out.println("Java is still "+lengthOfJava+" characters long");
		
		char firstChar = javaString.charAt(0);
		char lastChar = javaString.charAt(javaString.length() - 1);
		System.out.println("Java starts with "+firstChar+" and ends with "+lastChar);
		
		String javaUpperCase = javaString.toUpperCase();
		System.out.println(javaString+" as upper case is "+javaUpperCase);
		
		boolean startsWithJa = javaString.startsWith("Ja");
		boolean endsWithVa = javaString.endsWith("va");
		System.out.println(javaString+" starts with 'Ja': "+startsWithJa);
		System.out.println(javaString+" ends with 'va': "+endsWithVa);
		
		String av = javaString.substring(1, 3);
		System.out.println(av+" is in the middle of "+javaString);
		String truth = "Java is awesome!";
		int beginIndex = 0;
		int endIndex = beginIndex + lengthOfJava;
		String j = truth.substring(beginIndex, endIndex);
		System.out.println(j);
	}
}