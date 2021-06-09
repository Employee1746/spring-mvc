package web.service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> createCarList(int carCount) {
        List<Car> createdList = new ArrayList<>();
        createdList.add(new Car("Audi", 100, "White"));
        createdList.add(new Car("BMW", 3, "Black"));
        createdList.add(new Car("Ford", 12, "Green"));
        createdList.add(new Car("Ferrari", 666, "Orange"));
        createdList.add(new Car("Dodge", 55, "Grey"));
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            result.add(createdList.get(i));
        }
        return result;
    }

    public List<Car> getCarList(String count) {
        List<Car> carList;
        CarService carService = new CarService();
        if (count == null) {
            return carService.createCarList(5);
        } else {
            int cars = Integer.parseInt(count);
            if (cars >= 5) {
                carList = carService.createCarList(5);
            } else {
                carList = carService.createCarList(cars);
            }
        }
        return carList;
    }
}
