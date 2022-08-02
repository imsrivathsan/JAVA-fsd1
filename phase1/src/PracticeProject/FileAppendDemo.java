package PracticeProject;

import java.io.FileWriter;
import java.io.IOException;
public class FileAppendDemo {
	public static void main(String[]args)
	{
		String data = "This data is appended....";
		try{
			FileWriter output = new FileWriter("data.txt",true);
			output.write(data);
			System.out.println("Data appended Successfully");
			output.close();
		}
		catch (IOException ex){
			System.out.println("File append error....");
		}
	}
}
