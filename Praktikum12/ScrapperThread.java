public class ScrapperThread extends Thread{
    public interface Listener {
        void scrapPrice(String url);
    }
}
