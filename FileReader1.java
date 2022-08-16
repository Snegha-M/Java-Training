import java.io.*;
public class FileReader1 {

	public static void main(String[] args) throws IOException {
		File file = new File("Hello1.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		
		writer.write("this\n is\n an\n examplae\n");
		writer.flush();
		writer.close();
		
		FileReader fr = new FileReader(file);
		char [] a = new char[50];
		fr.read(a);
		
		for(char c: a)
			System.out.println(c);
		fr.close();
		
	}

}
