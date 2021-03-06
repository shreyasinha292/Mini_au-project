package com.project.sources;

public class Menu {
	private String itemId;
	private String itemName;
	private String category;
	private int availability;
	private double smallPrice;
	private double mediumPrice;
	private double largePrice;
	private String description;
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Menu() {}


	public Menu(String itemId, String itemName, String category, int availability, double smallPrice, double mediumPrice,
			double largePrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.availability = availability;
		this.smallPrice = smallPrice;
		this.mediumPrice = mediumPrice;
		this.largePrice = largePrice;
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getAvailability() {
		return availability;
	}


	public void setAvailability(int availability) {
		this.availability = availability;
	}


	public double getSmallPrice() {
		return smallPrice;
	}


	public void setSmallPrice(double smallPrice) {
		this.smallPrice = smallPrice;
	}


	public double getMediumPrice() {
		return mediumPrice;
	}


	public void setMediumPrice(double mediumPrice) {
		this.mediumPrice = mediumPrice;
	}


	public double getLargePrice() {
		return largePrice;
	}


	public void setLargePrice(double largePrice) {
		this.largePrice = largePrice;
	}


	
	
}
