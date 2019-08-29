import java.util.LinkedList;
import java.util.Scanner;

public class Linklist {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		int n,i;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first node: ");
		ll.addFirst(scanner.next());
		System.out.print("Enter no. of elements in linked list: ");
		n=scanner.nextInt();
		System.out.print("Enter elements at the last: ");
		for(i=0;i<n;i++)
			ll.addLast(scanner.next());
		System.out.println(ll);
		System.out.println("First element is "+ll.getFirst());
		System.out.println("Last element is "+ll.getLast());
		System.out.println("Last index of element a is "+ll.lastIndexOf("a"));
		System.out.println("Retrieve first element of list: "+ll.pollFirst());
		System.out.println("Retrieve last element of list: "+ll.pollLast());
		System.out.println("Current list is "+ll);
		System.out.println("Retrieve and remove first element of list: "+ll.removeFirst());
		System.out.println("Retrieve and remove last element of list: "+ll.removeLast());
		System.out.println("Current list is "+ll);
		System.out.println("Retrieve and remove first occurence of element c: "+ll.removeFirstOccurrence("c"));
		System.out.println("Retrieve and remove last occurence of element d: "+ll.removeLastOccurrence("d"));
		System.out.println("Current list is "+ll);
		System.out.println("Setting z at position 2: "+ll.set(2,"z"));
		System.out.println("Current list is "+ll);
	}

}
