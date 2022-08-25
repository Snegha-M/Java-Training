
public class StudentDetails {
	private String name;
	private String std;
	private String id;
	private String dob;
	private String f_name;
	private String m_name;
	private String marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public StudentDetails(String name, String std, String id, String dob, String f_name, String m_name, String marks) {
		super();
		this.name = name;
		this.std = std;
		this.id = id;
		this.dob = dob;
		this.f_name = f_name;
		this.m_name = m_name;
		this.marks = marks;
	}
	

	public StudentDetails() {
		
	}
	
	
}
