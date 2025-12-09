package edu.VoltCast.weather_microservice;
import edu.VoltCast.weather_microservice.model.WeatherOverviewDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/overview")
    public WeatherOverviewDTO getShortWeatherDescription(
            @RequestParam double lat,
            @RequestParam double lon
    ) {
        return weatherService.getWeatherOverview(lat, lon);
    }
}