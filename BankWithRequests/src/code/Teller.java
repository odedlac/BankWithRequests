package code;

public class Teller {

	private OpenAccountRequest openAccountRequest;
	private WithdrawMoneyRequest withdrawMoneyRequest;

	public Teller(OpenAccountRequest openAccountRequest,
			WithdrawMoneyRequest withdrawMoneyRequest) {
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
