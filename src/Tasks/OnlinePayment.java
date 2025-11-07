package Tasks;

public abstract class OnlinePayment implements Payment {
	String accountId;
	void connect() {
		System.out.println("Connected");
	}
	abstract void authenticate();

}
