public class DisplayHUD1 implements Observer, DisplayElement {

    float humidity, temp, pressure;
    Subject weatherData;

    public DisplayHUD1(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("HUD1| temp:"+temp+", humidity: "+humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        display();
    }
}
