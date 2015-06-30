package com.bzu.histoire.blog.pojo;

/**
 * Acrticletype entity. @author MyEclipse Persistence Tools
 */

public class Acrticletype implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private String title;

	// Constructors

	/** default constructor */
	public Acrticletype() {
	}

	/** minimal constructor */
	public Acrticletype(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Acrticletype(Integer id, String type, String title) {
		this.id = id;
		this.type = type;
		this.title = title;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}