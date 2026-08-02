public class Librarian extends User{

    private String employeeNumber;

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number:" + employeeNumber );
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book)
    {

    }

    void removeBook(Book book)
    {

    }
}
