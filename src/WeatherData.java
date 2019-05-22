import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature,
            humidity,
            pressure;


    public WeatherData(){
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        int i= observers.indexOf(observer);

        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size();i++){
            Observer observer=(Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
