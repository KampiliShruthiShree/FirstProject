package com.project;
import java.util.Scanner;

public class LoginPage implements RegistrationPage {
	public static void main(String[] args) {
		String user_name=userPass.user_name;
		
		String password =userPass.password;
		   System.out.println("\n");
		   
		   System.out.println("**********       Login Page          **********");
		   
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Username");
			 String input=scan.nextLine();
			 System.out.println("Enter Password\n");
			 String pwd=scan.nextLine();
			 if(input.equals(user_name)&&pwd.equals(password)) {
				 System.out.println("Login successfull");
				 FilesMenu.main(null);
				 
			 }
			 else {
				 System.out.println("Invalid username or password.");
				 LoginPage.main(null);;
			 }
			
			 
			 
	
	}
}
	
	



