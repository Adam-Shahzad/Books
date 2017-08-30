import java.util.HashMap;
import java.util.Scanner;

public class Service {
	
	
	HashMap<Integer,Book> hm = new HashMap<Integer,Book>();
	
	
	public void add_book(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is the name of the book?");
		String name = sc.nextLine();
		
		System.out.println("what is the author of the book?");
		String author = sc.nextLine();
		
		System.out.println("what is the id of the book?");
		int id = sc.nextInt();
		
		Book newBook = new Book(author, name, id);
		hm.put(id, newBook);
	}
	
	
	public void remove_book(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is the id of the book you wish to remove?");
		int id = sc.nextInt();
		
		hm.remove(id);
	}
}
