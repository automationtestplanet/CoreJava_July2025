package fundamentals;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;

		System.out.println("----------If Block----------------");

		if (a > b) {
			System.out.println("A greater than B");
		}

		if (a < b) {
			System.out.println("A less than B");
		}

		System.out.println("----------If Else Block----------------");

		if (a > b) {
			System.out.println("A greater than B");
		} else {
			System.out.println("B greater than A");
		}

		if (a < b) {
			System.out.println("A less than B");
		} else {
			System.out.println("B less than A");
		}

		System.out.println("----------If Else-If Else Block----------------");
		if (a == b) {
			System.out.println("A equals B");
		} else if (a > b) {
			System.out.println("A greater than B");
		} else {
			System.out.println("B is greate than A");
		}

		System.out.println("----------Nested If Block----------------");

		if (a > b) {
			if (a == 100) {
				System.out.println("A equals to 100");
			} else {
				System.out.println("A not equals to 100");
			}

		} else {
			if (b > a && b == 100) {
				System.out.println("B equals to 200");
			} else {
				System.out.println("B not equals to 200");
			}
		}

		System.out.println("-------------Switch statement----------------");

		String accountType = "CURRENT";

		switch (accountType) {
			case "SAVINGS":
				System.out.println(accountType);
				break;
			case "CURRENT":
				System.out.println(accountType);
				break;
			case "RETAIL":
				System.out.println(accountType);
				break;
			default:
				System.out.println("No matching case");
		}

	}

}
