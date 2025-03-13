package string;

public class Replace {

	public static void main(String[] args) {
		String name= "manish kumar tiwari";
		name.replace("tiwari", "rai");
		System.out.println(name);
		
		StringBuffer s1 = new StringBuffer("manish kumar tiwari");
		s1.replace(13, 19, "rai");
		System.out.println(s1);
	}

}
