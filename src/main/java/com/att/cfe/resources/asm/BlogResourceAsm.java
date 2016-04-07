package com.att.cfe.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.att.cfe.entities.Blog;
import com.att.cfe.controller.BlogController;
import com.att.cfe.resources.BlogResource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

public class BlogResourceAsm extends ResourceAssemblerSupport<Blog, BlogResource> {
	public BlogResourceAsm() {
		super(BlogController.class, BlogResource.class);
	}

	public BlogResource toResource(Blog blog) {
		BlogResource resource = new BlogResource();
		resource.setTitle(blog.getTitle());
		resource.add(linkTo(BlogController.class).slash(blog.getId()).withSelfRel());
		resource.add(linkTo(BlogController.class).slash(blog.getId()).slash("blog-entries").withRel("entries"));
		/*
		 * if (blog.getOwner() != null)
		 * resource.add(linkTo(AccountController.class).slash(blog.getOwner().
		 * getId()).withRel("owner"));
		 */
		return resource;
	}

}
