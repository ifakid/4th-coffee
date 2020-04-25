public class MyPair<K,V>{
	private K key;
	private V value;

	public MyPair(K key,V value){
		this.key = key;
		this.value = value;
	}

	public K getKey(){
		return key;
	}

	public V getVal(){
		return value;
	}

	public void setKey(K key){
		this.key = key;
	}

	public void setVal(V value){
		this.value = value;
	}

	public boolean isEqual (MyPair<K,V> pair){
		return pair.getKey() == key && pair.getVal() == value;
	}

	public int nearEQ (MyPair<K,V> pair){
		if (pair.getKey() == key && pair.getVal() == value) return 3;
		else if (pair.getVal() == value) return 2;
		else if (pair.getKey() == key) return 1;
		else return 0;
	}
}