package com.att.cfe.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.att.cfe.entities.Blog;
import com.att.cfe.services.BlogService;
import com.att.cfe.services.util.BlogList;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.PersistenceContext;

/**
 * @author Rohit
 *
 */
@Service
// @Transactional
public class BlogServiceImpl implements BlogService {

	public BlogList findAllBlogs() {
		// return new BlogList(blogRepo.findAllBlogs());
		return new BlogList(allBlogs());
	}

	private List<Blog> allBlogs() {
		List<Blog> lst = new ArrayList<Blog>();

		for (int i = 0; i < 0; i++) {
			Blog blog = new Blog();
			blog.setId(new Long(i));
			blog.setTitle("my Title " + i);
			lst.add(blog);
		}
		return lst;
	}

	/*
	 * @Autowired private BlogRepo blogRepo;
	 * 
	 * @Autowired private BlogEntryRepo entryRepo;
	 */

	/*
	 * @Override public BlogEntry createBlogEntry(Long blogId, BlogEntry data) {
	 * Blog blog = blogRepo.findBlog(blogId); if(blog == null) { throw new
	 * BlogNotFoundException(); } BlogEntry entry =
	 * entryRepo.createBlogEntry(data); entry.setBlog(blog); return entry; }
	 */

	// @Override
	/*
	 * public BlogList findAllBlogs() { return null;// new
	 * BlogList(blogRepo.findAllBlogs()); }
	 */

	/*
	 * @Override public BlogEntryList findAllBlogEntries(Long blogId) { Blog
	 * blog = blogRepo.findBlog(blogId); if(blog == null) { throw new
	 * BlogNotFoundException(); } return new BlogEntryList(blogId,
	 * entryRepo.findByBlogId(blogId)); }
	 */

	/*
	 * @Override public Blog findBlog(Long id) { return blogRepo.findBlog(id); }
	 */
}
