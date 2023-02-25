package Bai01;

public class SuDungPhuongThucString {
	public static void main(String[] args) {
		String targetString = "Java is fon to learn";
		String s1 = "JAVA";
		String s2 = "Java";
		String s3 = " Hello Java";
		
		System.out.println("1. Char at index 2 (third position): "+ targetString);
		System.out.println("2. After Concat: "+ targetString.concat("-Enjoy-"));
		System.out.println("3. Checking Equals ignoring case: "+ s2.equalsIgnoreCase(s1));
		System.out.println("4. Checking equals with case: "+ s2.equals(s1));
		System.out.println("5. Checking Length: "+ targetString.length());
		System.out.println("6. Replace funtion: "+ targetString.replace("fun", "easy"));
		System.out.println("7. SubString of targetString"+ targetString.substring(8));
		System.out.println("8. SubString of targetString"+ targetString.substring(8, 12));
		System.out.println("9. Converting to lower case: "+ targetString.toLowerCase());
		System.out.println("10. Converting to upper case: "+ targetString.toUpperCase());
		System.out.println("11. Triming string: "+ s3.trim());
		System.out.println("12. Searching s1 in targetString: "+ targetString.contains(s1));
		System.out.println("13. Searching s2 in targetString: "+ targetString.contains(s2));
		char [] charArray = s2.toCharArray();
		System.out.println("Size of char array"+ charArray.length);
		System.out.println("Printing last element of array:"+ charArray[3]);
	}
}
