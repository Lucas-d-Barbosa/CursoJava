
public class Main01 {
	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG  ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 10);
		String s06 = original.replace("a", "x");
		String s07 = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
	
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase(): -" + s01 + "-");
		System.out.println("toUpperCase(): -" + s02 + "-");
		System.out.println("trim(): -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 10): -" + s05 + "-"); // Não incluie o decimo char
		System.out.println("replace('a', 'x'): -" + s06 + "-"); // troca o primeiro char pelo segundo
		System.out.println("replace('abc', 'xyz'): -" + s07 + "-"); // troca o primeiro char pelo segund
		System.out.println("indexOf(\"bc\"): -" + i + "-"); // pega a primeira ocorrencia da string passada
		System.out.println("lastIndexOf(\"bc\"): -" + j + "-"); // pega a ultima ocorrencia da string passada
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}
