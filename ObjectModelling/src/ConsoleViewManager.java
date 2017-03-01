
public class ConsoleViewManager {

	int choice;

	public void printMainMenuOptions() {
		System.out.println("1. View contact");
		System.out.println("2. Enter new contact");
		System.out.println("3. Delete contact");
		System.out.println("0. Quit");
	}

	public void setEnterChoice(int i) {
		this.choice = i;
	}

	public int getEnterContactChoice() {
		return choice;
	}

}
