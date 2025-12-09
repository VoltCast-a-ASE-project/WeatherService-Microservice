package edu.VoltCast.weather_microservice.model;

public class WeatherOverviewDTO {
    double temperature;
    String description;

    public WeatherOverviewDTO(double temperature, String description) {
        this.temperature = temperature;
        this.description = description;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
