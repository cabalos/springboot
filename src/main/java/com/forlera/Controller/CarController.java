package com.forlera.Controller;

import com.forlera.Entity.Car;
import com.forlera.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

/**
 * Created by OLEX on 01.11.2017.
 */

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Car> getAllCars(){
        return carService.getAllCars();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public ResponseEntity getCarById(@PathVariable("id") int id ){
        Car myCar= carService.getCarById(id);
        return new ResponseEntity("price"+" : "+myCar.getPrice()+" "+"contact"+" : "+myCar.getContact(),HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void removeCarById(@PathVariable("id") int id){
        carService.removeCarById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity insertCar(@RequestBody Map<String,String> newMap,
                                    @RequestParam("contact") String contact,
                                    @RequestParam("price") int price) {

        String name = newMap.get("name").toString();
        int year = Integer.parseInt(newMap.get("year"));
        int id = Integer.parseInt(newMap.get("id").toString());
        carService.insertCar(new Car(name,year,id,contact,price));

        return new ResponseEntity("carId"+" : "+id,HttpStatus.OK);
    }
}

