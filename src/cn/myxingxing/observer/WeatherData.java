package cn.myxingxing.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList obervers;	//记录观察者
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		obervers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		obervers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = obervers.indexOf(o);
		if (i >= 0) {
			obervers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for(int i = 0; i < obervers.size(); i++){
			Observer observer = (Observer)obervers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
