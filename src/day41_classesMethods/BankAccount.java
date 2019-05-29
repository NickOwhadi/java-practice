package day41_classesMethods;

public class BankAccount {
   double balance;
   String accountHolder;
   int accountNumber;
   
   
   
   public void deposit(double amount) {
	   System.out.println("depositing $"+amount+"to"+accountNumber);
	   balance+=amount;
   }
   public void withdraw(double amount) {
	   System.out.println("withdrawing $"+amount+"from"+accountNumber);
	   balance=balance-amount;
	   if(balance<0) {
		   balance-=35;
	   }
	   
   }
   public void showBalance() {
	   System.out.println("============================");
	   System.out.println(accountNumber);
	   System.out.println(balance);
   }	
	
	public void charge(double price, String item) {
		if(price<=balance) {
			System.out.println("Buying "+item+"for $"+price+"from account"+accountNumber);
			balance-=price;
		}else {
			System.out.println("insufficent money to buy");
		}
		
	}
	
	
	
	
}
