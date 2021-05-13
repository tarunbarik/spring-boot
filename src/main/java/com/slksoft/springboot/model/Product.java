package com.slksoft.springboot.model;

public class Product {
	private String id;
	private String name;
	private String category;

	public Product() {

	}

	/**
	 * @param id
	 * @param name
	 * @param category
	 */
	public Product(String id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

}// class
