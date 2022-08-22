import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetailProvider {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:\\program\\Student_Details.csv"));
		String str;
		String[] splittedVal;
		List<StudentDetails> StudentList = new ArrayList<StudentDetails>();
try {
		
			String line = br.readLine();

			while (line != null) {
				
				
				splittedVal = line.split(",");
				StudentDetails s = new StudentDetails();
				s.setName(splittedVal[0]);
				s.setStd(splittedVal[1]);
				s.setId(splittedVal[2]);
				s.setDob(splittedVal[3]);
				s.setF_name(splittedVal[4]);
				s.setM_name(splittedVal[5]);
				s.setMarks(splittedVal[6]);
				StudentList.add(s);
				line = br.readLine();
				

			}

		
		
		System.out.println("Enter id::");
		Scanner roll_no = new Scanner(System.in);
		String id = roll_no.next();

		for (StudentDetails studentDetails : StudentList) {
			
			if (id.equals(studentDetails.getId())) {
				
				System.out.println(studentDetails.getName() + "," + studentDetails.getStd() + ","
						+ studentDetails.getId() + "," + studentDetails.getDob() + "," + studentDetails.getF_name()
						+ "," + studentDetails.getM_name() + "," + studentDetails.getMarks());
				
			} 
			
		}
}catch(IOException e) {
    e.printStackTrace();
}finally {
	br.close();
}

	}
}

