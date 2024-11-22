package pavanSDET_QA;

//https://www.youtube.com/watch?v=jbGxTi0bi7c&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=26
public class Java26CountOccurancesOfACharacterInAString {

	public static void main(String[] args) {
		String s = "Java Programming Java oops";
		String ch = "o";
		int totalCount = s.length();
		int totalCountAfterRemove = s.replace(ch, "").length();
		int count = totalCount - totalCountAfterRemove;
		System.out.println("Number occurances: " + count);
	}

}
