package assignmentsales;

public class BankDetails implements java.io.Serializable {

	private int accountNo;
	private int accountPinNo;
	private float bankAccountBalanceAmount;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getAccountPinNo() {
		return accountPinNo;
	}

	public void setAccountPinNo(int accountPinNo) {
		this.accountPinNo = accountPinNo;
	}

	public float getBankAccountBalanceAmount() {
		return bankAccountBalanceAmount;
	}

	public void setBankAccountBalanceAmount(float bankAccountBalanceAmount) {
		this.bankAccountBalanceAmount = bankAccountBalanceAmount;
	}

}
