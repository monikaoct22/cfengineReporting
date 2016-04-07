package com.att.cfe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rohit
 *
 */
@Entity
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.NONE)
public class Blog {
	@Id
	@GeneratedValue
	//@XmlAttribute
	private Long id;

	//@XmlElement
	private String title;

	/*
	 * @OneToOne private Account owner;
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/*public String toString() {
		return "BlogVO [id=" + id + ", title=" + title + "]";
	}*/
	/*
	 * public Account getOwner() { return owner; }
	 * 
	 * public void setOwner(Account owner) { this.owner = owner; }
	 */
}
