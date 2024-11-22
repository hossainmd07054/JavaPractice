package pavanSDET_QA;

//https://www.youtube.com/watch?v=-Miz0uInWVw&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=25
public class Java25RemoveWhiteSpacesInAString {

	public static void main(String[] args) {
		String str = "Java    programming selenium    automation";
		System.out.println("Before removing the white spaces: " + str);
		str = str.replaceAll("\\s", "");
		System.out.println("After removing the white spaces: " + str);
	}

}
