package string;
public class TestString {
	public static void main(String args[])
	{
		// array of character
		String name="john doe";
		name.indexOf("o");// 1
		name.lastIndexOf("o");// 6
		// String is a array of characters.. same as array index starts at zero
		
		// get first character (indexed zero) from the string
		System.out.println(name.charAt(0));// j
		// join name string value with the input 
		System.out.println(name.concat(" , jane doe"));// john doe , jane doe
		// return true if input exist inside name variable value
		System.out.println(name.contains("h n")); // false
		// return true if name variable value ends with input 		
		System.out.println(name.endsWith("e"));
		// return true if name variable value is equal to input	, case should match as well
		System.out.println(name.equals(" FIRST name "));
		// return true if name variable value is equal to input	, case need not match		
		System.out.println(name.equalsIgnoreCase(" FIRST name "));
		// same as contains method, except it returns the index position of input first occurence
		System.out.println(name.indexOf("name"));
		// same as contains method, except it returns the index position of input last occurence
		System.out.println(name.lastIndexOf("a"));
		// replace all occurence of the input1 with input2
		System.out.println(name.replaceAll(" ", ":"));
		// name= john doe... name.replaceAll("o" , "a");
		// 		jahn dae
		// replace first occurence of the input1 with input2
		System.out.println(name.replaceFirst(" ", ":"));
		//		jahn doe
		// split the string in array of strings by the input "first name" is converted to array containing value first and name
		// if split by space
		System.out.println(name.split(" "));
		// return substring starting at position provided in input
		System.out.println(name.substring(5));
		// return substring between starting and ending position provided in inputs
		System.out.println(name.substring(3, 6));
		// convert all characters in the string to lower case
		System.out.println(name.toLowerCase());
		// convert all characters in the string to upper case
		System.out.println(name.toUpperCase());
		// remove the white space and next line characters from the string in the begining and end of the string
		System.out.println(name.trim());					

	}

}