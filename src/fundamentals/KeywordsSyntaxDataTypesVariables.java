package fundamentals;

public class KeywordsSyntaxDataTypesVariables {

	public static void main(String[] args) {
		byte byte1;
		byte1 = 100;

		byte byte2 = 127;
		short short1 = 128;
		short short2 = 32767;
		int int1 = 32768;
		int int2 = 1234567890;
		long long1 = 12345678901L;
		float float1 = 100.5F;
		double double1 = 100.52664747D;

		char char1 = 'a';
		char char2 = 'A';
		char char3 = '$';
		char char4 = '1';

		String stirng1 = "abcd";
		String stirng2 = "Hello this is Java Langauage";
		String stirng3 = "Hello12345thi%@%$#^#&*@isJavaLangauage";
		String stirng4 = "100";
		String stirng5 = "true";

		System.out.println(stirng3);
		System.out.println(byte2 + short1);

		boolean bool1 = byte2 == short1;
		System.out.println(bool1);
		boolean bool2 = true;
		boolean bool3 = false;

	}

}
