// import java api jika diperlukan
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

public class MailServer implements EventChannel {
  // tambahkan properties jika perlu
  private Hashtable<String,List<Subscriber>> subList;

  public MailServer() {
    // menginisiasi daftar subscriber
    subList = new Hashtable<String,List<Subscriber>>();
  }

  @Override
  public void addSubscriber(String topic, Subscriber s) {
    // tambahkan s sebagai subscriber ke topic yang diberikan
    if (!subList.containsKey(topic)){
      subList.put(topic, new ArrayList<Subscriber>());
    }
    subList.get(topic).add(s);
  }

  @Override
  public void sendEvent(String topic, Event event) {
    // untuk setiap subscriber s yang sudah subscribe ke topic yang diberikan,
    // panggil s.onEvent(event)
    if (subList.containsKey(topic)){
      for (Subscriber s: subList.get(topic)){
        s.onEvent(event);
      }
    }
  }
}
