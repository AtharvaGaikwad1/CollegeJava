abstract class Animal{
	abstract void makeSound();
}


class Cat extends Animal{

	void cat(){
		System.out.println("I do meow meow");
	}

	void makeSound(){
		System.out.println("i will make sound bcs im animal");
	}
}





class TestAn{
	


	public static void main(String[] args) {

		

		Animal b;
		b = new Cat();

		b.makeSound();

	}
}