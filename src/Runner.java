import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Get_choice();
	
		
	}

	public static void Get_choice() {
		System.out.println("(1) add an item");
		System.out.println("(2) delete an item");
		System.out.println("(3) show books");
		
		Service myService = new Service();
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
	
		switch (choice) {
		case 1:
			myService.add_book();
			break;
		case 2:
			myService.remove_book();
			break;
		case 3:
			myService.remove_book();
			break;
		}

	}

	
	
}
