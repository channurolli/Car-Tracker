package rolli.Car_Tracker.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import rolli.Car_Tracker.entity.Car;

public interface ICarRepository extends CrudRepository<Car, String> {
	Optional<Car> findByModel(String email);
}

//public interface ICarRepository {
//	List<Car> findAll();
//
//	Optional<Car> findById(String id);
//}
