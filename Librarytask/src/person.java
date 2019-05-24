
public class person {
	private int personID;
	private String name;
	private int bookBorrowed;

	public person(int personID, String name, int bookBorrowed) {
		this.personID = personID;
		this.name = name;
		this.bookBorrowed = bookBorrowed;
	}

	public int getpersonID() {
		return personID;
	}

	public void setpersonID(int personID) {
		this.personID = personID;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getbookBorrowed() {
		return bookBorrowed;
	}

	public void setbookBorrowed(int bookBorrowed) {
		this.bookBorrowed = bookBorrowed;
	}

}
