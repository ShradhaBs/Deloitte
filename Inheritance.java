package thirdday;

abstract class Animal {
public abstract void eat() ;
public abstract void sleep();
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eats");
	}
	public void sleep() {
		System.out.println("Dog sleeps");
	}
	
}
class Cat extends Animal{
	public void eat() {
		System.out.println("Cat eats");
	}
	public void sleep() {
		System.out.println("Cat sleeps");
	}
}
public class Inheritance{
	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
	}
}
