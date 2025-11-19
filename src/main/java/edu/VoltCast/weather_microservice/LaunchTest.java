package edu.VoltCast.weather_microservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaunchTest {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring!";
    }
}