import java.io.*;

public class DataInput_Stream {

	public static void main(String[] args) throws IOException {
		DataOutputStream dataOut = new DataOutputStream(
				new FileOutputStream("D:\\training\\spring\\learn-spring-framework\\Files\\src\\file.txt"));
		dataOut.writeUTF("hello");

		DataInputStream dataIn = new DataInputStream(
				new FileInputStream("D:\\training\\spring\\learn-spring-framework\\Files\\src\\file.txt"));

		while (dataIn.available() > 0) {
			String k = dataIn.readUTF();
			System.out.println(k + " ");
		}
	}

}
