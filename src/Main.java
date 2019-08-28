import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount customer1= new BankAccount("BA101", "Anuj", 5000, "Saving");
		BankAccount customer2= new BankAccount("BA102", "Faiz", 7000, "Current");
		BankAccount customer3= new BankAccount("BA103", "Mansi", 13000, "Saving");
		
		Bank b=new Bank();
		
		displayDetails(customer1);
		System.out.println();
		displayDetails(customer2);
		System.out.println();
		displayDetails(customer3);
		System.out.println();

		displayBankTransaction(b);
		withdraw(customer2,300);
		System.out.println();
		displayDetails(customer2);
		System.out.println();
		deposit(customer3,300);
		displayDetails(customer3);
		System.out.println();
		displayUserTransactions(customer2);
		double average=calculateAvgBalance(customer1,customer2,customer3);
		System.out.println("Average balance of all users is"+average);
		
		displayBankTransaction(b);
 
	}

	private static void displayBankTransaction(Bank b) {
		// TODO Auto-generated method stub

		System.out.println("Total deposits in whole bank is: "+b.getGlobalDeposits());
		System.out.println("Total Withdrawls in whole bank is: "+b.getGlobalWithdrawls());
		
	}

	private static double calculateAvgBalance(BankAccount...v) {
		// TODO Auto-generated method stub
		int sum=0,avg=0;
		for(BankAccount b:v)
		{
			sum+=b.getBalance();
			
		}
		avg=sum/v.length;
		
		return avg;
		
	}

	private static void displayUserTransactions(BankAccount obj) {
		// TODO Auto-generated method stub

		System.out.println("Total deposits done by "+obj.getName()+" is :"+obj.getTotalDeposits());
		System.out.println("Total Withdrawls done by "+obj.getName()+" is :"+obj.getTotalWithdrawls());
		
	}

	private static void withdraw(BankAccount obj, double amt) {
		// TODO Auto-generated method stub
		double x=obj.getBalance();
		x-=amt;
		obj.setBalance(x);
		
		int tw=obj.getTotalWithdrawls();
		tw+=1;
		obj.setTotalWithdrawls(tw);
		
		int gw=obj.getGlobalWithdrawls();
		gw+=1;
		obj.setGlobalWithdrawls(gw);
		

		System.out.println("Amount "+amt+" Withdrawn successfully by "+obj.getName());
		
	}
	
	private static void deposit(BankAccount obj, double amt) {
		// TODO Auto-generated method stub
		double x=obj.getBalance();
		x+=amt;
		obj.setBalance(x);
		
		int td=obj.getTotalDeposits();
		td+=1;
		obj.setTotalDeposits(td);
		
		int gd=obj.getGlobalDeposits();
		gd+=1;
		obj.setGlobalDeposits(gd);
		
		System.out.println("Amount "+amt+" Deposited successfully by "+obj.getName());
		
		
	}

	private static void displayDetails(BankAccount obj) {
		// TODO Auto-generated method stub
		System.out.println("A/C No is: "+obj.getAcno());
		System.out.println("A/C Name is: "+obj.getName());
		System.out.println("A/C Type is: "+obj.getActype());
		System.out.println("Balance is: "+obj.getBalance());
		
	}
	

}
