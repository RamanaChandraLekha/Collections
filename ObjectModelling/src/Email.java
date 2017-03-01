
public class Email {

	private String mail;
	private String type;

	public void setMail(String s) {
		this.mail = s;

	}

	public void setType(String s) {
		this.type = s;
	}

	public String getMail() {
		return mail;
	}

	public String getType() {
		return type;
	}

	public String toString() {
		return type + "-" + mail;
	}

}
