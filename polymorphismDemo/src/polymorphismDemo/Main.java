package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// int[] sayilar
		
		
//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new EmailLogger() };
//		for (BaseLogger logger : loggers) {
//		logger.log("Logland�");
//		}
		
		CustomerManager customerManager =new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
	}

}
