package cn.myxingxing.observer;

public interface Observer {
	/**
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 * 所有的观察者都必须实现update方法 以实现观察者接口
	 */
	public void update(float temp,float humidity,float pressure);
}
