public class NovelBook extends Book{
    private String genre;

    NovelBook(String genre, String isbn, String title, String author)
    {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook Details");
        System.out.println("Genre : " + genre);
        System.out.println("ISBN:" + getIsbn());
        System.out.println("Author:" + getAuthor());
        System.out.println("Title:" + getTitle());
    }
}
