package net.munki.play.lambdas;

interface MyNumber {
	double getValue();
}

public class LambdasDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Oh no! What is a lambda anyway?!
		MyNumber myNum;
		myNum = () -> 123.45;

		System.out.println("A fixed value: " + myNum.getValue());

		myNum = () -> Math.random() * 100;

		System.out.println("A random value: " + myNum.getValue());
		System.out.println("Another random value: " + myNum.getValue());
		
	}


}
