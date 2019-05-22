public class DisplayHUD2 implements Observer, DisplayElement {

    private Subject weatherData;
    private float temp, pressure;

    public DisplayHUD2(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);

    }


    @Override
    public void display() {
        System.out.println("HUD2| temp:"+temp+", pressure: "+pressure);

    }

    public void unSubscribe(){
        weatherData.unregisterObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.pressure=pressure;
        display();
    }
}
