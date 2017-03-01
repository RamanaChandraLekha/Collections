import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ascendas {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		Scanner sc = new Scanner(System.in);

		TreeMap map = new TreeMap();
		do {
			// ArrayList<Company> list = new ArrayList<Company>();
			Company com = new Company();
			System.out.println("enter company name");
			com.setCompanyName(sc.next());
			String s1 = com.getCompanyName();
			boolean b = set.add(s1);
			System.out.println("enter location");
			com.setLocation(sc.next());

			System.out.println("enter no of employees");
			com.setEmployees(sc.nextInt());

			if (b == false) {
				ArrayList list = new ArrayList();
				list.add(map.get(s1));
				list.add(com);

				map.put(com.getCompanyName(), list);
			} else {
				ArrayList list1 = new ArrayList();
				list1.add(com);
				map.put(s1, list1);
			}

			System.out.println("Do you want to enter details of one more company(Yes/no)");
		} while (sc.next().equalsIgnoreCase("yes"));

		Set s = map.entrySet();
		System.out.println(s);
	}

}
