package polymorphismDemo;

public class main {

	public static void main(String[] args) {
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.Log("Log mesajı");
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();
	}

}
