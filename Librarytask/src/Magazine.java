
public class Magazine extends Resource implements Readable {

	private int magazineIssue;
	private String magazineBrand;

	public Magazine(int serialID, boolean checkedOut, int checkedOutBy, int magazineIssue, String magazineBrand) {
		super(serialID, checkedOut, checkedOutBy);
		this.magazineIssue = magazineIssue;
		this.magazineBrand = magazineBrand;
	}

	@Override
	public void burnBook() {
		System.out.println("Really don't burn a magazine, that's just horrible");
	}

	@Override
	public void read() {

	}

	public int getmagazineIssue() {
		return magazineIssue;
	}

	public void setmagazineIssue(int magazineIssue) {
		this.magazineIssue = magazineIssue;
	}

	public String getmagazineBrand() {
		return magazineBrand;
	}

	public void setmagazineBrand(String magazineBrand) {
		this.magazineBrand = magazineBrand;
	}
}
