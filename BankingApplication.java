import java.util.Scanner;

class BankAccount{
	int balance = 5000;
	int pT;
	int amount;
	
	void deposite(int amount){
		if(amount != 0) {
			balance =  balance +amount  ;
			pT =amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance =  balance -  amount  ;
			pT =- amount;
		} 
	}
	 
	void getpT() {
		if(pT>0) {
			System.out.println("Deposited :"+pT);
		}else if(pT<0) {
			System.out.println("Withdraw :"+Math.abs(pT));
		}else {
			System.out.println("NO pT");
		}
	}
	
	 void showMenu() {		 
		 char option = '\0';
		 try (Scanner scan = new Scanner(System.in)) {

			 
			 do {
				 	 System.out.println("enter your choice");
					 System.out.println("A. Check Balance");
					 System.out.println("B .Deposite");
					 System.out.println("C . Withdraw");
					 System.out.println("D . pT");
					 System.out.println("E . Exit");
				 	option = scan.next().charAt(0);
				 	System.out.println("\n");
				 	
				 	switch(option) {
				 	case 'A' :
				 		System.out.println("BAlance"+balance);
				 		System.out.println("\n");
				 		break;
				 	case 'B' :
				 		System.out.println("Enter an amount to deposite");
				 		int amount = scan.nextInt();
				 		deposite(amount);
				 		System.out.println("\n");
				 		break;
				 	case 'C' :
				 		System.out.println("Enter an amount to Withdraw");
				 		System.out.println("Plz enter less  than $5000");
			 			amount= scan.nextInt();
				 		if(balance > amount & balance == 5000 ) {
				 			if(amount < 5000) {
					 			System.out.println("Withdraw Sucessfully :");
					 			withdraw(amount);
				 			}else {
				 				System.out.println("Plz enter less amount");
				 			}	
				 		}else {
				 			System.out.println("Plz Deposite Money");
				 		}
				 		
				 		System.out.println("\n");
				 		break;
				 	case 'D' :
				 		getpT();
				 		System.out.println("\n");
				 		break;
				 	case 'E' :
				 		System.out.println("Bye");
				 		System.out.println("\n");
				 		break;
				 	
				 	default :
				 		System.out.println("Inavlid option");
				 		
				 	}
			 }
			 while(option != 'E');
		}
		 
		 System.out.println("Thankyou for your service");
		 
	 }		 
}


public class BankingApplication {

	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount();
		obj1.showMenu();
	}
}
