package rolli.Car_Tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(method = RequestMethod.GET)
	public List<Car> findAll() {
		List<Car> emp = service.findAll();
		return emp;
	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public Car findOne(@PathVariable("id") String id) {
		return service.findOne(id);
	}
}
