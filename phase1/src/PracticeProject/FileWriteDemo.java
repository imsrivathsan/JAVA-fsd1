package PracticeProject;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriteDemo {
	public static void main(String[] args)
	{
		String data = "2302,Srivathsan,Villupuram,TamilNadu,inda ";
		try{
			FileWriter output = new FileWriter("data.txt");
			output.write(data);
			System.out.println("Data is written Successfully"); 
			output.close();
		}catch (IOException ex){
			System.out.println("File write Error....");
		}
	}
}
