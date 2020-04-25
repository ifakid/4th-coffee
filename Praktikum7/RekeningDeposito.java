class RekeningDeposito extends Rekening {
	private int bulan;

	public RekeningDeposito(String nama, double saldo){
		super(nama,saldo,0.15);
		this.bulan = 0;
	}
	public void setor(double uang){
		System.out.println("Tidak dapat melakukan penyetoran uang untuk rekening ini.");
	}
	public void tarik(double uang){
		System.out.println("Tidak dapat melakukan penarikan uang sebagian untuk rekening ini.");
	}
	public void tarik(){
		if (this.bulan < 12){
			System.out.println("Anda terkena penalti sebesar " + (this.saldo * 0.2) + ".");
		}
		this.saldo = 0;
	}
	public void update(){
		this.bulan++;
		if (this.bulan % 12 == 0){
			this.saldo += this.saldo * this.sukuBunga;
		}
		this.saldo -= super.hitungBiaya();
	}
}