
public class Address {
	private String houseNumber="";
	private String streetNumber="";
	private String city="";
	private String state="";
	private String pinCode="";
	private String country="";
	public void setHouseNumber(String s)
	{
		this.houseNumber=s;
		
	}
	public void setStreetNumber(String s)
	{
		this.streetNumber=s;
		
	}
	public void setCity(String s)
	{
		this.city=s;
		
	}
	public void setState(String s)
	{
		this.state=s;
		
	}
	public void setPinCode(String s)
	{
		this.pinCode=s;
		
	}
	public void setCountry(String s)
	{
		this.country=s;
		
	}
	public String toString()
	{
		return houseNumber +" / "+streetNumber+" / "+"\n"+city+"\n"+pinCode+"\n"+state+"\n"+country;
	}

}
