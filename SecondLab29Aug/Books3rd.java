import java.util.Scanner;

/*(3)Write a Java program to maintain the books in a library. Each book
has a name, the author(s), total number of copies of the book, status of the
book (which should show how many more copies of the book are available in
the library). Write methods to add new books and remove books, to list all
books with their details. Also, write methods to update the status of the book
whenever a copy is borrowed by some user. In addition, for the books that have
been borrowed by someone, your program should maintain information such as
the name of the borrower, the ID of the borrower, the issue date, and the due
date.*/
class book
{	
	public String name;
	public int book_id;
	public String author;
	public int tot_copies; 
	public int avail_copies;
	Scanner sc=new Scanner(System.in);
	public book() {
		System.out.println("Enter Serial No of Book:");
	    this.book_id = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter Book Name:");
	    this.name = sc.nextLine();
	    System.out.println("Enter Author Name:");
	    this.author = sc.nextLine();
	    System.out.println("Enter total copies of Book:");
	    this.tot_copies = sc.nextInt();
	    System.out.println("Enter available copies of Book:");
	    avail_copies = this.avail_copies;
		
	}
	public void removeBooks() {
		
	}
}
public class Books3rd {
	book theBooks[]=new book[10];
	public static int count;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of books you want to add: ");
		count=sc.nextInt();
		
	}
}
