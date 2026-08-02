//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Member m = new Member("Dhiraj", "Test Contact");

    Librarian libr = new Librarian();
    libr.setEmployeeNumber("123456");
    TextBook t = new TextBook("Math", 2, "12345", "GEOMETRY", "KC SINHA");

    NovelBook n = new NovelBook("Test", "12345", "GEOMETRY", "KC SINHA");

    Book b = t;
    //b.displayBookDetails();
    b = n;
   // b.displayBookDetails();
    Lendable l = new TestClass();
    l.lend(m);
    l.returnItem(m);


    /////////
    LibraryManagementSystem lib = new LibraryManagementSystem();
    lib.addBook(t);
    lib.addBook(n);
    lib.registerUser(m);
    lib.registerUser(libr);
    System.out.println("TextBook Details: ");
    t.displayBookDetails();
    lib.lendBook(m, t);
    TextBook t1 = new TextBook("Math", 2, "12345", "GEOMETRY", "KC SINHA");
    TextBook t2 = new TextBook("Math", 2, "12345", "GEOMETRY", "KC SINHA");
    TextBook t3 = new TextBook("Math", 2, "12345", "GEOMETRY", "KC SINHA");
    TextBook t4 = new TextBook("Math", 2, "12345", "GEOMETRY", "KC SINHA");
    TextBook t5 = new TextBook("Math", 2, "12345", "GEOMETRY", "KC SINHA");

    lib.lendBook(m, t);
    lib.lendBook(m, t1);
    lib.lendBook(m, t2);
    lib.lendBook(m, t3);
    lib.lendBook(m, t4);
    System.out.println(" Status of Book - T4 availability before returning: " + t4.isAvailable());
    lib.returnBook(m, t4);
    System.out.println(" Status of Book - T4 availability after returning: " + t4.isAvailable());
    lib.lendBook(m, t5);

    System.out.println("Novel Book Testing");
    lib.lendBook(m, n);

    System.out.println("Display All inventory Book Details");
    lib.displayAllBooks();


    System.out.println("Display All Registered User Details");
    lib.displayRegisteredUsers();

    //m.displayDashboard();
    //libr.displayDashboard();

    //System.out.println(Runtime.getRuntime().availableProcessors());
}
