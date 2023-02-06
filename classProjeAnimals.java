public class classProjeAnimals{
	public static void main(String[] args){
		Animal animal = new Animal("animal");
		Dog dog = new Dog("pireli");
		Bird bird = new Bird("bicirik");
		Cat cat1 = new Cat("louis");
		Cat cat2 = new Cat("basik");
			
		/*animal.speak();
		dog.speak();
		bird.speak();
		cat1.speak();
		cat2.speak();*/
		
		Animal animal2 = new Bird("limon");
		animal2.speak();
	}
}

class Animal{
	private String name;
	
	public Animal(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void speak(){
		System.out.println(getName() + " are speaking right now...");
	}
	
}


class Bird extends Animal{
	public Bird(String name) {
		super(name);
	}	
	
	public void speak(){
		
		System.out.println(getName() + ": cik cik...");
	}
}


class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	
	public void speak(){
		System.out.println(getName() + ": hav hav..." );
	}
	
}


class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
	
	public void speak(){
		System.out.println(getName() + ": meow meow...");
	}	
}
