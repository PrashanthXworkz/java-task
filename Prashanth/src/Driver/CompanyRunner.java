package Driver;
import Things.Employee;

public class CompanyRunner {
	public static void main(String [] args) {
		Employee e=new Employee();
		e.setCompanyName("altos");
		e.setCode(789);
		e.setCompanyHr("ramesh");
		e.setSalary(70000);
		
		String name=e.getCompanyName();
		System.out.println("The company name is:"+name);
		int code=e.getCode();
		System.out.println("code is:"+code);
		String hr=e.getCompanyHr();
		System.out.println("The company HR:"+hr);
		double income=e.getSalary();
		System.out.println("the salry:"+income);
		
	}

}
