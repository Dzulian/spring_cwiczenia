package pl.sda.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.springproject.model.Book;
import pl.sda.springproject.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Controller
public class CarController {
    List<Car> cars = new ArrayList<>();
    long index=0;
    @GetMapping("/car/add")
    public String carAddForm(){
        return "/car/car-add-form";
    }
    @PostMapping("/car/add")
    public String carAdd(@ModelAttribute Car car, Model model){
        car.setId(++index);
        cars.add(car);
        model.addAttribute("car");
        return "/car/confirm-add-car";
    }
}
