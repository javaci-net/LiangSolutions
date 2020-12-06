package chapter01;

public class S12 {

	public static void main(String[] args) {
		int toplamSaniye = (1 * 60 * 60 + 40 * 60 + 35);
		
		double saattekiHiz = (24.0 / toplamSaniye) * 60 * 60;
		
		System.out.println("Kilometre cinsinden saatteki hizi: " + (saattekiHiz * 1.6));

	}

}
