package rolli.Car_Tracker.service;

import java.util.List;
import java.util.Optional;

import rolli.Car_Tracker.entity.Car;

public interface ICarService {

	List<Car> findAll();

	Optional<Car> findById(String id);

}
