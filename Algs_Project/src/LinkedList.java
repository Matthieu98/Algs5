import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList{
	public static Node Head = null;
	
	public static void main(String [] args) throws IOException {
		LinkedList list = new LinkedList();
		BufferedReader fromKeyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Would you like to add any elements to the list? Y or N ");
		String result = fromKeyboard.readLine().toUpperCase();
		while(result.equals("Y")) {
			System.out.print("Please insert the value that you would like to add to the list: ");
			int value = Integer.parseInt(fromKeyboard.readLine());
			Node yeet = createNode(value);
			list.insert(yeet);
			System.out.print("Are there more elements you want to add to the list? Y or N ");
			result = fromKeyboard.readLine().toUpperCase();
		}
		System.out.print("Here is the list: ");
		display(Head);
		System.out.println("Goodbye and thanks for playing!");
	}
	
	public static Node createNode(int value) {
		Node node = new Node();
		node.data = value;
		node.next = null;
		return node;
	}
	
	public void insert(Node x) {
		if(Head == null){
			Head = x;
		}
		else {
			Node temp;
			temp = Head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = x;
		} 
	}
	
	public static void display(Node first) {
		for(Node x=first; x!=null; x=x.next)
	    {
	      System.out.print(x.data + " ");
	    }
	    System.out.println();
	}
}