
public class Journal extends Resource implements Readable {

	private String journalCollection;
	private String subject;

	public Journal(int serialID, boolean checkedOut, int checkedOutBy, String journalCollection, String subject) {
		super(serialID, checkedOut, checkedOutBy);
		this.subject = subject;
		this.journalCollection = journalCollection;
	}

	@Override
	public void burnBook() {
		System.out.println("Really don't burn a journal, that's just horrible");
	}

	@Override
	public void read() {

	}

	public String getjournalCollection() {
		return this.journalCollection;
	}

	public void setjournalCollection(String journalCollection) {
		this.journalCollection = journalCollection;
	}

	public String getsubject() {
		return this.subject;
	}

	public void setsubject(String subject) {
		this.subject = subject;
	}
}
