abstract class Rekening {
	protected String nama;
	protected double saldo;
	protected double sukuBunga;

	public Rekening(String nama, double saldo, double sukuBunga){
		this.nama = nama;
		this.sukuBunga = sukuBunga;
		if (saldo < 0){
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}
	}

	abstract public void setor(double uang);
	abstract public void tarik(double uang);
	abstract public void update();

	public String getNama(){
		return this.nama;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public double getSukuBunga(){
		return this.sukuBunga;
	}

	public double hitungBiaya(){
		double biaya = this.saldo / 10;
		return 10 < biaya ? 10 : biaya;
	}
}