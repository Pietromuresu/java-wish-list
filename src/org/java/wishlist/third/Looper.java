package org.java.wishlist.third;

public class Looper {
	final int startIndex = 0;
	private int[] myArray;
	private int index; 
	
	
	public Looper(int[] myArray) {
		setMyArray(myArray);
		setIndex(this.startIndex);
	}
	
	public Looper() {
		setMyArrayBonus();
	}

	public int[] getMyArray() {
		return myArray;
	}

	public void setMyArray(int[] myArray) {
	
		this.myArray = new int[myArray.length];
		
		this.myArray = myArray;
	}

	public void setMyArrayBonus() {
		
		this.myArray = new int[10];
		
	}
	
	public void addEl(int el) {
		
		String err = null;
		try {
			
			myArray[myArray.length] = el;
		}catch(Exception e) {
			err = e.getMessage();
			
 		}
		
		if(err != null) {
			
			int[] newArray = new int[myArray.length + 10];
			newArray = this.myArray;
			
			this.myArray = new int[newArray.length];
			this.myArray = newArray;
			
			addEl(el);
		}
		
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
