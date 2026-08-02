public class Member extends User {

    private int borrowedBooksCount;
    private final int MAX_BORROW_LIMIT = 5;

    Member()
    {
        super();
        borrowedBooksCount = 0;
    }
    Member(String name, String contactInfo)
    {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed:" + borrowedBooksCount );
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    public void incrementBorrowCount()
    {
        borrowedBooksCount++;
    }

    public void decrementBorrowCount()
    {
        borrowedBooksCount--;
    }
}
