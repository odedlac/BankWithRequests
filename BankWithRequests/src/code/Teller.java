package code;

public class Teller {

	private OpenAccountHandler openAccountRequest;
	private WithdrawMoneyHandler withdrawMoneyRequest;

	public Teller(OpenAccountHandler openAccountRequest,
			WithdrawMoneyHandler withdrawMoneyRequest) {
		this.openAccountRequest = openAccountRequest;
		this.withdrawMoneyRequest = withdrawMoneyRequest;
	}

	public boolean handleRequest(MyRequest myRequest) {
		if(openAccountRequest.handleRequest(myRequest)){
			return true;
		}
		if(withdrawMoneyRequest.handleRequest(myRequest)){
			return true;
		}		
		return false;
	}

}
