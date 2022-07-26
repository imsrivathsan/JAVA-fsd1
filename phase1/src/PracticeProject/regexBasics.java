package PracticeProject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regexBasics {
	public static void main(String[] args)
	{
		String sentence = "Time is gold";
		Pattern p = Pattern.compile("gold");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group()+ " starts at "+m.start());
		}
		
	}
}
