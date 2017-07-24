package io.egen.controller;

import io.egen.entity.Artist;
import io.egen.entity.Calender;
import io.egen.service.ArtistService;
import io.egen.service.CalenderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalenderController {
	@Autowired
	CalenderService service;
	public List<Calender> findAll() {
		return service.findAll();
	}
		public Calender findOne(String id) {
			return service.findOne(id);
		}

		public Calender create(Calender calender) {
			return service.create(calender);
		}

		public void delete(String id) {
			service.delete(id);
		}

		public Calender update(String id,Calender calender) {
			return service.update(id, calender);
		}
}
