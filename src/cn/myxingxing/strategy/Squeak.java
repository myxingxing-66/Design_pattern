package cn.myxingxing.strategy;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
