import java.util.Scanner;
public class Library  {
	
	static Customer[] custs = new Customer[3];
	static Scanner input = new Scanner(System.in);
	static String answer = "";
    static book[] books = new book[10];

	
	public static void main(String[] args)
	
	{
		
		// Initialize Customer Array
		custInit();
		 
		// Add Customers
		fillCust();
		
		do{
			System.out.println("What do you want to do?");
			System.out.println("c for Checkout");
			System.out.println("i for Checkin");
			System.out.println("q for quit");
			
			// get input
			answer = input.nextLine();

			if (answer.equals("c"))
			{
				System.out.println("What book");
				
				//checkout(findItem(input.nextLine()));
			}
			else if (answer.equals("i"))
			{
				System.out.println("What book");
				
				//checkin(findItem(input.nextLine()));
			}
			
			
		} while (!answer.equals("i"));
		while (!answer.equals("c"));

		 
	}
	
	
	public static void custInit()
	{
		 for (int i = 0; i < custs.length; i++)
		 	{
			 	custs[i] = new Customer();
		 	}
		 
		 for (int i = 0; i < custs.length; i++)
		 	{ 
			 	custs[i].setFName("");
			 	custs[i].setLName("");
			 	custs[i].setID(100+i);
		 	}	
	
	}

	public static void fillCust()
	{
		 for (int i = 0; i < custs.length; i++)
			{ 
			 System.out.println("Enter Customer No. " + i + "'s first name");
		      	custs[i].setFName(input.nextLine());
			 System.out.println("Enter Customer No. " + i + "'s last name");
				custs[i].setLName(input.nextLine());
				custs[i].setID(100+i);
			}	

		 for (int i = 0; i < custs.length; i++)
		 	{
			 System.out.println(custs[i].getFName() + " " + custs[i].getLName());
			 	custs[i] = new Customer();
		 	}
	}
	
	public static int findItem(String text)
	{
		for (int i = 0; i < books.length; i++)
			if (books[i].getTitle().equals(text))
				return i;
		
		
		return 0;
		
	}
	
}

/*
	static int minCustomers = 100;
static Book[] books = new Book[10];

//Create a scanner object each for text and numbers
private static Scanner tInput = new Scanner(System.in);
private static Scanner nInput = new Scanner(System.in);


public static void main(String[] args) {
	
	//Add the books
	addBooks();
	
	for (int i = 0; i < books.length; i++ )
	{
		System.out.println(books[i].getTitle() + ", by " + books[i].getAuthor());
	}
	
	/*
	 
	 do 
	 {
	System.out.println("What is the maximum amount of customers you expect?");
	} while (!(Integer.parseInt(tInput.nextLine())>=minCustomers));
	

	
	
}

private static int addCustomer()
{
	
	
	
	return 0;
} 

private static void addBooks()
{
	for (int i = 0; i < books.length; i++ )
	{
		books[i] = new Book();
		System.out.println("Enter a book name");
		books[i].setTitle(tInput.nextLine());
		System.out.println("the Author?");
		books[i].setAuthor(tInput.nextLine());
		
	}
	

}

}
*/
/*Customer Rich = new Customer();
Rich.setID(2342342);
Rich.setFName("Rich");
Rich.setLName("Something");

Customer Christian = new Customer();
Christian.setID(100101);
Christian.setFName("Christian");
Christian.setLName("Mahbleh");
*/

//Rich
//Gryph
