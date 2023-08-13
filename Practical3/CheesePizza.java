class CheesePizza extends Pizza{

	public PizzaIngridientFactory pif;

	CheesePizza(PizzaIngridientFactory pif){
		this.pif=pif;
	}

	void prepare(){
		d =pif.createDough();
		// s=pif.createSauce();
		c=pif.createCheese();
	}
}