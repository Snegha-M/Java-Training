import java.io.*;

public class Student {
	private String name;
	private int id;
	private int marks;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public Student(String name, int id, int marks) {
			super();
			this.name = name;
			this.id = id;
			this.marks = marks;
		}


		
		

}


