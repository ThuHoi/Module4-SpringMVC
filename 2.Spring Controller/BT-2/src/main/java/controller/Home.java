package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
    @GetMapping("/home")
    public ModelAndView showHome(ModelAndView modelAndView) {
        modelAndView = new ModelAndView("home");
        return modelAndView;
    }


    @PostMapping("/calculator")
    public ModelAndView save(ModelAndView modelAndView,
                             @RequestParam String calculator,
                             @RequestParam("num1") int num1,
                             @RequestParam("num2") int num2
    ) {
        modelAndView = new ModelAndView("home");
        double result = 0;
        switch (calculator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        modelAndView.addObject("num1", num1);
        modelAndView.addObject("num2", num2);
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}