class NagpurPizzaIngridientFactory implements PizzaIngridientFactory{

	public Dough createDough(){
		return new ThickDough();
		System.out.println("im inside nagpur factory")
	}

	public Sauce createSause(){

		return new TomatoSauce();
		System.out.println("Im inside nagpur")

	}

	public Cheese createCheese(){
		return new Mozarella();
	}
}