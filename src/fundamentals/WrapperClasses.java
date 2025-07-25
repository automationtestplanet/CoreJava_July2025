package fundamentals;

public class WrapperClasses {

	public static void main(String[] args) {
		byte b = 100;
		String string1 = "100";
//		b = string1;   // non-primitive to primitive
//		string1=b;		// primitive to non-primitive

		byte byte1 = 100; // primitive
		Byte byte2 = byte1; // primitive to non-primitive
		byte1 = byte2; // primitive to non-primitive

		short short1 = 200;
		Short short2 = short1;

		int int1 = 100;
		Integer int2 = int1;

		long long1 = 10000;
		Long long2 = long1;

		float float1 = 10.5F;
		Float float2 = float1;

		double double1 = 100.5243D;
		Double double2 = double1;

		boolean bool1 = true;
		Boolean bool2 = bool1;

		char char1 = 'A';
		Character char2 = char1;

		String str = "100";

//		byte b1 = (byte)str;
		byte b1 = Byte.parseByte(str);
		short s1 = Short.parseShort(str);
		int i1 = Integer.parseInt(str);
		long l1 = Long.parseLong(str);
		float f1 = Float.parseFloat(str);
		double d1 = Double.parseDouble(str);

		String str2 = "true";
		boolean bool3 = Boolean.parseBoolean(str2);

		byte byte3 = 100;
//		String string2 = (String)byte3;
		String string2 = String.valueOf(byte3);
		String string3 = String.valueOf(1000);
		String string4 = String.valueOf(10.5F);
		String string5 = String.valueOf(100.5432D);
		String string6 = String.valueOf('A');
		String string7 = String.valueOf(true);

		String string8 = "Java";
//		int int3 = Integer.parseInt(string8);  // Number Format exception

		boolean bool4 = Boolean.parseBoolean(string8); // False
		System.out.println(bool4);

	}

}
