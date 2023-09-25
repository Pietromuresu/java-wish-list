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
		lp2.addEl(2);
		lp2.addEl(3);
		lp2.addEl(4);
		lp2.addEl(5);
//		lp2.addEl(02);
//		lp2.addEl(2);
//		lp2.addEl(0);
//		lp2.addEl(03);
//		lp2.addEl(02);
//		lp2.addEl(8);
//		lp2.addEl(8);
//		lp2.addEl(70);
//		lp2.addEl(70);
//		lp2.addEl(70);
//		lp2.addEl(70);
//		lp2.addEl(70);
//		lp2.addEl(70);
//		lp2.addEl(70);
//		lp2.addEl(70);
//		lp2.addEl(70);
//		lp2.addEl(70);
//		lp2.addEl(70);
		
		do {
			System.out.println(lp2.getElementoSuccessivo());
		}while(lp2.hasAncoraElementi());

	}
}
