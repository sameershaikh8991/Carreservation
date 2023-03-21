package com.project.services;

import com.project.models.Car;
import com.project.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public Car saveCar(Car car) {
        return  carRepository.save(car);
    }

}
