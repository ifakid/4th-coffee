public class Utility{
	public static <T extends Number> double getMidpoint(T[] arr){
		if (arr.length%2 == 0){
			return (arr[arr.length/2-1].doubleValue() + arr[arr.length/2].doubleValue())/2;
		} else {
			return arr[arr.length/2].doubleValue();
		}
	}

	public static <T> T getMidpoint(T[] arr){
		return arr[arr.length/2];
	}

	public static <T> T getLast(T[] arr){
		return arr[arr.length-1];
	}

	public static <T extends Number> double getAverage(T[] arr){
		double sum = 0;
		for (T t : arr) {
			sum += t.doubleValue();
		}
		return sum/arr.length;
	}

	public static void main(String[] args) {
		String[] arr1 = {"A","B","C","D"};
		Utility u = new Utility();
		System.out.println(u.getMidpoint(arr1));
	}
}