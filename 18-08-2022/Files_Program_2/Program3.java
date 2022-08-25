import java.io.*;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {
		FileWriter writer = null;
		try {
			File file = new File("D:\\program\\sample1.csv");
			file.createNewFile();
			writer = new FileWriter(file);
			BufferedReader br = new BufferedReader(new FileReader("D:\\program\\sample.txt"));
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
			
				int count = 0;
				String[] splittedVal = str.split(" ");
				System.out.println("splittedVal.length::"+splittedVal.length);
			for (int j = 0; j < splittedVal.length; j++) {
				
					writer.write(splittedVal[j]);
					if ((j + 1) % 5 == 0) {
						writer.write("\n");
					} else {
						writer.write(",");
					}
				} 
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
