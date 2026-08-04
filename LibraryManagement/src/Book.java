public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;


    Book()
    {
        isAvailable = true;
    }

    Book(String isbn, String title, String author)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    Book(Book b)
    {
        this.isbn = b.isbn;
        this.title = b.title;
        this.author = b.author;
        this.isAvailable = b.isAvailable;

    }

    public String getIsbn()
    {
        return  isbn;
    }

    public String getTitle()
    {
        return  title;
    }

    public String getAuthor()
    {
        return  author;
    }
    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks())
        {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnItem(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
