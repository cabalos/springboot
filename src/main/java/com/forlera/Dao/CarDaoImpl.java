package com.forlera.Dao;

import com.forlera.Entity.Car;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by OLEX on 01.11.2017.
 */

@Repository
public class CarDaoImpl implements CarDao {

    private static Map<Integer,Car> cars;

    static {
        cars = new HashMap<Integer,Car>(){
        };
    }
        @Override
        public Collection<Car> getAllCars(){
            return this.cars.values();
        }

        @Override
        public  Car getCarById(int id){
            return this.cars.get(id);
        }

        @Override
        public void removeCarById(int id){
            this.cars.remove(id);
        }

        @Override
        public void updateCar(Car car){
            Car my = cars.get(car.getId());
            my.setName(car.getName());
            my.setYear(car.getYear());
            cars.put(car.getId(),car);
        }

    @Override
    public void insertCar(Car car) {
            this.cars.put(car.getId(),car);
    }
}
