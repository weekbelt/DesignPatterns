package observerPattern.observer;

import observerPattern.subject.Subject;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private ArrayList<Double> tempertures = new ArrayList<Double>();
    private double avgTemp;
    private double maxTemp;
    private double minTemp;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        tempertures.add(temperature);
        calculateAvgTemp();
        calculateMaxTemp();
        calculateMinTemp();
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemp + "/" + maxTemp + "/" + minTemp);
    }

    private void calculateAvgTemp() {
        double sum = 0;
        for (double d : tempertures) {
            sum += d;
        }

        if (tempertures.size() == 0) {
            this.avgTemp = 0.0;
        } else {
            this.avgTemp = sum / tempertures.size();
        }
    }

    private void calculateMaxTemp() {
        maxTemp = 0;
        for (double d : tempertures) {
            if (maxTemp < d) {
               maxTemp = d;
            }
        }
    }

    private void calculateMinTemp() {
        minTemp = Double.MAX_VALUE;
        for (double d : tempertures) {
            if(minTemp > d) {
                minTemp = d;
            }
        }
    }
}
