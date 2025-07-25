package fundamentals;

public class TypeConversion {

	public static void main(String[] args) {

			byte byte1 = 100;
			
			short short1 = byte1;  // byte has smaller memory that can directly fit into short bigger memory
			
			short short2 = 100;
			
//			byte byte2 = short2; // short has bigger memory that cannot directly fit into byte smaller memory
			
			short short3 = 200;
			byte byte3 = (byte)short3;  // Explicit Conversion
			
			System.out.println(short3);
			System.out.println(byte3);  // -128 to + 127  recycled value
			
			short1 = byte1;  // Implicit conversion
			
			System.out.println(short1);
			System.out.println(byte1);
			
			int int1 = 1000;
			float float1 = int1;  // Implicit Conversion
			
			System.out.println(int1);
			System.out.println(float1);
			
			float float2 = 1000.55F; // 1000.55 Billion
			int int2 = (int)float2;  // there will be a loss of data
			System.out.println(float2);
			System.out.println(int2);
			
			long long1 = 100000;
			double double1 = long1;
			
			double double2 = 100000;
			long long2 = (long)double2;
			
			
			String string1 = "100";
			System.out.println(string1);
			
//			byte byte4 = (byte)string1;  // Non-Primnitive to primitive
//			int int4 = (int)string1;
//			long long4 = (long)string1;
			
			int int5 = 100;
			
//			String string2 = (String)int5;  // primitive to non-primitive
			
			
			Object obj1 = 1000;  // Primitive
			Object obj2 = true;
			Object obj3 = 1000.05;
			Object obj4 = "100";  // Non- primitive
			Object obj5 = 'A';
			
			
			var var1 = 1000;  // Primitive
			var var2 = true;
			var var3 = 1000.05;
			var var4 = "100";  // Non- primitive
			var var5 = 'A';
			
			
			

	}

}
