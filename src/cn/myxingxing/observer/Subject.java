package cn.myxingxing.observer;

public interface Subject {
	
	public void registerObserver(Observer o);//注册和取消注册两个方法都需要一个观察者作为变量,该观察者使用来注册或删除的
	
	public void removeObserver(Observer o);
	
	public void notifyObserver();//当主题状态改变时,这个方法会被调用,以通知所有的观察者
}
