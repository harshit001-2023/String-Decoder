import java.util.Scanner;

public class StringDecoderByMyOwn {
	
	public static String DecodeString(int N, String str) {
		
		//Converting the String in Char Array
		char result[] = str.toCharArray();
		//performing operation up to array length
		for(int i = 0; i < result.length; i++) {
			//Shifting each char back by 1
			char currentValue = result[i];
			if(Character.isLetter(currentValue)) {
				int shiftedValue = currentValue- 1;
				
				if(shiftedValue < 'A') {
					shiftedValue = 'Z';
				} else if(shiftedValue < 'a') {
					shiftedValue = 'z';
				}
				//assigning the shiftedValue in char format
				result[i] = (char) shiftedValue;
			}
		}
		//After shifting returning result as String
		return new String(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking integer as input and checking if it is valid or not
		System.out.println("Ente N : ");
		while(!sc.hasNextInt()) {
			System.out.println("Error! Invalid Integer Input. ");
			sc.nextLine();
			return;
		}
		
		int N = sc.nextInt();
		sc.nextLine();
		
		//Taking string value of size same as N
		System.out.println("Enter the String of size "+N);
		String str = sc.nextLine();
		if(str.length() != N) {
			System.out.println("String not matched ");
		}
		
		//Applying try catch for Exception 
		try {
			//created an object of DecodedString method of parameter N, str
			String DecodedString = DecodeString(N, str);
			System.out.println(new StringBuffer(str).reverse());//returning reverse string
			System.out.println(new StringBuffer(DecodedString).reverse());//returning reverse Decoded String
		} catch(IllegalArgumentException e) {
			System.err.println("Invalid"+e.getMessage());
		}
		
		sc.close();
	}

}
