class RekeningTabungan extends Rekening {
	public RekeningTabungan(String nama, double saldo){
		super(nama,saldo,0.05);
	}
	public void setor(double uang){
		this.saldo += uang;
	}
	public void tarik(double uang){
		if (this.saldo >= uang){
			this.saldo -= uang;
		}
	}
	public void update(){
		this.saldo += this.saldo * this.sukuBunga;
		this.saldo -= this.hitungBiaya();
	}
}