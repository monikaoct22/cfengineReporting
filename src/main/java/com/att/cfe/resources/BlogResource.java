package com.att.cfe.resources;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.ResourceSupport;

import com.att.cfe.entities.*;

/**
 * @author Rohit
 *
 */
@XmlRootElement
public class BlogResource extends ResourceSupport {
	
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Blog toBlog() {
		Blog blog = new Blog();
		blog.setTitle(title);
		return blog;
	}
	
	public String toString() {
		return "BlogVO [title=" + title + "]";
	}
}
