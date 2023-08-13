class CornPizza extends Pizza{

	public PizzaIngridientFactory pif;

	CornPizza(PizzaIngridientFactory pif){
		this.pif=pif;
	}

	void prepare(){
		d =pif.createDough();
		// s =pif.createSauce();
		c =pif.createCheese();
	}
}