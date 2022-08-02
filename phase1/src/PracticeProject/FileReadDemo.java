package PracticeProject;
import java.io.IOException;
import java.io.FileReader;

public class FileReadDemo {
	public static void main(String[] args)
	{
		char [] data = new char[100];
		try{
			FileReader input = new FileReader("data.txt");
			input.read(data);
			System.out.println("Data received from a file");
			System.out.println(data);
			input.close();
		} catch (IOException ex)
		{
			System.out.println("File reaad error...");
		}
	}
}
