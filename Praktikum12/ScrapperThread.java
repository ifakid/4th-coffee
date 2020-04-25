class ScrapperThread extends Thread {
	private String url;
	private Listener listener;

	public ScrapperThread(Listener listener,String url){
		this.url = url;
		this.listener = listener;
	}

	public void run(){
		Website website = new Website(url);
        int currInt = website.getPrice();
        listener.onAcquired(currInt);
	}

	public interface Listener {
		void onAcquired(int price);
	}
}