
public class ReverseString {

	public static void main(String[] args) {
		
		reverseString("hello");
		reverseString("hello");
	}
	
	public static void reverseString(String string){
		char[] charArray = string.toCharArray();
		
		for(int last = charArray.length - 1, first = 0; first < last ; first++,last--){
			char firstValue =  charArray[first];
			char lastValue = charArray[last];
			
			charArray[first] = lastValue;
			charArray[last] = firstValue;
		}
		
		System.out.println(new String(charArray));
	}
	
	
	public static void reverseString2(String string) {
		byte[] stringAsByteArray = string.getBytes();
		byte [] resultArray = new byte[stringAsByteArray.length];
		
		for(int i = 0; i < stringAsByteArray.length; i++) {
			resultArray[i] = stringAsByteArray[stringAsByteArray.length - 1 - i];
		}
		System.out.println(new String(resultArray));
	}

}
