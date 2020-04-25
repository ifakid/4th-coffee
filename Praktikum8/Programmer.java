class Programmer extends Employee {
	public Programmer(){
		super();
	}
	public int calculateSalary(int workHour){
		int salary = 0;
		if (hasMarried){
			salary += 4000000;
		}
		if (workHour > 150){
			salary += 100000 * 150;
			salary += (workHour - 150) * 10000;
		} else {
			salary += 100000 * workHour;
		}
		return salary;
	}
}