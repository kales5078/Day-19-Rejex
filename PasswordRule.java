package patternmatching;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author SURAJ KALE
 *
 */

public class PasswordRule1 {
	
		/**
		 * @purpose : Check the validation of Password
		 * @return : No return Value 
		 */
		
		public static void checkValidPassword(String password) 
		{
	        boolean isPassword; //Variable declare to check validation
			    String passRegex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
   
			Pattern pattern = Pattern.compile(passRegex);
			
			if (password == null)
			{
				isPassword = false;
			}
			
			Matcher matcher = pattern.matcher(password);
			isPassword = matcher.matches();
			
			//condition to check Password Validation
			if (isPassword)
				System.out.println(password + " is an Valid Password \n");
			else
				System.out.println(password + " is an Invalid Password");
		
		}

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			//Get userInput 
			System.out.println("Enter Your Password ");
			String password = sc.nextLine();
			
			//Calling Method
			checkValidPassword(password);
		}

	}
