package polymorphism;

public class UpcastAndDowncast {

	public static void main(String[] args) {

		short short1 = 500;
		int int1 = short1; // implicit conversion
//			short1 = int1; // bigger datatype value we can not assign to smaller datatype directly
		short1 = (short) int1; // explicit conversion
		
		
		System.out.println("--------------Child Class called methods-----------");
		NewCalculator newCalc = new NewCalculator();
		System.out.println(newCalc.modDivision(10, 20));
		System.out.println(newCalc.addition(10, 20)); // 130
		System.out.println(newCalc.subtraction(10, 20));
		System.out.println(newCalc.multiplication(10, 20));
		System.out.println(newCalc.division(10, 20));

		System.out.println("--------------Parent Class called methods-----------");
		Calculator calc = newCalc; // Up-casting
//			System.out.println(calc.modDivision(10, 20));   // we can not access with parent reference
		System.out.println(calc.addition(10, 20)); // 30 -> it prints child class method result i.e 130
		System.out.println(calc.subtraction(10, 20));
		System.out.println(calc.multiplication(10, 20));
		System.out.println(calc.division(10, 20));
		
		System.out.println("--------------Child Class called methods-----------");
		newCalc = (NewCalculator) calc; // down-casting
		System.out.println(newCalc.modDivision(10, 20));
		System.out.println(newCalc.addition(10, 20)); // 130
		System.out.println(newCalc.subtraction(10, 20));
		System.out.println(newCalc.multiplication(10, 20));
		System.out.println(newCalc.division(10, 20));

	}

}
