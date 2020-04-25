import java.lang.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scrapper s = new Scrapper();
        s.addUrl("a");
        s.addUrl("b");
        s.addUrl("c");

        long start = System.nanoTime();
        System.out.println(s.scrapLowestPrice());
        long end = System.nanoTime();
        
        System.out.println("Time: ");
        System.out.println(end-start);
    }
}