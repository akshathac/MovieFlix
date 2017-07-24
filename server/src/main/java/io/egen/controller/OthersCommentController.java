package io.egen.controller;

import io.egen.entity.MovieType;
import io.egen.entity.OthersComment;
import io.egen.service.OthersCommentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/othercomments")
public class OthersCommentController {
	@Autowired
	OthersCommentService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)  
		public List<OthersComment> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
		public OthersComment findOne(String id) {
			return service.findOne(id);
		}

		public OthersComment create(OthersComment movieimdb) {
			return service.create(movieimdb);
		}

		public void delete(String id) {
			service.delete(id);
		}

		public OthersComment update(String id,OthersComment movieimdb) {
			return service.update(id, movieimdb);
		}
}
