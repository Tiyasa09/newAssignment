package ATM.com;

import java.util.Scanner;

 class ATM1 {
	double amount=15000;
	Scanner sc=new Scanner(System.in);
	void withdraw(double amount) {
		
		if(this.amount<amount) {
			System.out.println("Insufficient balance");
		
		}
		this.amount-=amount;
		System.out.println("Now your balance is:"+this.amount);

	}
	void deposit(double amount) {
		
		this.amount+=amount;
		
		System.out.println("Now your balance is:"+this.amount);
		
	}

}
public class ATM extends ATM1{
	public static void main(String[] args) {
		ATM1 atm=new ATM1();
		Scanner scan=new Scanner(System.in);
		System.out.println("WELCOME TO ATM ");
		while(true) {
		System.out.println("press 1 for withdraw........"
				+ "press 2 for deposit......"
				+ "press 3 for exit....");
		int variable = scan.nextInt();
		switch(variable) {
		case 1:
			atm.withdraw(3000);
			break;
		case 2:
			atm.deposit(5000);
			break;
		
		case 3:
			System.out.println("Thank you......");
			break;
			
		}
	}
	}
}
