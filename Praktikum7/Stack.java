class Stack {
	public int[] stack;
	public int size;
	private int capacity;

	Stack(){
		this.size = 0;
		this.capacity = 10;
		this.stack = new int[10];
	}
	Stack(int n){
		this.size = 0;
		this.capacity = n;
		this.stack = new int[n];
	}
	public void push(int x){
		if (this.size < this.capacity){
			this.stack[this.size] = x;
			this.size++;
		}
	}
	public void push(int[] x){
		int i = 0;
		while (this.size < this.capacity && i < x.length){
			this.stack[this.size] = x[i];
			i++;
			this.size++;
		}
	}
	public int pop(){
		if (this.size > 0){
			this.size--;
			int ret = this.stack[this.size];
			return ret;
		}
		return 0;
	}
}