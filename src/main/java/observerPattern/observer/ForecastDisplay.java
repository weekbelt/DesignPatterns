package observerPattern.observer;

import observerPattern.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement{
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Improving weather on the way!");
    }
}
