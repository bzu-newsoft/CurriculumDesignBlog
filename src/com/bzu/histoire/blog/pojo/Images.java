package com.bzu.histoire.blog.pojo;

/**
 * Images entity. @author MyEclipse Persistence Tools
 */

public class Images implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String path;
	private String content;

	// Constructors

	/** default constructor */
	public Images() {
	}

	/** minimal constructor */
	public Images(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Images(Integer id, String title, String path, String content) {
		this.id = id;
		this.title = title;
		this.path = path;
		this.content = content;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}