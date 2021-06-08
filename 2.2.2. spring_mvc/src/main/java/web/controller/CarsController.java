package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarsController {

    public static List<Car> getCarList(int count) {
        Car car1 = new Car("Audi", 100, "White");
        Car car2 = new Car("BMW", 3, "Black");
        Car car3 = new Car("Ford", 12, "Green");
        Car car4 = new Car("Ferrari", 666, "Orange");
        Car car5 = new Car("Dodge", 55, "Grey");
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(carList.get(i));
        }
        return result;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count") int count,
                          Model model) {
        List<Car> carList = getCarList(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
