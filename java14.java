package StackPractise;

public class stackpractise {
	static Node top;
	static class Node
	{
	int data;
	Node next;
	Node(int d)
	{
	data=d;
	next=null;
	}
	}

	public void push(int data)
	{
	Node node = new Node(data);

	if (node == null)
	{
	System.out.print("overstack");
	return;
	}

//	System.out.println(data);
//	node.data = data;
	node.next = top;
top = node;
	}

	public boolean isEmpty()
	{
	return top == null;
	}


	public int peek()
	{
	return top.data;

	}

	public void pop()
	{

	if (top == null)
	{
	System.out.print("not overstack");
	return;
	}

	System.out.println(peek());
	top = (top).next;
	}

	public static void main(String[] args)
	{
		stackpractise stack = new stackpractise();

	stack.push(1);
	stack.push(2);
	stack.push(3);

	System.out.println("top no is " +  stack.peek());

	stack.pop();
	stack.pop();
	stack.pop();
	}

}
