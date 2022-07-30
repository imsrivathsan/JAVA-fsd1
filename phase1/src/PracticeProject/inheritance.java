package PracticeProject;

public class inheritance  extends Thread {
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		inheritance th = new inheritance();
		System.out.println("Using inheritance method we going to extend the thread");
		th.start();
	}

}
