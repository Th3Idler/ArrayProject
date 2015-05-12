
public class Customer implements People {

	private long iD;
	private String FName;
	private String LName;
	@Override
	public long getID() {
		// will return the ID
		return iD;
	}
	@Override
	public void setID(long id) {
		// TODO Auto-generated method stub
		iD = id;
		
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
