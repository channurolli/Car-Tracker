package rolli.Car_Tracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rolli.Car_Tracker.entity.Car;
import rolli.Car_Tracker.exception.BadRequestException;
import rolli.Car_Tracker.exception.ResourceNotFoundException;
import rolli.Car_Tracker.repository.ICarRepository;

@Service
public class CarServiceImpl implements ICarService {

	@Autowired
	ICarRepository repository;

	@Transactional(readOnly = true)
	public List<Car> findAll() {
		return (List<Car>) repository.findAll();
	}

	@Transactional(readOnly = true)
	public Car findOne(String id) {
		Optional<Car> existing = repository.findById(id);
		if (!existing.isPresent()) {
			throw new ResourceNotFoundException("Car with id " + id + " doesn't exist.");
		}
		return existing.get();
	}

	@Transactional
	public Car create(Car car) {
		Optional<Car> existing = repository.findByModel(car.getModel());
		if (existing.isPresent()) {
			throw new BadRequestException("Create with Model " + car.getModel() + " already exists.");
		}
		return repository.save(car);
	}

	@Transactional
	public Car update(String id, Car car) {
		Optional<Car> existing = repository.findById(id);
		if (!existing.isPresent()) {
			throw new ResourceNotFoundException("Car with id " + id + " doesn't exist.");
		}
		return repository.save(car);
	}

	@Transactional
	public void delete(String id) {
		Optional<Car> existing = repository.findById(id);
		if (!existing.isPresent()) {
			throw new ResourceNotFoundException("Car with id " + id + " doesn't exist.");
		}
		repository.delete(existing.get());
	}
}
