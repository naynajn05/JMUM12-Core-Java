package com.tnsif.covariantoverridding;

//parent class
class Color {

	protected Color getColor() {
		Color c = new Color();
		return c;
	}

}

// child class
class Red extends Color {
	protected Red getColor() {
		Red r = new Red();
		return r;
	}
}

//child class
class Yellow {
	protected Yellow getColor() {
		Yellow y = new Yellow();
		return y;
	}

}

public class CovaraintOverriddingDemo {

	public static void main(String[] args) {
		Color c1 = new Color();
		Color c2 = c1.getColor();
		System.out.println(c2);

		Red r1 = new Red();
		Red r2 = r1.getColor();
		System.out.println(r2);

	}

}
