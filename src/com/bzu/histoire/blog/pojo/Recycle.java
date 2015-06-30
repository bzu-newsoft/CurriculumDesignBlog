package com.bzu.histoire.blog.pojo;

import java.sql.Timestamp;

/**
 * Recycle entity. @author MyEclipse Persistence Tools
 */

public class Recycle implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String path;
	private Timestamp addTime;
	private String acrticletype;

	// Constructors

	/** default constructor */
	public Recycle() {
	}

	/** minimal constructor */
	public Recycle(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Recycle(Integer id, String title, String path, Timestamp addTime,
			String acrticletype) {
		this.id = id;
		this.title = title;
		this.path = path;
		this.addTime = addTime;
		this.acrticletype = acrticletype;
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

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public String getAcrticletype() {
		return this.acrticletype;
	}

	public void setAcrticletype(String acrticletype) {
		this.acrticletype = acrticletype;
	}

}