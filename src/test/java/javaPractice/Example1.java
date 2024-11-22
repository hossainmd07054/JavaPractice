package javaPractice;

public class Example1 {

	private int x;
	private int y;
	private int z;

	public void setData(int p, int q) {
		x = p;
		y = q;
		z = x + y;
	}

	public void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
