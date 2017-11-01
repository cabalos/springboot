package com.forlera.Dao;

import com.forlera.Entity.Car;

import java.util.Collection;

/**
 * Created by OLEX on 02.11.2017.
 */
public interface CarDao {
    Collection<Car> getAllCars();

    Car getCarById(int id);

    void removeCarById(int id);

    void updateCar(Car car);

    void insertCar(Car car);
}
