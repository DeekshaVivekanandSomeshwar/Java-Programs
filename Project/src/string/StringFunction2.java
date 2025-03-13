package string;

public class StringFunction2 {

	public static void main(String[] args) {
		String a="Gro";
		String b=a.concat("Tech");
		System.out.println("b="+b);
		String c="Minds";
		String d="Automation";
		System.out.println("Concated text without space: "+b.concat(c).concat(d));
		System.out.println("Concated text with space: "+b.concat(" ").concat(c).concat(" ").concat(d));
		String e= b.concat(" ").concat(c).concat(" ").concat(d);
		boolean f = e.contains("Automation");
		System.out.println("Contains: "+f);
		boolean g = a.equals("Gro");
		System.out.println("Equal: "+g);
		boolean h = b.equalsIgnoreCase("GROTECH");
		System.out.println("Equal Ignore Case: "+h);
		
		

	}

}
