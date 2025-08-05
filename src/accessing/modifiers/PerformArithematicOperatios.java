package accessing.modifiers;

import calculator.Calculator;
//import calculator.ImplementsCalculator;  // It is not public class
import calculator.UseCalculator;

public class PerformArithematicOperatios {

	public static void main(String[] args) {
//		Calculator calc = new Calculator();		
		Calculator calc = new UseCalculator();
		int result = calc.addition(10, 20);
		System.out.println(result);

	}

}
