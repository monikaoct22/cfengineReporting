package com.att.cfe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.att.cfe.entities.Blog;
import com.att.cfe.services.BlogService;
import com.att.cfe.services.util.BlogList;

import com.att.cfe.resources.BlogListResource;
import com.att.cfe.resources.asm.BlogListResourceAsm;

import java.net.URI;

/**
 * @author Rohit
 *
 */
@Controller
@RequestMapping("/rest/blogs")
public class BlogController {
	private BlogService blogService;

	@Autowired
	public BlogController(BlogService blogService) {
		this.blogService = blogService;
	}

	//@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@RequestMapping(headers="Accept=application/xml, application/json", method = RequestMethod.GET)
	public ResponseEntity<BlogListResource> findAllBlogs() {
		BlogList blogList = blogService.findAllBlogs();
		BlogListResource blogListRes = new BlogListResourceAsm().toResource(blogList);
		return new ResponseEntity<BlogListResource>(blogListRes, HttpStatus.OK);
	}
	
    /*@RequestMapping(value="/{accountId}/blogs",
            method = RequestMethod.POST)
        public ResponseEntity<BlogResource> createBlog(
                @PathVariable Long accountId,
                @RequestBody BlogResource res)
        {
            try {
                Blog createdBlog = accountService.createBlog(accountId, res.toBlog());
                BlogResource createdBlogRes = new BlogResourceAsm().toResource(createdBlog);
                HttpHeaders headers = new HttpHeaders();
                headers.setLocation(URI.create(createdBlogRes.getLink("self").getHref()));
                return new ResponseEntity<BlogResource>(createdBlogRes, headers, HttpStatus.CREATED);
            } catch(AccountDoesNotExistException exception)
            {
                throw new NotFoundException(exception);
            } catch(BlogExistsException exception)
            {
                throw new ConflictException(exception);
            }
        }*/

	/*@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET )
	public ResponseEntity<BlogList> findAllBlogs() {
		BlogList blogList = blogService.findAllBlogs();
		//BlogListResource blogListRes = new BlogListResourceAsm().toResource(blogList);
		return new ResponseEntity<BlogList>(blogList, HttpStatus.OK);
	}*/

	/*
	 * @RequestMapping(value="/{blogId}", method = RequestMethod.GET) public
	 * ResponseEntity<BlogResource> getBlog(@PathVariable Long blogId) { Blog
	 * blog = blogService.findBlog(blogId); if(blog != null) { BlogResource res
	 * = new BlogResourceAsm().toResource(blog); return new
	 * ResponseEntity<BlogResource>(res, HttpStatus.OK); } else { return new
	 * ResponseEntity<BlogResource>(HttpStatus.NOT_FOUND); } }
	 * 
	 * @RequestMapping(value="/{blogId}/blog-entries", method =
	 * RequestMethod.POST) public ResponseEntity<BlogEntryResource>
	 * createBlogEntry(
	 * 
	 * @PathVariable Long blogId,
	 * 
	 * @RequestBody BlogEntryResource sentBlogEntry ) { BlogEntry
	 * createdBlogEntry = null; try { createdBlogEntry =
	 * blogService.createBlogEntry(blogId, sentBlogEntry.toBlogEntry());
	 * BlogEntryResource createdResource = new
	 * BlogEntryResourceAsm().toResource(createdBlogEntry); HttpHeaders headers
	 * = new HttpHeaders();
	 * headers.setLocation(URI.create(createdResource.getLink("self").getHref())
	 * ); return new ResponseEntity<BlogEntryResource>(createdResource, headers,
	 * HttpStatus.CREATED); } catch (BlogNotFoundException e) { throw new
	 * NotFoundException(e); } }
	 * 
	 * @RequestMapping(value="/{blogId}/blog-entries") public
	 * ResponseEntity<BlogEntryListResource> findAllBlogEntries(
	 * 
	 * @PathVariable Long blogId) { try { BlogEntryList list =
	 * blogService.findAllBlogEntries(blogId); BlogEntryListResource res = new
	 * BlogEntryListResourceAsm().toResource(list); return new
	 * ResponseEntity<BlogEntryListResource>(res, HttpStatus.OK); }
	 * catch(BlogNotFoundException exception) { throw new
	 * NotFoundException(exception); } }
	 */
}
