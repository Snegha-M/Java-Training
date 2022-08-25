import java.util.ArrayList;
import java.util.List;

public class Student {
	private String student_name;
	private String student_id;
	private List<Book> listOfStudentBooks;
	
	public void deleteStudentBook(String book_id ) {
		System.out.println("Before deleting books count:"+listOfStudentBooks);
		Book deleteBook =null;
		for(Book del : listOfStudentBooks) {
			if(book_id.equals(del.getBook_id())) {
				deleteBook=del;
				break;
			}
		}
		if(deleteBook!=null)
			listOfStudentBooks.remove(deleteBook);
		
		System.out.println("After deleting books count:"+listOfStudentBooks);
	}
	
	
	public List<Book> getListOfStudentBooks() {
		if(listOfStudentBooks==null) {
			listOfStudentBooks = new ArrayList<>();
		}
		return listOfStudentBooks;
	}
	public void setListOfStudentBooks(List<Book> listOfStudentBooks) {
		this.listOfStudentBooks = listOfStudentBooks;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String stu_id1) {
		this.student_id = stu_id1;
	}
	
	public Student(String student_name, String student_id, List<Book> listOfStudentBooks) {
		super();
		this.student_name = student_name;
		this.student_id = student_id;
		this.listOfStudentBooks = listOfStudentBooks;
		
	}
	public Student() {
		
	}
	
	
	
}
