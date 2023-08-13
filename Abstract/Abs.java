abstract class Vehical{
	int wheels =4;
	int ok;


	void exe(){
		System.out.println("i am not abstract");

	}

	abstract void ui();
	
}


class Abs{
	public static void main(String[] args) {
		Car cr = new Car();

		cr.ui();

		
	}
}


class Car extends Vehical{
	void ui(){

		System.out.println("ab kyaa");
	}
}

