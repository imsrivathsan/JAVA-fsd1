package PracticeProject;
public class Stack{
	int stack[] = new int[5];
	int top=0;
	public void push(int data)
	{
		stack[top]=data;
		top++;
	}
	public int pop()
	{
		int data;
		top--;
		data = stack[top];
		stack[top]=0;
		return data;
	}
	public void show()
	{
		for(int n : stack)
		{
			System.out.print(n+ " ");
		}
	}
	public static void main(String[] args)
	{
		Stack nums = new Stack();
		nums.push(15);
		nums.push(6);
		nums.push(8);
		System.out.println(nums.pop());
		nums.show();
		
	}
}
