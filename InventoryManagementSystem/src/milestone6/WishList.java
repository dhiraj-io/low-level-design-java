package milestone6;

import java.util.HashSet;
import java.util.Set;

public class WishList< Item> {

    private Set<Item> wishList;


    public WishList() {
        this.wishList = new HashSet<>();
    }

    public void addToWishlist(Item item)
    {
        if(!wishList.contains(item))
            wishList.add(item);
    }

    public void removeFromWishlist(Item item)
    {
        if(wishList.contains(item))
            wishList.remove(item);
    }

    public Set<Item> getWishList() {
        return wishList;
    }
}
