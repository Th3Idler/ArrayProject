import java.util.Scanner;
public class Library  {
	
	public static void main(String[] args)
	
	{
		
		Scanner input = new Scanner(System.in);

		Customer[] custs = new Customer[3];
		
		 
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
