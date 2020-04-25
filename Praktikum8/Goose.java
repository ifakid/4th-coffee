class Goose {
	private String name;
	private int honk;

	Goose(){
		name = "Horrible";
		honk = 1;
	}

	Goose(String name, int honk){
		this.name = name;
		this.honk = honk;
	}

	public void steal(String thing){
		System.out.println(name + " steals " + thing);
	}

	@Override
	public String toString(){
		String str = name;
		str += " goose says";
		for (int i = 0; i < honk; i++){
			str += " honk";
		}
		return str;
	}

	public static void main(String[] args) {
		Goose g = new Goose();
		Goose h = new Goose("Matilda", 3);
		System.out.println(g);
		System.out.println(h);
		g.steal("shoes");
	}
}