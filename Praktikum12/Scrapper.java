package Praktikum12;

import java.util.ArrayList;

class Scrapper implements ScrapperThread.Listener{
    private ArrayList<String> urlList;
    private int lowest;

    public Scrapper() {
        urlList = new ArrayList<String>();
        lowest = Integer.MAX_VALUE;
    }

    public void addUrl(String url) {
        urlList.add(url);
    }

    @Override
    public void scrapPrice(String url) {
        int price = new Website(url).getPrice();
        this.lowest = this.lowest < price ? this.lowest : price;
        this.notify();
    }

    public int scrapLowestPrice() {
        // Kode berikut masih melakukan scrap ke banyak website
        // secara sekuensial. Agar lebih cepat, ubahlah kode di bawah ini
        // menjadi paralel menggunakan wait dan notify, dengan membuat
        // instance Praktikum12.ScrapperThread
        // Hint: baca materi praktikum
        for (String url : urlList) {
            Website website = new Website(url);
            int currInt = website.getPrice();
            lowest = (lowest > currInt) ? currInt : lowest;
        }
        return lowest;
    }
}