package pavanSDET_QA;

import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=1_hhywLAO5o&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=3
public class Java03ReverseAString {
	@Test
	public void forLoop() {
		String name = "Mohammad";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i) + " ");
		}
	}

	@Test
	public void stringBuffer() {
		String name = "Mohammad";
		StringBuffer st = new StringBuffer(name);
		StringBuffer rev = st.reverse();
		System.out.print(rev);
	}

}
