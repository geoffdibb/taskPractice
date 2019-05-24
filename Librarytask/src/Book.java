
public class Book extends Resource implements Readable {

	private String bookName;

	public Book(int serialID, boolean checkedOut, int checkedOutBy, String bookName) {
		super(serialID, checkedOut, checkedOutBy);
		this.bookName = bookName;
	}

	@Override
	public void burnBook() {
		System.out.println("Really don't burn a book, that's just horrible");
	}

	@Override
	public void read() {
		System.out.println("Reading the Book");
	}

	public String getbookName() {
		return bookName;
	}

	public void setbookName(String bookName) {
		this.bookName = bookName;
	}

}
