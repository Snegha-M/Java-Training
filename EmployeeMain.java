import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
	String id;
	static List<Employee> employeeList = new ArrayList<Employee>();
	static String[] splittedVal;
	static File file = new File("D:\\program\\employee.csv");

	public void addEmployee() {
		Employee e1 = new Employee();
		System.out.println("Enter name:");
		Scanner name = new Scanner(System.in);
		String name1 = name.next();
		e1.setName(name1);
		System.out.println("Enter emp_id:");
		Scanner id = new Scanner(System.in);
		String id1 = id.next();
		e1.setEmp_id(id1);
		System.out.println("Enter age:");
		Scanner age = new Scanner(System.in);
		String age1 = age.next();
		e1.setAge(age1);
		System.out.println("Enter designation:");
		Scanner designation = new Scanner(System.in);
		String designation1 = designation.next();
		e1.setDesignation(designation1);
		System.out.println("Enter dob:");
		Scanner dob = new Scanner(System.in);
		String dob1 = dob.next();
		e1.setDob(dob1);
		employeeList.add(e1);
	}

	public void modifyEmployee() {

		System.out.println("Enter emp_id::");
		Scanner emp_id = new Scanner(System.in);
		String id = emp_id.next();
		for (Employee employee : employeeList) {
			if (id.equals(employee.getEmp_id())) {
				System.out.println("Enter new name:");
				Scanner name = new Scanner(System.in);
				String name2 = name.next();
				employee.setName(name2);
				System.out.println(name2);
				System.out.println("Enter new age:");
				Scanner age = new Scanner(System.in);
				String age2 = age.next();
				employee.setAge(age2);
				System.out.println("Enter new designation:");
				Scanner designation = new Scanner(System.in);
				String designation2 = designation.next();
				employee.setDesignation(designation2);
				System.out.println("Enter new dob:");
				Scanner dob = new Scanner(System.in);
				String dob2 = dob.next();
				employee.setDob(dob2);
				//employeeList.add(employee);
				

			}
		}
	}

	public void deleteEmployee() {
		System.out.println("Enter emp_id::");
		Scanner emp_id = new Scanner(System.in);
		String id = emp_id.next();
		for (Employee employee : employeeList) {
			if (id.equals(employee.getEmp_id())) {
				employeeList.remove(employee);
			}
			
			

		}
	}

	public void viewEmployee() {
		System.out.println("Enter emp_id::");
		Scanner emp_id = new Scanner(System.in);
		String id = emp_id.next();

		for (Employee employee : employeeList) {

			if (id.equals(employee.getEmp_id())) {
				
				System.out.println(employee.toString());

			}

		}

	}

	public void exit() throws IOException {
		file.delete();
		
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		for (Employee employee : employeeList) {
			writer.write(employee.toString()+"\n");
		}
		
		
		writer.close();
	}

	public static void menu() {
		System.out.println("1.Add new employee");
		System.out.println("2.Modify exist employee");
		System.out.println("3.Delete employee");
		System.out.println("4.View employee");
		System.out.println("5.Exit");
		System.out.println("Enter your option::");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));

		try {

			String line = br.readLine();

			while (line != null) {
				splittedVal = line.split(",");
				Employee e = new Employee();
				e.setName(splittedVal[0]);
				e.setEmp_id(splittedVal[1]);
				e.setAge(splittedVal[2]);
				e.setDesignation(splittedVal[3]);
				e.setDob(splittedVal[4]);
				employeeList.add(e);
				line = br.readLine();
				System.out.println(employeeList.size());
			}
			EmployeeMain employeeMain = new EmployeeMain();
			Scanner input = new Scanner(System.in);
			int option;

			do {
				menu();
				option = input.nextInt();
				switch (option) {
				case 1:
					employeeMain.addEmployee();
					break;
				case 2:
					employeeMain.modifyEmployee();
					break;
				case 3:
					employeeMain.deleteEmployee();
					break;
				case 4:
					employeeMain.viewEmployee();
					break;
				case 5:
					employeeMain.exit();
					break;
				default:
					System.out.println("\nInvalid input\n");
					break;
				}
			}while (option <5);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			br.close();

		}

	}
}
