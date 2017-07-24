package io.egen.controller;

import io.egen.entity.MovieGenre;
import io.egen.entity.User;
import io.egen.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> findAll() {
        return service.findAll();
    }
    public User findOne(String id) {
		return service.findOne(id);
	}
    
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User create(@RequestBody User user) {
		return service.create(user);
	}
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(String id) {
		service.delete(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}",
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User update(@PathVariable("id") String id,@RequestBody User user) {
		return service.update(id, user);
	}
}
