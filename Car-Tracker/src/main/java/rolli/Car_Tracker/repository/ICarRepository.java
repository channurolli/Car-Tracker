package rolli.Car_Tracker.repository;

import java.util.List;
import java.util.Optional;

import rolli.Car_Tracker.entity.Car;

//public interface ICarRepository extends CrudRepository<Car, String>{
//
//}

public interface ICarRepository {
	List<Car> findAll();

	Optional<Car> findById(String id);
}
