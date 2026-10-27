package flyweight;

import java.util.ArrayList;
import java.util.List;

public class client {

    public static void main() {

        List<Bullet> bullets = new ArrayList<>();
        for (int i = 0; i<50000; i++)
        {
            bullets.add(new Bullet("ak47BulletType", (int)(Math.random() * 1000), (int)(Math.random() * 1000)));
        }

        System.out.println("DEBUG");
    }
}
