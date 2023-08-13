class WardhaIngridientFactory implements PizzaIngridientFactory{

	public Dough createDough(){
		return new ThinDough();
	}

	public Sauce createSause(){
		return new TomatoSauce();
	}

	public Cheese createCheese(){
		return new Mozorella();
	}
}