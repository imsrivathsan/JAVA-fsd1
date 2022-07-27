package PracticeProject;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailValidator {
	
	private static final String regex = "^(.+)@(.+)$";
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		List<String> emails = new ArrayList<String>();
		while(sc.hasNext())
		{
		    String i = sc.next();
		    emails.add(i);
		    if(sc.hasNext("end")){
		        break;
		    }
		    
		}
		Pattern pattern = Pattern.compile(regex);
		for(String value : emails){
		    Matcher matcher = pattern.matcher(value);
		    System.out.println("The Email address " + value + " is "+(matcher.matches()? "valid" :"invalid"));
		}
	}

}
