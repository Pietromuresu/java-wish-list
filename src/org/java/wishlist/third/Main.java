package org.java.wishlist.third;

public class Main {
	
	public static void main(String[] args) {
		int[] arrToPass = {1,2,3,4,5,6,7};
		Looper lp = new Looper(arrToPass);
		
		
		do {
			System.out.println(lp.getElementoSuccessivo());
		}while(lp.hasAncoraElementi());

		
	}
}
