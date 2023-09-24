package org.java.wishlist.second;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the word to find occurences: ");
		String givenWord = sc.nextLine();
		
		Map<Character, Integer> occurrences = new HashMap<>();
		
		 for (char letter : givenWord.toCharArray()) {
			 if(!occurrences.containsKey(letter)) {
		
				 occurrences.put(letter, 1);
			 }else {
			
				 Integer increaseCounter = occurrences.get(letter) + 1;
				 occurrences.put(letter, increaseCounter);
			 }
		}	
	
		 System.out.println(occurrences);
	}
}
