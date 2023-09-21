package org.java.wishlist.first;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> wishList = new ArrayList<>();
		
		
		System.out.println("Insert a present (or \"close\" ): ");
		String newPresent = sc.nextLine();
		
		while(!newPresent.toLowerCase().equals("close")) {
			
			wishList.add(newPresent);
			
			System.out.println("List length: " + wishList.size());
			System.out.println("Insert another present (or \"close\" ): ");
			newPresent = sc.nextLine();
			
		}
		
		System.out.println(wishList);
		
	}
}
