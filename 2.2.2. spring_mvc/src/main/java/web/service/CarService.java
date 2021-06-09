package web.service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> createCarList(int requestCount) {
        List<Car> createdList = new ArrayList<>();
        createdList.add(new Car("Audi", 100, "White"));
        createdList.add(new Car("BMW", 3, "Black"));
        createdList.add(new Car("Ford", 12, "Green"));
        createdList.add(new Car("Ferrari", 666, "Orange"));
        createdList.add(new Car("Dodge", 55, "Grey"));
        List<Car> forRequestList = new ArrayList<>();
        for (int i = 0; i < requestCount; i++) {
            forRequestList.add(createdList.get(i));
        }
        return forRequestList;
    }

    public List<Car> getCarList(String count) {
        List<Car> requestList;
        CarService carService = new CarService();
        if (count == null) {
            return carService.createCarList(5);
        } else {
            int cars = Integer.parseInt(count);
            if (cars >= 5) {
                requestList = carService.createCarList(5);
            } else {
                requestList = carService.createCarList(cars);
            }
        }
        return requestList;
    }
}
