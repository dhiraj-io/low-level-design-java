import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private List<Book> bookInventory;
    private List<User> registeredUsers;

    LibraryManagementSystem()
    {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }
    void addBook(Book book)
    {
        bookInventory.add(book);
    }

    void registerUser(User user)
    {
        registeredUsers.add(user);
    }

    List<Book> searchBooks(String criteria)
    {
        List<Book> ans = new ArrayList<>();
        for(Book b: bookInventory)
        {
            if(criteria.equals(b.getTitle()) || criteria.equals(b.getAuthor()))
            {
                ans.add(b);
            }
        }

        return ans;
    }

   List<Book> searchBooks(String criteria, String type)
   {
       List<Book> ans = new ArrayList<>();

       for(Book b: bookInventory)
       {
           if(criteria.equals(b.getTitle()) || criteria.equals(b.getAuthor())) {
               if (BookType.TextBook.toString().equals(type) && b instanceof TextBook)
               {
                   ans.add(b);
               }
               else if ( BookType.NovelBook.toString().equals(type) && b instanceof NovelBook) {
                   ans.add(b);
               }
           }
       }

       return ans;
   }

    void lendBook(Member member, Book book)
    {
        if(book.lend(member)) {
            System.out.println("Lending is success full");
           member.incrementBorrowCount();
        }
        else
        {
            System.out.println("Lending Failed");
        }
    }

    void returnBook(Member member, Book book)
    {
        book.returnItem(member);
        member.decrementBorrowCount();
    }

    void displayAllBooks()
    {
        for(int i = 0; i<bookInventory.size(); i++)
        {
            bookInventory.get(i).displayBookDetails();
        }
    }

    void displayRegisteredUsers()
    {
        for(int i = 0; i<registeredUsers.size(); i++)
        {
            registeredUsers.get(i).displayDashboard();
        }
    }

}
