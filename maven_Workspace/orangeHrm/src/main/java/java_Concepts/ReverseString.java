package java_Concepts;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name="Manoj";
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+ name.charAt(i);
		}
		
		System.out.print(reverse);
	}

}
