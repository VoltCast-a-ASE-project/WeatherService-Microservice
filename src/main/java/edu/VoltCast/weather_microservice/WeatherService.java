package edu.VoltCast.weather_microservice;

import edu.VoltCast.weather_microservice.model.CurrentWeatherDTO;
import edu.VoltCast.weather_microservice.model.WeatherOverviewDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Service
public class WeatherService {

    private final WebClient webClient;

    private final RestTemplate restTemplate = new RestTemplate();
    @Value("${weather.api.key}")
    private String apiKey;
    //private final String apiKey = "86e8357f2aa94d448ec64d15d3b04153";
    //private final String currentWeatherURL = "https://api.openweathermap.org/data/2.5/weather";
    private final String currentWeatherPath = "/weather";

    public WeatherService(WebClient webClient) {
        this.webClient = webClient;
    }

    public WeatherOverviewDTO getWeatherOverview(double lat, double lon){

        CurrentWeatherDTO currentWeatherDTO = webClient.get()
                .uri(uri -> uri
                        .path(currentWeatherPath)
                        .queryParam("lat", lat)
                        .queryParam("lon", lon)
                        .queryParam("appid", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(CurrentWeatherDTO.class)
                .block();

        WeatherData response = currentWeatherDTO.toWeatherData();
        //log.info("Current Weather Data: {}{}", response.getTemperature(), response.getDescription());
        WeatherOverviewDTO answer = new WeatherOverviewDTO(response.getTemperature(), response.getDescription());
        return answer;
    }

    public Object fetchDataFromApi(){

        String url = "https://api.openweathermap.org/data/2.5/forecast" +
                "?lat=" + "46.6103" +
                "&lon=" + "13.8558" +
                "&appid=" + apiKey;

        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }
}
