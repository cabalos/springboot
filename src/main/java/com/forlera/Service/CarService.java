package com.forlera.Service;

import com.forlera.Dao.CarDaoImpl;
import com.forlera.Entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by OLEX on 01.11.2017.
 */

@Service
public class CarService {

    @Autowired
    private CarDaoImpl carDaoImpl;

    public Collection<Car> getAllCars(){
        return carDaoImpl.getAllCars();
    }

    public  Car getCarById(int id){
        return carDaoImpl.getCarById(id);
    }

    public void removeCarById(int id){
        carDaoImpl.removeCarById(id);
    }

    public void updateCar(Car car){
        carDaoImpl.updateCar(car);
    }

    public void insertCar(Car car) {
        carDaoImpl.insertCar(car);
    }
}

