package Strings;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String class does not have reverse() method, we need to convert the
		// input string to StringBuilder, which is achieved by using the append
		// method of StringBuilder.
		String reverse = "Hakuna Matata";
		StringBuilder sb = new StringBuilder();
		// Append string into String Builder
		sb.append(reverse);
		sb = sb.reverse();
		System.out.println(sb);

	}
	

}
