package com.bzu.histoire.blog.pojo;

import java.sql.Timestamp;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	private Integer id;
	private String content;
	private Timestamp addTime;
	private String visitorName;
	private String vistorEmail;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** minimal constructor */
	public Message(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Message(Integer id, String content, Timestamp addTime,
			String visitorName, String vistorEmail) {
		this.id = id;
		this.content = content;
		this.addTime = addTime;
		this.visitorName = visitorName;
		this.vistorEmail = vistorEmail;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public String getVisitorName() {
		return this.visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVistorEmail() {
		return this.vistorEmail;
	}

	public void setVistorEmail(String vistorEmail) {
		this.vistorEmail = vistorEmail;
	}

}