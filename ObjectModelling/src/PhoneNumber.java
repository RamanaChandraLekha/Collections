
public class PhoneNumber {
	private String number;
	private String type;

	public void setNumber(String i) {
		this.number = i;
	}

	public void setType(String i) {
		this.type = i;
	}

	public String getNumber() {
		return number;

	}

	public String getType() {
		return type;

	}

	public String toString() {

		return this.number + "-" + this.type;
	}
}
