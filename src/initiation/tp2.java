package initiation;

public class tp2 {
	public static void main(String[] args) {
		tp29();
	}

	public static void tp25() {
		int n;
		double x;
		n = 5;
		x = 2 * n + 1.5;
		System.out.println("n = " + n);
		System.out.println("x = " + x);
		double y;
		y = n * x + 12;
		System.out.println("y = " + y);
	}

	public static void tp26() {
		char code = 'Z';
		int index = code - 'A';
		System.out.println("index = " + index);
	}

	public static void tp27() {
		int n1=0;
		int n2=0;
		System.out.println("n1 = "+n1+ " n2 = "+n2);
		n1=n2++;
		System.out.println("n1 = "+n1+ " n2 = "+n2);
		n1=n2++;
		System.out.println("n1 = "+n1+ " n2 = "+n2);
		n1=n1++;//attention
		System.out.println("n1 = "+n1+ " n2 = "+n2);
	}

	public static void tp28() {
		Integer n1=new Integer(47);
		Integer n2=new Integer(47);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
	}

	public static void tp29() {
		Integer n1= 47;
		Integer n2= 47;
		System.out.println(n1.equals(n2));
	}
}
