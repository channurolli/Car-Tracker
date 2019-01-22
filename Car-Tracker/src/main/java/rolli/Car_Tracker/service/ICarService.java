package rolli.Car_Tracker.service;

import java.util.List;

import rolli.Car_Tracker.entity.Car;

public interface ICarService {

	List<Car> findAll();

	Car findOne(String id);

}
