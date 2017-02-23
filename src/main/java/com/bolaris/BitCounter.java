package main.java.com.bolaris;

public class BitCounter {
	public static int countBitsSlow(int value) {
		
		int count = 0;
		
		while(value != 0) {
			if ((value & 1) == 1) {
				count++;
			}
			value = value >> 1;
		}
		
		return count;
	}
}
