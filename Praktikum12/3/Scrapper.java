import java.util.ArrayList;

class Scrapper implements ScrapperThread.Listener{
    private ArrayList<String> urlList;
    private int lowest;
    private int size;
    private int i;

    public Scrapper() {
        urlList = new ArrayList<String>();
        size = 0;
    }

    public void addUrl(String url) {
        urlList.add(url);
        size++;
    }

    public synchronized int scrapLowestPrice() throws InterruptedException{
        // Kode berikut masih melakukan scrap ke banyak website
        // secara sekuensial. Agar lebih cepat, ubahlah kode di bawah ini
        // menjadi paralel menggunakan wait dan notify, dengan membuat
        // instance ScrapperThread
        // Hint: baca materi praktikum
        lowest = Integer.MAX_VALUE;
        i = 0;
        for (String url : urlList) {
            //while (receiving) this.wait();
            new ScrapperThread(this,url).start();
        }
        //System.out.println(size);
        while (i < size) {
            try {
                this.wait();
            } catch (InterruptedException e) {}
        }
        return lowest;
    }

    public synchronized void onAcquired(int price){
        //receiving = true;
        lowest = price < lowest ? price : lowest;
        i++;
        //receiving = false;
        this.notifyAll();
    }
}