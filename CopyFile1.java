import java.io.*;
public class CopyFile1 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\training\\spring\\learn-spring-framework\\Files\\src\\input.txt");
			out = new FileOutputStream("D:\\training\\spring\\learn-spring-framework\\Files\\src\\output.txt");
			
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
