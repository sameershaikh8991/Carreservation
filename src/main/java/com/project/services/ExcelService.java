package com.project.services;


import com.project.helper.ExcelHelper;
import com.project.models.Car;
import com.project.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public class ExcelService {

    @Autowired
    CarRepository repository;

    public ByteArrayInputStream load() {
        List<Car> carList = repository.findAll();
        ByteArrayInputStream in = ExcelHelper.tutorialsToExcel(carList);
        return in;
    }


}
