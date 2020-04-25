class RekeningGiro extends Rekening{
	private boolean penalti;
	public RekeningGiro(String nama, double saldo){
		super(nama,saldo,0.07);
		this.penalti = false;
	}
	public void setor(double uang){
		this.saldo += uang - 0.1;
	}
	public void tarik(double uang){
		if (this.saldo >= uang + 0.1){
			this.saldo -= uang + 0.1;
		}
		if (this.saldo < 500){
			this.penalti = true;
		}
	}
	public void update(){
		this.saldo += this.saldo * this.sukuBunga - this.hitungBiaya();
		if (penalti){
			this.saldo -= 10;
		}
		if (this.saldo < 0){
			this.saldo = 0;
		}
		this.penalti = false;
	}
}