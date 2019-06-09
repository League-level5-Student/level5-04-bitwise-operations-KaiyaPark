package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void printByteBinary(byte b) {
		/*int num = b;
		String sum = "";
		for (int i = 8; i > 0; i--) {
		if(num>>i == 1) {
			sum = sum + "1"; 
			if(!(i==1)) {
			num = num - 2^8;
			}
			}
		else {
			sum = sum + "0"; 
		}
		}
		System.out.println(sum);*/
		System.out.println(Integer.toBinaryString(b));
	}
	
	public void printShortBinary(short s) {
		System.out.println(Integer.toBinaryString(s));
	}
	
	public void printIntBinary(int i) {
		System.out.println(Integer.toBinaryString(i));
	}
	
	public void printLongBinary(long l) {
		System.out.println(Integer.toBinaryString((int) l));
		//:-) also mr Mike taught me how to cheat the system
	}
	public static void main(String[] args) {
		printByteBinary((byte) 100);
	}
}
