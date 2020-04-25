/*
Nama: Andjani Kiranadewi
NIM: 13518109
File: TerminalExpression.java
*/

class TerminalExpression implements Expression{
	protected int x;

	public TerminalExpression(int x){
		this.x = x;
	}

	public int solve(){
		return x;
	}
}