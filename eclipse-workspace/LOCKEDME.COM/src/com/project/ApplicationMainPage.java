
package com.project;
import java.util.Scanner;

public class ApplicationMainPage {
public static void main(String[] args) {

	
	System.out.println("**********                 Welcome to LOCKEDME.COM                     **********");

	System.out.println("**********                       MainPage                         **********");
	
	System.out.println("1.Registeration for Lockedme.com");
	System.out.println("2.Login for lockedme.com");
	System.out.println("Select option");
	
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	char  choice =s.charAt(0);
	switch(choice) {
	case '1':
		RegistrationPage.main(null);
		break;
	case '2':
		LoginPage.main(null);
		break;
	default :
		System.out.println("Enter the Correct Option");
	}
	// TODO Auto-generated method stub
	
}

}
