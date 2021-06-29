package com.javaExcersies.JavaDay2;

public class Invoice {
	String partNumber;
	String partDescription;
	int quanitity;
	double itemPrice;
	
	Invoice(String partNumber, String partDescription, int quanitity, double itemPrice){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quanitity = quanitity;
		this.itemPrice = itemPrice;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuanitity() {
		return quanitity;
	}

	public void setQuanitity(int quanitity) {
		this.quanitity = quanitity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public double getInvoice() {
		if(itemPrice <= 0 || quanitity <= 0) {
			double totalPrice = itemPrice * (double) quanitity;
			return totalPrice;
			}
		else
			return 0;
	}
}
