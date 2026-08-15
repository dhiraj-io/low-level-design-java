package urlScrapping;

import java.util.concurrent.Callable;

public class urlScrapper implements Callable<Void> {
    @Override
    public Void call() throws Exception {
        //System.out.println("Scrapping is in progress");
        Thread.sleep(200);
        return null;
    }
}
