package FileInput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Coping {
	public static void main(String[] args) throws IOException {
		try (FileInputStream fl = new FileInputStream("C:\\Users\\saisrinadh.porandla\\Text.txt")) {
			byte[] b=new byte[fl.available()];
			fl.read(b);
			String str=new String(b);
			str=str.toLowerCase();
			output(str);
			
		}
	}
		public static void output(String str) throws IOException
		{
			try (FileOutputStream fl = new FileOutputStream("C:\\Users\\saisrinadh.porandla\\Text1.txt")) {
				fl.write(str.getBytes());
			}
			
		}
		
			
		
		
		

}
