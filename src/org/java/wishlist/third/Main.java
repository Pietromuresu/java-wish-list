package org.java.wishlist.third;

public class Main {
	
	public static void main(String[] args) {
		int[] arrToPass = {1,2,3,4,5,6,7};
		Looper lp = new Looper(arrToPass);
		
		
		do {
			System.out.println(lp.getElementoSuccessivo());
		}while(lp.hasAncoraElementi());

		
		
		System.out.println("---------------------------------------------");
		Looper lp2 = new Looper();
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		lp2.addEl(0);
		
		do {
			System.out.println(lp2.getElementoSuccessivo());
		}while(lp2.hasAncoraElementi());

	}
}
