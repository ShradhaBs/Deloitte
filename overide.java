abstract class Animals {
	public abstract  void eat();
	public abstract void makeNoise();
	public abstract void roam();
	public void sleep() {
		System.out.println("Animal sleeps");
	}
}
abstract class Feline extends Animals {
	public void roam() {
		System.out.println("Feline roams");
	}
	
}
 class Lion extends Feline {
	public void makeNoise() {
		System.out.println("Lion roars");
	}
	public void eat() {
		System.out.println("Lion eats meat");
	}
}
 class Tiger extends Feline{
public void makeNoise() {
	System.out.println("Tiger roars");
}
public void eat() {
	System.out.println("Tiger eats meat");
}
}
class Cat extends Feline{
public void makeNoise() {
	System.out.println("Cat meows");
}
public void eat() {
	System.out.println("Cat eats milk");
}
}
class Hippo extends Animals{
	public void makeNoise() {
		System.out.println("Hippo roars");
	}
	public void eat() {
		System.out.println("Hippo eats grass");
	}
	public void roam(){
		System.out.println("hippo roams");
	}
}
abstract class Canine extends Animals {
	public void roam() {
		System.out.println("Canine roams");
	}
	
}
class Dog extends Canine {
	public void makeNoise() {
		System.out.println("Dog barks");
	}
	public void eat() {
		System.out.println("Dog eats meat");
	}
}
class Wolf extends Canine {
	public void makeNoise() {
		System.out.println("Wolf howls");
	}
	public void eat() {
		System.out.println("Wolf eats meat");
	}
}

public class overide {
	public static void main(String[] args) {
		Animals  a=new Lion();
		a.eat();
		a.roam();
		a.makeNoise();
		a.sleep();
		a=new Tiger();
		a.eat();
		a.roam();
		a.makeNoise();
		a.sleep();
		a=new Cat();
		a.eat();
		a.roam();
		a.makeNoise();
		a.sleep();
		a=new Hippo();
		a.eat();
		a.roam();
		a.makeNoise();
		a.sleep();
		a=new Dog();
		a.eat();
		a.roam();
		a.makeNoise();
		a.sleep();
		a=new Wolf();
		a.eat();
		a.roam();
		a.makeNoise();
		a.sleep();
	}

}
