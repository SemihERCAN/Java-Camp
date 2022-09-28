package classes;

public class main {

	public static void main(String[] args) {
		customerManager customerManager = new customerManager();
		customerManager customerManager2 = new customerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		customerManager2.Add();
	}

}
