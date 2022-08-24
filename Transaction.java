import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {
	private String transaction_type;
	private double amount;
	private LocalDateTime datetime;
	
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Transaction(String transaction_type, double amount, LocalDateTime datetime) {
		super();
		this.transaction_type = transaction_type;
		this.amount = amount;
		this.datetime = datetime;
	}
	public Transaction() {
		
	}
	
	
	
	
}
