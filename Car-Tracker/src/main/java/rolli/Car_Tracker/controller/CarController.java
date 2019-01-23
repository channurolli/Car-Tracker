package rolli.Car_Tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rolli.Car_Tracker.entity.Car;
import rolli.Car_Tracker.service.ICarService;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

	@Autowired
	ICarService service;

//	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping(method = RequestMethod.GET)
	public List<Car> findAll() {
		return service.findAll();
	}

//	@RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Car findOne(@PathVariable("id") String id) {
		return service.findOne(id);
	}

	// @RequestMapping(method = RequestMethod.POST, consumes =
	// MediaType.APPLICATION_JSON_UTF8_VALUE, produces =
	// MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping(method = RequestMethod.POST)
	public Car create(@RequestBody Car car) {
		return service.create(car);
	}

//	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public Car update(@PathVariable("id") String id, @RequestBody Car car) {
		return service.update(id, car);
	}

//	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable("id") String id) {
		service.delete(id);
	}
}
