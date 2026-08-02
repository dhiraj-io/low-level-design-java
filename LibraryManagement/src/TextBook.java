public class TextBook extends Book{
    private String subject;
    private int edition;

    TextBook(String subject, int edition, String isbn, String title, String author )
    {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Book Details");
        System.out.println("Subject : " + subject);
        System.out.println("Edition : " + edition);
        System.out.println("ISBN:" + getIsbn());
        System.out.println("Author:" + getAuthor());
        System.out.println("Title:" + getTitle());
    }
}
