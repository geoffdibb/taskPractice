
public class Runner {
	public static void main(String[] args) {

		Book book1 = new Book(11, false, 0, "The Eye of the World");
		Book book2 = new Book(12, false, 0, "The Great Hunt");
		Book book3 = new Book(13, false, 0, "The Dragon Reborn");
		Book book4 = new Book(14, false, 0, "The Shadow Rising");
		Book book5 = new Book(15, false, 0, "The Fires of Heavon");
		Book book6 = new Book(16, false, 0, "Lord of Chaos");
		Magazine magazine1 = new Magazine(21, false, 0, 1, "ImagineFX");
		Magazine magazine2 = new Magazine(22, false, 0, 2, "ImagineFX");
		Magazine magazine3 = new Magazine(23, false, 0, 3, "ImagineFX");
		Magazine magazine4 = new Magazine(24, false, 0, 1, "Spiderman");
		Magazine magazine5 = new Magazine(25, false, 0, 2, "Spiderman");
		Magazine magazine6 = new Magazine(26, false, 0, 3, "Spiderman");
		Journal journal1 = new Journal(31, false, 0, "Cinema Collection", "Film");
		Journal journal2 = new Journal(32, false, 0, "Theatre Collection", "Theatre");
		Journal journal3 = new Journal(33, false, 0, "HR Giger Works", "Art");
		Journal journal4 = new Journal(34, false, 0, "Beyond Good and Evil", "Philosophy");
		Journal journal5 = new Journal(35, false, 0, "Thus spoke Zarathustra", "Philosophy");

		Library checkBook = new Library();

		checkBook.resourceStorage.add(book1);
		checkBook.resourceStorage.add(book2);
		checkBook.resourceStorage.add(book3);
		checkBook.resourceStorage.add(book4);
		checkBook.resourceStorage.add(book5);
		checkBook.resourceStorage.add(book6);
		checkBook.resourceStorage.add(magazine1);
		checkBook.resourceStorage.add(magazine2);
		checkBook.resourceStorage.add(magazine3);
		checkBook.resourceStorage.add(magazine4);
		checkBook.resourceStorage.add(magazine5);
		checkBook.resourceStorage.add(magazine6);
		checkBook.resourceStorage.add(journal1);
		checkBook.resourceStorage.add(journal2);
		checkBook.resourceStorage.add(journal3);
		checkBook.resourceStorage.add(journal4);
		checkBook.resourceStorage.add(journal5);

		person person1 = new person(01, "Brandon Sanderson", 0);
		person person2 = new person(02, "Robert Jordan", 0);
		person person3 = new person(03, "Brent Weeks", 0);
		person person4 = new person(04, "George RR Martin", 0);

		checkBook.personDatabase.add(person1);
		checkBook.personDatabase.add(person2);
		checkBook.personDatabase.add(person3);
		checkBook.personDatabase.add(person4);

		checkBook.checkOutAResource(34, 02);
		checkBook.checkOutAResource(34, 03);
		checkBook.returnAResource(34, 02);
		checkBook.checkOutAResource(34, 03);
		checkBook.checkOutAResource(34, 02);
		checkBook.registerAPerson(05, "Steven", 0);
		checkBook.findPerson(05);
		checkBook.findBook(11);
	}

}
