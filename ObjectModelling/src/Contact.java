import java.io.IOException;
import java.util.ArrayList;

public class Contact {
	Names n;
	
	ArrayList<PhoneNumber> ph;
	Address address;
	ArrayList<Email> mail;
	WebSite website;
	ArrayList<Contact> lists;
	String s;

	Contact(Names name, ArrayList<PhoneNumber> ph, Address address, ArrayList<Email> mail, WebSite website, String fname) {
		this.n = name;
		this.ph = ph;
		this.address = address;
		this.mail = mail;
		this.website = website;
		this.s=fname;
	}

	/*
	 * Contact() {
	 * 
	 * 
	 * this( name, ph, address, mail, website); }
	 */
	public Contact addContact() {
		try {
			Names n1 =new Names();
			Controller contact = new Controller();
		 s =	n1.getFname();
			n = contact.enterDetailsOfName();
			ph = contact.enterPhoneNumbers();
			address = contact.enterAddress();
			mail = contact.enterEmail();
			website = contact.enterWebSite();

		} catch (IOException e) {
			System.out.println(e);
		}

		return new Contact(n, ph, address, mail, website,s);

	}

	public String toString() {
		return n + "\n" + ph + "\n" + address + "\n" + mail + "\n" + website +"\n";
	}

}