import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Address address = new Address();
		address.setHouseNumber("G-4");
		address.setStreetAddress("nnnng");
		address.setCity("guntur");
		address.setState("Telangana");
		address.setPinCode("56771");
		
		Customer customer1 = new Customer();
		customer1.setFirstName("xyz");
		customer1.setLastName("abc");
		customer1.setAge(19);
		customer1.setGender("male");
		customer1.setAddress(address);
		customer1.setAccount(new SavingAccount(101));
		
		Customer customer2 = new Customer();
		customer2.setFirstName("xyz");
		customer2.setLastName("abc");
		customer2.setAge(19);
		customer2.setGender("male");
		customer2.setAddress(address);
		customer2.setAccount(new CurrentAccount(201));
		
		while(true) {
			System.out.println("\n1.Saving Account 2.Current Account 3.Exit");
			System.out.println("Enter Your choice:");
			Integer choice = Integer.parseInt(scan.next());
			System.out.println("\n1.Deposite 2.Withdraw 3.Check Balance 4.Exit");
			switch(choice) {
			case 1:
				Integer savingAChoice = Integer.parseInt(scan.next());
				switch(savingAChoice) {
				case 1:
					System.out.println("Enter amount you want to deposit::");
					Long amount = Long.parseLong(scan.next());
					customer1.getAccount().deposit(amount);
					break;
				case 2:
					System.out.println("Enter amount you want to withdraw::");
					Long amount1 = Long.parseLong(scan.next());
					customer1.getAccount().withdraw(amount1);
					break;
				case 3:
					System.out.println("Remaining balance is "+ customer1.getAccount().balanceCheck());
					break;
				case 4:
					System.exit(0);
				}
				break;
				
				
			case 2:
				Integer currentAChoice = Integer.parseInt(scan.next());
				switch(currentAChoice) {
				case 1:
					System.out.println("Enter amount you want to deposit::");
					Long amount = Long.parseLong(scan.next());
					customer2.getAccount().deposit(amount);
					break;
				case 2:
					System.out.println("Enter amount you want to withdraw::");
					Long amount1 = Long.parseLong(scan.next());
					customer2.getAccount().withdraw(amount1);
					break;
				case 3:
					System.out.println("Remaining balance is "+ customer2.getAccount().balanceCheck());
					break;
				case 4:
					System.exit(0);
				}
				break;
			case 3:
				System.exit(1);
			}
		}

	}

}
