public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData= new WeatherData();

        DisplayHUD1 displayHUD1= new DisplayHUD1(weatherData);
        DisplayHUD2 displayHUD2= new DisplayHUD2(weatherData);


        weatherData.setMeasurement(80,65,33);
        weatherData.setMeasurement(33,44,42);
        weatherData.setMeasurement(33,43,11);

        displayHUD2.unSubscribe();
        weatherData.setMeasurement(33,44,42);

    }

}
