package patternmatching;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SURAJ KALE
 *
 */

public class UserLastName 
{
		
	/**
	 * @purpose : Check the validation of Last Name
	 * @return : No return Value 
	 */
	
	public static void checkValidLastName(String lastName) 
	{
        boolean isLastName; //Variable declare to check validation
		String lastNameRegex = "^[A-Z]{1}[a-z]{3,}$";    
		Pattern pattern = Pattern.compile(lastNameRegex);
		
		if (lastName == null)
		{
			isLastName = false;
		}
		
		Matcher matcher = pattern.matcher(lastName);
		isLastName = matcher.matches();
		
		//condition to check LastName Validation
		if (isLastName)
			System.out.println(lastName + " is an Valid Last Name\n");
		else
			System.out.println(lastName + " is an Invalid Last Name");
	
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Get userInput 
		System.out.println("Enter Your Last Name");
		String lastName = sc.nextLine();
		
		//Calling Method
		checkValidLastName(lastName);
	}

}
