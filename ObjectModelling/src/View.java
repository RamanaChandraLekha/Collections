import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class View {
	static ArrayList<Contact> lists = new ArrayList<Contact>();
	// static ArrayList list;
	static Names n;
	static ArrayList<PhoneNumber> ph;
	static Address address;
	static ArrayList<Email> mail;
	static WebSite website;
	static String s;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ConsoleViewManager view = new ConsoleViewManager();
		Contact contact = new Contact(n, ph, address, mail, website, s);

		do {

			view.printMainMenuOptions();
			int i = sc.nextInt();
			if (i == 2) {

				Contact cntct = contact.addContact();

				lists.add(cntct);

				System.out.println("do you want main menu(yes/no)");

			}
			if (i == 1) {

				System.out.println(lists);
				System.out.println("do you want main menu(yes/no)");
			}

			if (i == 3) {

				System.out.println("enter the first name of contact to delete");
				String s = sc.next();
				/*
				 * //String s1=contact.s; Iterator<Contact>
				 * iter=lists.iterator(); while(iter.hasNext()) { Contact
				 * c=iter.next(); if(s.equals(c.s)) { iter.remove(); }
				 * 
				 * }
				 */
				/*
				 * 
				*/for (int m = 0; m < lists.size(); m++) {
					Contact s3 = lists.get(m);
					if (s3.toString().startsWith(s)) {
						lists.remove(s3);
						System.out.println("contact deleted");
					} else
						System.out.println("no such contact found");
				}

				System.out.println("do you want main menu(yes/no)");

			}

			if (i == 0) {
				break;
			}
		} while (sc.next().equals("yes"));

	}

}