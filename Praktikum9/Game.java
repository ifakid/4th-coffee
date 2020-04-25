import java.util.*;

public class Game {
	public static void run(String[] hojun, String[] qila){
		HashMap<String,Integer> m = new HashMap<String,Integer>();

		Integer currentValue;
		for (String s: hojun){
			currentValue = m.get(s);
			if (currentValue == null){
				m.put(s,1);
			} else {
				m.put(s,currentValue+1);
			}
		}
		for (String s: qila){
			currentValue = m.get(s);
			if (currentValue != null && currentValue >= 1){
				m.put(s,currentValue-1);
			}
		}

		Iterator it = m.entrySet().iterator();
		Map.Entry mapEl;

		while (it.hasNext()){
			mapEl = (Map.Entry)it.next();
			if ((int)mapEl.getValue() > 0){
				for (int i = 0; i < (int)mapEl.getValue(); i++){
					System.out.println(mapEl.getKey());
				}
			}
		}
	}
}