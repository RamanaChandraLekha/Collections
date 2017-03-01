import java.util.TreeMap;

public class Company {

	private String companyName;
	private String location;
	private int employees;
	public void setCompanyName(String s)
	{
		this.companyName=s;
	}
	public void setLocation(String p)
	{
		this.location=p;
	}
	public void setEmployees(int c)
	{
		this.employees=c;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	public String getLocation()
	{
		return location;
	}
	public int getEmployees()
	{
		return employees;
	}
	
	public String toString()
	{
		return this.location+"-"+this.employees+"employees";
	}
}
