package patternmatching;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author SURAJ KALE
 *
 */

public class EmailValidation {
	
		/**
		 * @purpose : Check the validation of Email
		 * @return : No return Value 
		 */
		
		public static void checkValidEmail(String email) 
		{
	        boolean isEmail; //Variable declare to check validation
			String emailRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
   
			Pattern pattern = Pattern.compile(emailRegex);
			
			if (email == null)
			{
				isEmail = false;
			}
			
			Matcher matcher = pattern.matcher(email);
			isEmail = matcher.matches();
			
			//condition to check Email Validation
			if (isEmail)
				System.out.println(email + " is an Valid Last Name\n");
			else
				System.out.println(email + " is an Invalid Last Name");
		
		}

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			//Get userInput 
			System.out.println("Enter Your E-mail ");
			String email = sc.nextLine();
			
			//Calling Method
			checkValidEmail(email);
		}

	}
