import java.io.*;
import java.util.ArrayList;

public class Controller {
	ArrayList<PhoneNumber> list = new ArrayList<PhoneNumber>();
	ArrayList<Email> list1 = new ArrayList<Email>();
	InputStreamReader in = new InputStreamReader(System.in);

	BufferedReader br = new BufferedReader(in);
	Names n = new Names();
	Address address = new Address();
	WebSite website=new WebSite();

	public Names enterDetailsOfName() throws IOException {

		System.out.println("enter the first name");
		n.setFname(br.readLine());
		System.out.println("enter the middle name");
		n.setMname(br.readLine());
		System.out.println("enter the last name");
		n.setLname(br.readLine());
		System.out.println("enter the nick name");
		n.setNickName(br.readLine());
		return n;
	}

	public ArrayList<PhoneNumber> enterPhoneNumbers() throws IOException {
		do {
			PhoneNumber ph = new PhoneNumber();

			System.out.println("enter the number");
			ph.setNumber(br.readLine());
			System.out.println("enter the type");
			ph.setType(br.readLine());
			int i = 0;
			list.add(i, ph);
			System.out.println("do you want enter another number(yes/no)");
			i++;
		} while (br.readLine().equals("yes"));
		return list;
	}

	public Address enterAddress() throws IOException {

		System.out.println("Enter the house number");
		address.setHouseNumber(br.readLine());
		System.out.println("Enter the Street number");
		address.setStreetNumber(br.readLine());
		System.out.println("Enter the city");
		address.setCity(br.readLine());
		System.out.println("Enter the state");
		address.setState(br.readLine());
		System.out.println("Enter the pin-code");
		address.setPinCode(br.readLine());
		System.out.println("Enter the country");
		address.setCountry(br.readLine());
		return address;
	}
	public ArrayList<Email> enterEmail() throws IOException {
		do {
			Email mail = new Email();

			System.out.println("enter the mail");
			mail.setMail(br.readLine());
			System.out.println("enter the type");
			mail.setType(br.readLine());
			int i = 0;
			list1.add(i, mail);
			System.out.println("do you want enter another mail(yes/no)");
			i++;
		} while (br.readLine().equals("yes"));
		return list1;
	}

	public WebSite enterWebSite()throws IOException{
		
		//WebSite website=new WebSite();
		System.out.println("enter the website");
		website.setUrl(br.readLine());
		return website;
	}
	
	
	
	

	public String toString() {
		return n + "\n" + list + "\n" + address +"\n"+list1+ "\n"+website;
	}

	// System.out.println(n +"\n" +list+"\n"+ address);

}
