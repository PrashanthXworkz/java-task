package Things;

public class Employee extends Company1 {
	
	public Employee() {
		super("gio",56,"prathap",9000);
		System.out.println("The employee joined the company");
		System.out.println(super.getCompanyName());
		System.out.println(super.getCompanyHr());
		System.out.println(super.getCode());
		System.out.println(super.getSalary());
		}

}
