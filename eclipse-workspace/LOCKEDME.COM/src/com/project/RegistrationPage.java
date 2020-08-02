package com.project;

import java.util.Scanner;
class userPass{
	public static String user_name;
	public static String password;
}

public interface RegistrationPage {

	public static final int PASSWORD_LENGTH = 8;
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
      
		
		System.out.println("**********                 LockedMe.Com                 **********");
		
		
	
		
		System.out.println("**********          Registration page          **********");
	
		System.out.println("Enter Username");
		userPass.user_name=x.nextLine();
		System.out.println("Enter Password");
		System.out.print(
                "1.Password must have atleast eight characters.\n" +
                "2.Password should not consist of any special characters.\n" +
                "3.Password must contain at least two digits \n");
		userPass.password = x.nextLine();
		if (is_Valid_Password(userPass.password)) {
            System.out.println("Password is valid " );
            System.out.println("Registration is successfull.");
            LoginPage.main(null);
        } else {
            System.out.println("Not a valid password." );
        }
		
		
	}
	public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }


}