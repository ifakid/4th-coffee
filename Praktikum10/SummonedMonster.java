class SummonedMonster implements ISummoned {
	private Monster mon;
	private boolean open;
	private boolean offense;

	public SummonedMonster(Monster mon, boolean open, boolean offense){
		this.mon = mon;
		this.open = open;
		this.offense = offense;
	}

	@Override
	 // mengubah keadaan kartu dari tertutup jadi terbuka dan mengembalikan true
  	// bila kartu sudah terbuka, tidak lakukan apa-apa dan kembalikan false
 	public boolean flip(){
 	 	if (!open){
 	 		open = true;
 	 		return true;
 	 	}
 	 	return false;
 	 }

 	 @Override
 	 // mengubah posisi karakter dari menyerang jadi bertahan, atau sebaliknya
 	public void rotate(){
 	 	offense = offense ^ true;
 	 }

 	 @Override
 	 // bila dalam posisi menyerang, mengembalikan attack.
  	// bila dalam posisi bertahan, mengembalikan defense
  	public int getPositionValue(){
  		if (offense)
  			return mon.getAttackValue();
  		return mon.getDefenseValue();
  	}

  	@Override
  	// menggambar kartu ke layar
  	public void render(){
  		System.out.print("Monster " + mon.getName() + " dalam keadaan ");
  		if (open)
  			System.out.print("terbuka");
  		else
  			System.out.print("tertutup");
  		System.out.print(" dengan posisi ");
  		if (offense)
  			System.out.println("menyerang");
  		else
  			System.out.println("bertahan");
  	}
}