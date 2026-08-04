public abstract class User {

    private static int totalUsers;
    private String userId;
    private String name;
    private String contactInfo;


    static int getTotalUsers()
    {
        return totalUsers;
    }
    User()
    {
        userId = generateUniqueId();
        totalUsers++;
    }

    User(String name, String contactInfo)
    {
        userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }

    User(User u)
    {
        this.userId = generateUniqueId();
        this.name = u.name;
        this.contactInfo = u.contactInfo;
        totalUsers++;
    }
    public String getName()
    {
        return this.name;
    }

    public String getContactInfo()
    {
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo)
    {
        this.contactInfo = contactInfo;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    static String generateUniqueId()
    {
        return "0";
    }

    public abstract  void displayDashboard();
    public abstract boolean canBorrowBooks();
}


