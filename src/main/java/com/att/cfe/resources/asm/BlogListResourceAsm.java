package com.att.cfe.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.att.cfe.services.util.BlogList;
import com.att.cfe.controller.BlogController;
import com.att.cfe.resources.BlogListResource;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

/**
 * @author Rohit
 *
 */
@XmlRootElement
public class BlogListResourceAsm extends ResourceAssemblerSupport<BlogList, BlogListResource> {

	public BlogListResourceAsm() {
		super(BlogController.class, BlogListResource.class);
	}

	public BlogListResource toResource(BlogList blogList) {
		BlogListResource res = new BlogListResource();
		res.setBlogs(new BlogResourceAsm().toResources(blogList.getBlogs()));
		return res;
	}

}
