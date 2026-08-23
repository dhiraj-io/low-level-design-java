package milestone6;

public class Client {

    public static void main(String[] args)
    {
        Item i1 = new Book("1", "Book1", 125, 25, "Book1Author");
        Item i2 = new Clothing("2", "Tshirt", 120, 20, "L");
        Item i3 = new Electronics("3", "JBL", 130, 0, 2);
        Item i4 = new Electronics("3", "JBL", 130, 0, 2);

        WishList<Item> itemWishList = new WishList<>();
        itemWishList.addToWishlist(i1);
        itemWishList.addToWishlist(i2);
        itemWishList.addToWishlist(i3);
        itemWishList.addToWishlist(i4);

        System.out.println(itemWishList.getWishList());
        itemWishList.removeFromWishlist(i1);
        System.out.println(itemWishList.getWishList());









    }
}
