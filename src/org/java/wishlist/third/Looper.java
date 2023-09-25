package org.java.wishlist.third;

public class Looper {
	final int startIndex = 0;
	private int[] myArray;
	private int index; 
	private int counter = 0;
	
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

		myArray[counter++] = el;

		if(counter == myArray.length){
			int[] newArray = new int[myArray.length + 10];
			for(int i = 0; i < myArray.length; i++) {
				newArray[i] = myArray[i];
			}
			
			this.myArray = newArray;
		
			
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
		return index < counter;
	}
		
}
