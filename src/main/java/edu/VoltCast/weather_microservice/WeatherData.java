package edu.VoltCast.weather_microservice;

public class WeatherData {
    private String name;
    private String description;
    private double temperature;
    private int humidity;
    private int visibility;
    private double windSpeed;
    private int cloudCover;
    private double rainInOneHour;
    private double snowInOneHour;
    private long sunrise;
    private long sunset;

    public WeatherData(String name, String description, double temperature, int humidity, int visibility, double windSpeed, int cloudCover, double rainInOneHour, double snowInOneHour, long sunrise, long sunset){
        this.name = name;
        this.description = description;
        this.temperature = temperature;
        this.humidity = humidity;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
        this.cloudCover = cloudCover;
        this.rainInOneHour = rainInOneHour;
        this.snowInOneHour = snowInOneHour;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(int cloudCover) {
        this.cloudCover = cloudCover;
    }

    public double getRainInOneHour() {
        return rainInOneHour;
    }

    public void setRainInOneHour(double rainInOneHour) {
        this.rainInOneHour = rainInOneHour;
    }

    public double getSnowInOneHour() {
        return snowInOneHour;
    }

    public void setSnowInOneHour(double snowInOneHour) {
        this.snowInOneHour = snowInOneHour;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }
}
