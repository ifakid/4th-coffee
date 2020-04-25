/*
Nama: Andjani Kiranadewi
NIM: 13518109
File: AddExpression.java
*/

class AddExpression implements Expression {
	protected Expression x;
	protected Expression y;

	public AddExpression(Expression x, Expression y){
		this.x = x;
		this.y = y;
	}
	public int solve(){
		return this.x.solve() + this.y.solve();
	}
}