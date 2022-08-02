package PracticeProject;

public class Queue {
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	public void enQueue(int data)
	{
		queue[rear]=data;
		rear++;
		size++;
		
	}
	public int deQueue()
	{
		int data= queue[front];
		front++;
		size--;
		return data;
	}
	public void show()
	{
		System.out.println("Elements : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(queue[front+i]+ " ");
		}
	}
	public static void main(String[]args)
	{
		Queue q= new Queue();
		q.enQueue(5);
		q.enQueue(9);
		q.enQueue(7);
		q.enQueue(4);
		q.deQueue();
		q.show();
	}
}
