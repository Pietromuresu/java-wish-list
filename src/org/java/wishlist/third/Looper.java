package org.java.wishlist.third;

public class Looper {
	final int startIndex = 0;
	private int[] myArray;
	private int index; 
	
	public Looper(int[] myArray) {
		setMyArray(myArray);
		setIndex(this.startIndex);
	}

	public int[] getMyArray() {
		return myArray;
	}

	public void setMyArray(int[] myArray) {
	
		this.myArray = new int[myArray.length];
		
		this.myArray = myArray;
	}

	public int getIndex() {
		
		return index;
	}

	public void setIndex(int start) {
		this.index = start;
	}
	
	
	public int getElementoSuccessivo() {
		
		int element = this.myArray[this.index];
	
		if(this.hasAncoraElementi())
			this.index++;
		
		return element;
		
		
		
	}
	
	
	public boolean hasAncoraElementi() {
		try {
			int nextEl = myArray[index];
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}
	
}
