
public class Employee {
	private String name;
	private String emp_id;
	private String age;
	private String designation;
	private String dob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Employee(String name, String emp_id, String age, String designation, String dob) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.age = age;
		this.designation = designation;
		this.dob = dob;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return(name+ "," + emp_id + "," + age + "," + designation + "," + dob );
	}


	

}
