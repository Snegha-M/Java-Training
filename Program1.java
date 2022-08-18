import java.io.*;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) throws IOException {

		System.out.println("User File Path::");
		Scanner filepath = new Scanner(System.in);
		String fp = filepath.next();

		System.out.println("Enter File Name::");
		Scanner filename = new Scanner(System.in);
		String fn = filename.next();
		
		File file = new File(fp, fn);
		
		FileWriter writer = new FileWriter(fp + "\\" + fn);
		try {

			file.createNewFile();

			if (file.exists()) {
				System.out.println(fn + " exists");
				System.out.println("Enter content enter 'q' or 'exit' to quit");
				Scanner inputvalue = new Scanner(System.in);
				String input;
				do {

					input = inputvalue.next();
					System.out.println(input);
					writer.write(input);

				}

				while (!input.equals("q") && !input.equals("exit"));
			} else {
				System.out.println(fn + " does not exist");
			}

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} finally {
			writer.close();
			System.out.println("your file has been successfully saved in the given path " + fp + "\\" + fn);

		}

	}

}
