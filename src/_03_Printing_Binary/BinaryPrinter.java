package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void printByteBinary(byte b) {
		
		String s = "";
		String str = "";
		byte a = 0b1;
		for (int i = 0; i < 8; i++) {
			s += (b&a) >> i;
			a = (byte) (a << 1);
		}
		for (int i = 7; i > -1; i--) {
			str += s.charAt(i);
		}
		System.out.println(str);
		System.out.println(Integer.toBinaryString(b));
	}
	
	public static void printShortBinary(short s) {
		String st = "";
		String str = "";
		short a = 0b1;
		for (int i = 0; i < 16; i++) {
			st += (s&a) >> i;
			a = (short) (a << 1);
		}
		for (int i = 15; i > -1; i--) {
			str += st.charAt(i);
		}
		System.out.println(str);
		System.out.println(Integer.toBinaryString(s));
	}
	
	public static void printIntBinary(int i) {
		String st = "";
		String str = "";
		int a = 0b1;
		for (int is = 0; is < 32; is++) {
			st += (i&a) >> is;
			a = (int) (a << 1);
		}
		for (int is = 31; is > -1; is--) {
			str += st.charAt(is);
		}
		System.out.println(str);
		System.out.println(Integer.toBinaryString(i));
	}
	
	public static void printLongBinary(long l) {
		String st = "";
		String str = "";
		long a = 0b1;
		for (int is = 0; is < 64; is++) {
			st += (l&a) >> is;
			a = (long) (a << 1);
		}
		for (int is = 63; is > -1; is--) {
			str += st.charAt(is);
		}
		System.out.println(str);
		System.out.println(Integer.toBinaryString((int) l));
	}
	public static void main(String[] args) {
		printByteBinary((byte) 100);
		printShortBinary((short) 11111);
		printIntBinary((int) 1234567890);
		printLongBinary((long) 999999999);
	}
}
