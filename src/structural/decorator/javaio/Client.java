package structural.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {

	public static void main(String[] args) {
		int c;
		try {
			InputStream fis = new FileInputStream("resources/ALLCAPS.txt");
			InputStream bis = new BufferedInputStream(fis);
			InputStream lis = new LowerCaseInputStream(bis);
			
			while((c = lis.read()) >= 0) {
				System.out.print((char)c);
			}
			
			lis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
