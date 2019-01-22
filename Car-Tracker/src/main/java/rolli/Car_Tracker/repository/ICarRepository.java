package rolli.Car_Tracker.repository;

import org.springframework.data.repository.CrudRepository;

import rolli.Car_Tracker.entity.Car;

public interface ICarRepository extends CrudRepository<Car, String>{

}
