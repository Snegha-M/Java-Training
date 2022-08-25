import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	static List<Student> listOfStudent = new ArrayList<Student>();
	static List<Book> listOfLibraryBooks = new ArrayList<Book>();
	
	public static void options() {
		System.out.println("1.Add Student");
		System.out.println("2.Add book");
		System.out.println("3.Issue book to student");
		System.out.println("4.Return book to library");
		System.out.println("5.Current no of books");
		System.out.println("Enter your option::");
	}

	public void addStudent() {
		Student s1 = new Student();
		System.out.println("Enter student name:");
		Scanner name = new Scanner(System.in);
		String name1 = name.next();
		s1.setStudent_name(name1);
		System.out.println("Enter student id:");
		Scanner stu_id = new Scanner(System.in);
		String stu_id1 = stu_id.next();
		s1.setStudent_id(stu_id1);
		listOfStudent.add(s1);
	}

	public void addBook() {
		Book b1 = new Book();
		System.out.println("Enter book id:");
		Scanner b_id = new Scanner(System.in);
		String b_id1 = b_id.next();
		b1.setBook_id(b_id1);
		System.out.println("Enter book name:");
		Scanner b_name = new Scanner(System.in);
		String b_name1 = b_name.next();
		b1.setBook_name(b_name1);
		System.out.println("Enter author name:");
		Scanner a_name = new Scanner(System.in);
		String a_name1 = a_name.next();
		b1.setAuthor_name(a_name1);
		boolean isBookExist = true;
		b1.setStatus(isBookExist);
		listOfLibraryBooks.add(b1);

	}
	
	public void issueBook() {
		System.out.println("Enter student_id:");
		Scanner stu_id = new Scanner(System.in);
		String stu_id1 = stu_id.next();
		boolean isStudentExist = false;
		boolean isBookExist = false;
		for (Student s : listOfStudent) {
			if (stu_id1.equals(s.getStudent_id())) {
				isStudentExist = true;
				System.out.println("Enter book id:");
				Scanner b_id = new Scanner(System.in);
				String b_id2 = b_id.next();
				
				for (Book b : listOfLibraryBooks) {
					if (b_id2.equals(b.getBook_id())) {
						if (b.isStatus()) {
							b.setStatus(true);
							System.out.println("book available");
							s.getListOfStudentBooks().add(b);
							b.setStatus(false);

						}
					}
				}

			}

		}
	}
	
	public void returnBook() {
		System.out.println("Enter student_id:");
		Scanner stu_id = new Scanner(System.in);
		String stu_id1 = stu_id.next();
		boolean isStudentExist = false;
		for (Student s : listOfStudent) {
			if (stu_id1.equals(s.getStudent_id())) {
				isStudentExist = true;
				System.out.println("Enter book id:");
				Scanner b_id = new Scanner(System.in);
				String b_id2 = b_id.next();
				for (Book b : listOfLibraryBooks) {
					if (b_id2.equals(b.getBook_id())) {
						if (b.isStatus()) {
							
							b.setStatus(true);
							s.deleteStudentBook(b_id2);
						/*for(Book studentBook : s.getListOfStudentBooks()) {
							if(studentBook.getBook_id().equals(b.getBook_id())) {
								s.
							}
								
							}*/
						}
					}
				}
			}
		}
	}
	
	public void currentNoOfBooks() {
		System.out.println("Current No Of Books"+listOfLibraryBooks.size());
	}
	
	public static void main(String[] args) {
		Library library = new Library();
		Scanner input = new Scanner(System.in);
		int option;
		do {
			options();
			option = input.nextInt();
			switch (option) {
			case 1:
				library.addStudent();
				break;
			case 2:
				library.addBook();
				break;
			case 3:
				library.issueBook();
				break;
			case 4:
				library.returnBook();
				break;
			case 5:
				library.currentNoOfBooks();
				break;
			default:
				System.out.println("\nInvalid input\n");
				break;
			}
		} while (option < 6 && option != 0);

	}

}


