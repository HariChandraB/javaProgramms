package Strings;

public class ReverseStrCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "HakunaMatata";
		char[] c = reverse.toCharArray();
		
		for (int i = c.length - 1; i >= 0; i--) {
			
			System.out.println("Reverse of String : " + c[i]);

		}

	}

}
