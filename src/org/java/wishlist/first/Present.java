package org.java.wishlist.first;

public class Present {
	private String title;
	private String receiver;
	
	public Present(String title, String receiver) {
		setTitle(title);
		setReceiver(receiver);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + this.receiver + "] -> " +  this.title;
	}
	
}
