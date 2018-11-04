import java.util.Iterator;
import java.util.Arrays;

public class LinkedList2{
	  public static class Node
	  {
	    private int item;
	    private Node next;
	  }
	  
	  public static void main(String [] args)
	  {
	    int [] arr = {1, 2, 3, 7, 34, 5, 6, 435, 5, 4};
	    Node head=buildList(arr);
	    displayList(head);
	    displayList(removeMax(head));
	  }
	  
	  public static void displayList(Node first)
	  {
	    for(Node x=first; x!=null; x=x.next)
	    {
	      System.out.print(x.item + " ");
	    }
	    System.out.println();
	  }
	  
	  public static Node removeMax(Node first)
	  {
	    Node theNode = first;
	    Node largestNode = first;
	    Node previous = first;
	    Node current = first;
	    while(theNode != null)
	    {
	      if(theNode.item > largestNode.item)
	      {
	        largestNode = theNode;
	        theNode = theNode.next;
	      }
	      else
	      {
	        theNode = theNode.next;
	      }
	    }
	    
	    if (largestNode==first){
	      first=first.next;
	    }
	    else 
	    {
	      while(current.item != largestNode.item)
	      {
	        previous = current;
	        current = current.next;
	      }
	      previous.next = current.next;
	    }
	    return first;
	  }
	  
	  public static Node buildList(int [] a)
	  {
	    Node first = new Node();
	    first.item = a[0];
	    Node theNode = first;
	    for(int i=1; i<a.length; i++)
	    {
	      Node oneNode = new Node();
	      oneNode.item = a[i];
	      theNode.next = oneNode;
	      theNode = theNode.next;
	    }
	    return first;
	  }
}