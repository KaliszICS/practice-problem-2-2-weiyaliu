public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean isEven (int n) {
		boolean even = n%2 == 0;
		return even;
	}

	public static boolean isOdd(int n){
		boolean odd = n%2 != 0;
		return odd;
	}

	public static boolean isPositive(int n){
		boolean pos = n>0;
		return pos;
	}

	public static boolean isNegative(int n){
		boolean neg = n<0;
		return neg;
	}

	public static int combinedLength(String a, String b) {
		String ab = a + " " + b;
		return ab;
	}
}
