import java.io.*;
public class CopyFile2 {

	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("D:\\training\\spring\\learn-spring-framework\\Files\\src\\input.txt");
			out = new FileWriter("D:\\training\\spring\\learn-spring-framework\\Files\\src\\output.txt");
			
			int c;
			while((c = in.read())!= -1) {
				out.write(c);
			}
		}finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}

}
