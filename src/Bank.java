
public class Bank {

	private static int globalDeposits;
	private static int globalWithdrawls;
	
	
	public static int getGlobalDeposits() {
		return globalDeposits;
	}
	public static void setGlobalDeposits(int globalDeposits) {
		Bank.globalDeposits = globalDeposits;
	}
	public static int getGlobalWithdrawls() {
		return globalWithdrawls;
	}
	public static void setGlobalWithdrawls(int globalWithdrawls) {
		Bank.globalWithdrawls = globalWithdrawls;
	}
	
	
}
