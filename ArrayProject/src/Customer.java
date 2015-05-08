
public class Customer implements People {

	private long ID;
	private String FName;
	private String LName;
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setID(long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setFName(String fname) {
		FName = fname;
		
	}
	@Override
	public String getFName() {
		// TODO Auto-generated method stub
		return FName;
	}
	@Override
	public void setLName(String lname) {
		LName = lname;
		
	}
	@Override
	public String getLName() {
		// TODO Auto-generated method stub
		return LName;
	}
	
	
	
	
	
}
