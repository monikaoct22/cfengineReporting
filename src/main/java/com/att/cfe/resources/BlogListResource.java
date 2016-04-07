package com.att.cfe.resources;

import org.springframework.hateoas.ResourceSupport;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rohit
 *
 */
@XmlRootElement
public class BlogListResource extends ResourceSupport {
	private List<BlogResource> blogs = new ArrayList<BlogResource>();

	public List<BlogResource> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<BlogResource> blogs) {
		this.blogs = blogs;
	}
}
