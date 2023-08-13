abstract class Cake{


	String name ;
	String bread;
	String chocklate;

	abstract void createCake(String name);

	void bake(){

		System.out.println(" cake baked");
	}
	
	void cut(){
		System.out.println("cut");
	}

	void pack(){

		System.out.println("cake packed");

	}
}