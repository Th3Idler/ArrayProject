
public class Library {
	
	public static void main(String[] args)
	{
		Customer bob = new Customer();
		bob.setID(2342342);
		bob.setFName("Bob");
		bob.setLName("Newhart");
		
		Customer[] custs = new Customer[10];
		
		for (int i = 0; i < custs.length; i++)
		{
			custs[i].setFName("");
			custs[i].setLName("");
			custs[i].setID(100+i);
		}
		
		
		
		
		
	}

}

//Rick
//Gryph