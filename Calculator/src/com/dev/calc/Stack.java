package com.dev.calc;

import java.util.Iterator;


public class Stack<Item> implements Iterable<Item> {
private Node first;
int N;

public void push(Item item)
{
   Node oldfirst = first;
   Node n = new Node();
   n.item = item;
   n.next = oldfirst;
   first = n;
   N++;   

}

public Item peek()
{
	if(first == null)
		return null;
	else
		return first.item;
			
}


public Item  pop()
{
   Item item = first.item;
   first = first.next;
   N--;
   return item;
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
   private Item item;
   private Node next;

}



   public Iterator<Item> iterator() {
      return new ListIterator();
   }

private class ListIterator implements Iterator<Item>
   {  
      private Node current = first;
      public boolean hasNext() 
      {
         return current.next != null;
      }

      public void remove() { }

      public Item next() 
      {
         Item item = current.item;
         current = current.next;
         return item;

      }

   }


}
