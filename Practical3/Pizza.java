abstract class Pizza {

	public Dough d;
	public Sauce s;
	public Cheese c;

	abstract void prepare();

	public void bake(){
		System.out.println("Pizza is baked");
	}

	public void cut(){
		System.out.println("cutting the pizza");
	}

	public void pack(){

		System.out.println("packing the pizza");
	}

}




