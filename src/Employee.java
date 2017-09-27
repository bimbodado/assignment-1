public class Employee {
	private String name;
	private int hours;
	private double rate;
	private static Address[] address = new Address [6];
	
	public Employee (String name, int hours, double rate) {
		this.name = name;
		this.hours = hours;
		this.rate =  rate;
		
	}

	public static void main(String[] args) {
		
        Employee o1 = new Employee ("Falcao",40,15.50);
        address [0] = new Address ("Queen", 48, "K1P1N2");
        address [1] = new Address ("King Edward", 800, "K1N6N5");
	}

}
