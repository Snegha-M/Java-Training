import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserOperations {

	static List<UserDetails> userDetails = new ArrayList<UserDetails>();

	public static void options() {
		System.out.println("1.Account open");
		System.out.println("2.Amount Deposit");
		System.out.println("3.Amount withdrawal");
		System.out.println("4.Account Active/Inactive");
		System.out.println("5.Total no of account holders");
		System.out.println("6.Total amount in bank");
		System.out.println("Enter your option::");
	}

	public void openAccount() {
		UserDetails u1 = new UserDetails();
		System.out.println("Enter holder_name:");
		Scanner name = new Scanner(System.in);
		String name1 = name.next();
		u1.setHolder_name(name1);
		System.out.println("Enter age:");
		Scanner age = new Scanner(System.in);
		int age1 = age.nextInt();
		u1.setAge(age1);
		System.out.println("Enter dob:");
		Scanner dob = new Scanner(System.in);
		String dob1 = dob.next();
		u1.setDob(dob1);
		System.out.println("Enter city:");
		Scanner city = new Scanner(System.in);
		String city1 = city.next();
		u1.setCity(city1);
		System.out.println("Enter state:");
		Scanner state = new Scanner(System.in);
		String state1 = state.next();
		u1.setState(state1);
		System.out.println("Enter Account type:");
		Scanner acc_type = new Scanner(System.in);
		String acc_type1 = acc_type.next();
		u1.setAcc_type(acc_type1);
		int acc_no = userDetails.size();
		acc_no += 1;
		u1.setAcc_no(acc_no);
		boolean isUserExist = true;
		u1.setStatus(isUserExist);
		userDetails.add(u1);
	}

	public void depositAmount() {
		System.out.println("Enter acc_no:");
		Scanner acc_num = new Scanner(System.in);
		long acc_num1 = acc_num.nextLong();
		boolean isUserExist = false;
		for (UserDetails user : userDetails) {
			if (acc_num1 == (user.getAcc_no())) {
				isUserExist = true;
				Transaction transaction = new Transaction();

				System.out.println("Enter Amount:");
				Scanner amount = new Scanner(System.in);
				double amount1 = amount.nextDouble();
				transaction.setAmount(amount1);
				
				String trans_type = "Credit";
				transaction.setTransaction_type(trans_type);
				
				LocalDateTime datetime = java.time.LocalDateTime.now();
				transaction.setDatetime(datetime);				
				user.getListOfTransaction().add(transaction);
			}
			if(!isUserExist) {
				System.out.println("insufficient balance");
			}
		}
	}

	public void withdrawAmount() {
		System.out.println("Enter acc_no:");
		Scanner acc_num = new Scanner(System.in);
		long acc_num1 = acc_num.nextLong();
		boolean isUserExist = false;
		for (UserDetails user : userDetails) {
			if (acc_num1 == (user.getAcc_no())) {
				isUserExist = true;
				System.out.println("Enter Amount:");
				Scanner amount = new Scanner(System.in);
				double amount2 = amount.nextDouble();

				double creditTotalAmount = 0;
				double debitTotalAmount = 0;
				for (Transaction trans : user.getListOfTransaction()) {
					if (trans.getTransaction_type().equals("Credit")) {
						creditTotalAmount += trans.getAmount();
					} else if (trans.getTransaction_type().equals("Debit")) {
						debitTotalAmount += trans.getAmount();
					}
				}
				if (amount2 < (creditTotalAmount - debitTotalAmount)) {
					System.out.println("Allow to Debit");
					Transaction transaction1 = new Transaction();
					transaction1.setAmount(amount2);

					String trans_type = "Debit";
					transaction1.setTransaction_type(trans_type);
					
					LocalDateTime datetime = java.time.LocalDateTime.now();
					transaction1.setDatetime(datetime);
					user.getListOfTransaction().add(transaction1);

				} else {
					System.out.println("Insufficient balance in your account");
				}
			}
		}
		if(!isUserExist) {
			System.out.println("insufficient balance");
		}
	}
	
	public void status() {
		System.out.println("Enter acc_no:");
		Scanner acc_num = new Scanner(System.in);
		long acc_num1 = acc_num.nextLong();
		
		for (UserDetails user : userDetails) {
			if (acc_num1 == (user.getAcc_no())) {
		
			if(user.isStatus()) {
				user.setStatus(false);
				System.out.println("user account inactivated");
			}
			else {
				user.setStatus(true);
				System.out.println("user account activated");
			}
	}
		}
	}
	
	public void totalHolder() {
		System.out.println("total no of users:"+userDetails.size());
		
	}
	
	public void totalAmount() {
		double totalAmount = 0;
		
		for (UserDetails user : userDetails) {
			double creditTotalAmount = 0;
			double debitTotalAmount = 0;
		
		for (Transaction trans : user.getListOfTransaction()) {
			if (trans.getTransaction_type().equals("Credit")) {
				creditTotalAmount += trans.getAmount();
			} else if (trans.getTransaction_type().equals("Debit")) {
				debitTotalAmount += trans.getAmount();
			}
			
		}
		totalAmount += (creditTotalAmount-debitTotalAmount);
		}
		System.out.println("total amount in bank:"+totalAmount);
	}
	
	
	public static void main(String[] args) {

		UserOperations userOperations = new UserOperations();
		Scanner input = new Scanner(System.in);
		int option;
		do {
			options();
			option = input.nextInt();
			switch (option) {
			case 1:
				userOperations.openAccount();
				break;
			case 2:
				userOperations.depositAmount();
				break;
			case 3:
				userOperations.withdrawAmount();
				break;
			case 4:
				userOperations.status();
				break;
			case 5:
				userOperations.totalHolder();
				break;
			case 6:
				userOperations.totalAmount();
				break; 
			default:
				System.out.println("\nInvalid input\n");
				break;
			}
		} while (option < 7 && option != 0);

	}

}
