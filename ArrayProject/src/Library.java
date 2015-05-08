import java.util.Scanner;
public class Library  {
	
	public static void main(String[] args)
	
	
	
	{
		Scanner input = new Scanner(System.in);
		
		Customer Rich = new Customer();
		Rich.setID(2342342);
		Rich.setFName("Rich");
		Rich.setLName("Something");
		
		Customer Christian = new Customer();
		Christian.setID(100101);
		Christian.setFName("Christian");
		Christian.setLName("Mahbleh");
		
	
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

//Rich
//Gryph

// Customer[] custs = new Customer[10];

// for (int i = 0; i < custs.length; i++)
// { 
//      custs[i].setFName("");
//		custs[i].setLName("");
//		custs[i].setID(100+i);
//	}