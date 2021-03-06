package weather;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.serMeasurements(80, 65, 30.4f);
		weatherData.serMeasurements(82, 70, 29.2f);
		weatherData.serMeasurements(78, 90, 29.2f);
	}

}
