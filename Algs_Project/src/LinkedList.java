import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList{
	public static int size = 0;
	public static Node Head = null;
	
	public static void main(String [] args) throws IOException {
		LinkedList list = new LinkedList();
		BufferedReader fromKeyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Would you like to add any elements to the list? Y or N ");
		String result = fromKeyboard.readLine();
		while(result.equals("Y")) {
			System.out.println("Please insert the value that you would like to add to the list: ");
			int value = Integer.parseInt(fromKeyboard.readLine());
			list.insert(value);
			list.print();
			System.out.println("Are there more elements you want to add to the list? Y or N");
			result = fromKeyboard.readLine();
		}
		System.out.println("Goodbye and thanks for playing!");
	}
	
	public void insert(Object value) {
		Node node = new Node();
		node.data = value;
		node.next = Head;
		Head = node;
		size++;
	}
	
	public String print() {
		Node temp = Head;
		String result = "";
		if(Head != null) {
			while(temp.next != null) {
				result = temp.data.toString() + " -> ";
				temp = temp.next;
			}
			result = temp.data.toString();
		}
		return result;
	}
}