package org.java.wishlist.first;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Present> wishList = new ArrayList<>();
		
		String newPresent = "";

		while(!newPresent.toLowerCase().equals("close")) {
			
			
			System.out.println("List length: " + wishList.size());
			System.out.println("Insert a present (or \"close\" ): ");
			newPresent = sc.nextLine();
			
			if(!newPresent.toLowerCase().equals("close")){
				
				System.out.println("Who is this present for? ");
				String receiver = sc.nextLine();
				
				Present present = new Present(newPresent, receiver);
				wishList.add(present);
			}
			
		}
		
		System.out.println(wishList);
		
	}
}
