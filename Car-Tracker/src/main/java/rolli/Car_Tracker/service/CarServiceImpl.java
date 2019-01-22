package rolli.Car_Tracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import rolli.Car_Tracker.entity.Car;
import rolli.Car_Tracker.repository.ICarRepository;

public class CarServiceImpl implements ICarService {

	@Autowired
	ICarRepository repository;

	@Transactional(readOnly = true)
	public List<Car> findAll() {
		return (List<Car>) repository.findAll();
	}

	@Transactional(readOnly = true)
	public Optional<Car> findById(String id) {
		Optional<Car> existing = repository.findById(id);
		if (!existing.isPresent()) {
			try {
				throw new Exception("Id not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return existing;

	}
}
