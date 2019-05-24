
public abstract class Resource {

	private int serialID;
	private boolean checkedOut;
	private int checkedOutBy;

	public Resource(int serialID, boolean checkedOut, int checkedOutBy) {
		this.serialID = serialID;
		this.checkedOut = checkedOut;
		this.checkedOutBy = checkedOutBy;
	}

	public int getSerialID() {
		return serialID;
	}

	public void setSerialID(int serialID) {
		this.serialID = serialID;
	}

	public boolean getcheckedOut() {
		return checkedOut;
	}

	public void setcheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;

	}

	public int getcheckedOutBy() {
		return this.checkedOutBy;
	}

	public void setcheckedOutBy(int checkedOutBy) {
		this.checkedOutBy = checkedOutBy;
	}

	public void burnBook() {
		System.out.println("Don't burn a book");
	}

}