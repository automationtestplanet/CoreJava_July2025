package fundamentals;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("------------Arithematic Operatos----------");

		System.out.println(a + b);
		System.out.println(a - 5);
		System.out.println(a * 5);
		System.out.println(a / 5);
		System.out.println(a % 5);

		System.out.println("------------Increment and Decrement Operatos----------");
		a += 5; // a = a+5;
		System.out.println(a);

		a -= 5; // a = a-5;
		System.out.println(a);

		a *= 5; // a = a*5;
		System.out.println(a);

		a /= 5; // a = a/5;
		System.out.println(a);

		a %= 5; // a = a%5;
		System.out.println(a);

		System.out.println(++a); // pre-increment
		System.out.println(a++); // post-increment
		System.out.println(a);
		System.out.println(--a); // pre-decrement
		System.out.println(a);

		System.out.println("------------Comparision Operators----------");

		a = 100;
		b = 200;

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b); // a<b or a==b -> T F -> T (if any one condition is true, it becomes true)
		System.out.println(a >= b); // a>b or a==b -> F F -> F

		System.out.println("------------Logical Operators----------");
		System.out.println(a == b && a != b || a < b); // -> F && T -> F || T -> T
		System.out.println(!(a == b && a != b || a < b));

		System.out.println("------------Ternary Operator----------");
		System.out.println((a > b) ? true : false);
		System.out.println((a > b) ? a : b);
		System.out.println((a > b) ? "A is Bigger" : "B is Bigger");
	}

}
