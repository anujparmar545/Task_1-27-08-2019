
public class BankAccount extends Bank{

	private String acno;
	private String name;
	private double balance;
	private String actype;
	
	private static int totalDeposits;
	private static int totalWithdrawls;
	
	public BankAccount(String acno, String name, double balance, String actype) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
		this.actype = actype;
	}

	public String getAcno() {
		return acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getActype() {
		return actype;
	}

	public void setActype(String actype) {
		this.actype = actype;
	}
	
	
	
	public static int getTotalDeposits() {
		return totalDeposits;
	}

	public static void setTotalDeposits(int totalDeposits) {
		BankAccount.totalDeposits = totalDeposits;
	}

	public static int getTotalWithdrawls() {
		return totalWithdrawls;
	}

	public static void setTotalWithdrawls(int totalWithdrawls) {
		BankAccount.totalWithdrawls = totalWithdrawls;
	}


}
