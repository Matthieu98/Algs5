import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList{
	public static Node Head = null;
	public static int size = 0;
	
	public static void main(String [] args) throws IOException {
		LinkedList list = new LinkedList();
		BufferedReader fromKeyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Would you like to add any elements to the list? Y or N ");
		String result = fromKeyboard.readLine().toUpperCase();
		while(result.equals("Y")) {
			System.out.print("Please insert the value that you would like to add to the list: ");
			int value = Integer.parseInt(fromKeyboard.readLine());
			System.out.print("Where would you like to put this value? Middle(M), End(E), or in a specific position(P)? ");
			String spot = fromKeyboard.readLine().toUpperCase();
			Node yeet = createNode(value);
			if(spot.equals("M")) {
				list.insertAtMid(yeet);
			}else if (spot.equals("E")) {
				list.insertRear(yeet);
			}else if (spot.equals("P")) {//THIS DOES NOT WORK YET
				System.out.print("What position would you like to put this value at? ");
				int pos = Integer.parseInt(fromKeyboard.readLine());
				list.insertPosition(yeet, pos);
			}else {
				System.out.println("You need to choose where to put your value!");
			}
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
	
	public void insertRear(Node x) {
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
		size++;
	}
	
	public void insertPosition(Node x, int i) {
		if(Head == null){
			Head = x;
		}
		else {
			Node temp, ptr;
			temp = x;
			ptr = Head;
			int t = 0;
			if(i < 0 || i > size+1) {
				System.out.println("Invalid spot number");
				return;
			}
			while(t<i) {
				if(temp.next == null) {
					break;
				}
				temp = temp.next;
				System.out.print(temp.data + " : ");
				t++;
			}
			temp.next = x;
			x=temp;
			size++;
		} 
	}
	
	public void insertAtMid(Node x) { 
        if (Head == null) {
        	Head = x;
        }
        else { 
            Node temp = x;
            Node ptr = Head;
            int len = 0;
            while (ptr != null) { 
                len++;
                ptr = ptr.next;
            } 
            int count = ((len % 2) == 0) ? (len / 2) : (len + 1) / 2;
            ptr = Head;
            while (count > 1) {
                ptr = ptr.next;
                count--;
            }
            temp.next = ptr.next;
            ptr.next = temp;
        }
        size++;
    }
	
	public static void display(Node first) {
		for(Node x=first; x!=null; x=x.next)
	    {
	      System.out.print(x.data + " ");
	    }
	    System.out.println();
	}
}