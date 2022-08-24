import java.util.ArrayList;
import java.util.List;

public class UserDetails {
	private String holder_name;
	private int age;
	private String dob;
	private String city;
	private String state;
	private String acc_type;
	private long acc_no;
	private boolean status;
	private int total_holder;
	private double total_amount;
	private List<Transaction> listOfTransaction;
	

	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public int getTotal_holder() {
		return total_holder;
	}
	public void setTotal_holder(int total_holder) {
		this.total_holder = total_holder;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	public String getHolder_name() {
		return holder_name;
	}
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public List<Transaction> getListOfTransaction() {
		if(listOfTransaction==null) {
			listOfTransaction=new ArrayList<>();
		}
		return listOfTransaction;
	}
	public void setListOfTransaction(List<Transaction> listOfTransaction) {
		this.listOfTransaction = listOfTransaction;
	}
	public UserDetails(String holder_name, int age, String dob, String city, String state, String acc_type, long acc_no, List<Transaction> listOfTransaction, boolean status, int total_holder, double total_amount) {
		super();
		this.holder_name = holder_name;
		this.age = age;
		this.dob = dob;
		this.city = city;
		this.state = state;
		this.acc_type = acc_type;
		this.acc_no = acc_no;
		this.listOfTransaction = listOfTransaction;
		this.status = status;
		this.total_holder = total_holder;
		this.total_amount = total_amount;
	}
	
	public UserDetails() {
		
	}
	
	
	
	
	
	
}
	

	


