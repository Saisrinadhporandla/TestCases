package FileInput;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;;

public class File {
	public static void main(String[] args) {
		try {
			FileOutputStream src=new FileOutputStream("C:\\Users\\saisrinadh.porandla\\Text.txt");
			String s="SAISRINADh";
			src.write(s.getBytes());
			src.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
