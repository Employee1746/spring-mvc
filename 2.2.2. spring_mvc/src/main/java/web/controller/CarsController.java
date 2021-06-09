package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarsController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) String count,
                          Model model) {
        CarService carService = new CarService();
        List<Car> carList = carService.getCarList(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
