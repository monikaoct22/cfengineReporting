package com.att.cfe.services.util;

import com.att.cfe.entities.Blog;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author Rohit
 *
 */
@XmlRootElement
public class BlogList {

	private List<Blog> blogs = new ArrayList<Blog>();

	public BlogList(List<Blog> resultList) {
		this.blogs = resultList;
	}
	
	public BlogList() {
		
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}
}
