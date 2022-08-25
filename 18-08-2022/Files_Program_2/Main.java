import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FileWriter writer = null;
		String str = null;

		try {
			File file = new File("D:\\program\\student.csv");
			
			file.createNewFile();
			
			writer = new FileWriter(file);
			
			
			List<Student> listOfStudent = new ArrayList<Student>();
			
			Student s1 = new Student("krishva",1,100);
			listOfStudent.add(s1);

			Student s2 = new Student("Snegha",2,97);
			listOfStudent.add(s2);
			
			Student s3 = new Student("Sumathi",3,100);
			listOfStudent.add(s3);
			
			Student s4 = new Student("kousi",4,97);
			listOfStudent.add(s4);
			
			String header ="Name ,id,Marks" ;
			writer.write(header+"\n");
	        
	  
			
			for(Student student:listOfStudent) {
				str = student.getName() + "," +  student.getId()+ "," + student.getMarks();
				System.out.println(str);
				writer.write(str+"\n");
			}
			
		}catch (IOException e) {
	        e.printStackTrace();
		}finally {
			writer.close();
		}
			
	}
}


