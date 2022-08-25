
public class Book {
	private String book_id;
	private String book_name;
	private String author_name;
	private boolean status;
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	
	public Book(String book_id, String book_name, String author_name, boolean status) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author_name = author_name;
		this.status = status;
	}
	public Book() {
		
	}
	@Override
	public String toString() {
		return(book_id+ "," + book_name + "," + author_name  );
	}
	
}
