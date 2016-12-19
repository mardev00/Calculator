package com.dev.calc;

import java.util.Iterator;


public class IntStack<Integer>  {
private Node first;
int N;

public void push(int item)
{
   Node oldfirst = first;
   Node n = new Node();
   n.item = item;
   n.next = oldfirst;
   first = n;
   N++;   

}


public int  pop()
{
   int item = first.item;
   first = first.next;
   N--;
   return item;
}

public int peek()
{
	if(first == null)
		return -1;
	else
		return first.item;
			
}


public boolean isEmpty() 
{
   return first == null;

}

public int size()
{
   return N;
}

private class Node
{
   private int item;
   private Node next;

}







}
