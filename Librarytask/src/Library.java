import java.util.ArrayList;

public class Library {

	ArrayList<Resource> resourceStorage = new ArrayList<>();
	ArrayList<person> personDatabase = new ArrayList<>();

	public void checkOutAResource(int serialID, int personID) {

		for (Resource i : resourceStorage) {
			if (i.getcheckedOut() == false && i.getSerialID() == serialID) {
				i.setcheckedOut(true);
				for (person j : personDatabase) {
					if (j.getpersonID() == personID) {
						j.setbookBorrowed(serialID);
						System.out.println(personID + " has taken out " + serialID);
						i.setcheckedOutBy(personID);
					}
				}
			} else if (i.getcheckedOut() == true) {
				System.out.println("Book is already checked");
			}
		}

	}

	public void returnAResource(int serialID, int personID) {

		for (Resource i : resourceStorage) {
			if (i.getcheckedOut() == true && i.getSerialID() == serialID && i.getcheckedOutBy() == personID) {
				i.setcheckedOut(false);
				for (person j : personDatabase) {
					if (j.getpersonID() == personID) {
						j.setbookBorrowed(0);
						System.out.println(personID + " has returned " + serialID);
					}
				}
			}
		}

	}

	public void registerAPerson(int personID, String name, int bookBorrowed) {
		person newperson = new person(personID, name, bookBorrowed);

		personDatabase.add(newperson);
		System.out.println(personDatabase);
		;

	}

	public void findPerson(int personID) {
		System.out
				.println(personDatabase.stream().filter(x -> x.getpersonID() == personID).findFirst().get().getname());

	}

	public void findBook(int serialID) {
		for (Resource i : resourceStorage) {
			if (i instanceof Book && i.getSerialID() == serialID) {
				System.out.println(((Book) i).getbookName());
			}
		}

	}

}
