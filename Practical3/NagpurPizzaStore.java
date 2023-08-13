class NagpurPizzaStore extends PizzaStore{

	Pizza createPizza(String name){


		Pizza p = null;
		PizzaIngridientFactory pif = new NagpurPizzaIngridientFactory();

		if (name.equalsIgnoreCase("Cheese")){
			p = new CheesePizza(pif);
		}
		if (name.equalsIgnoreCase("Corn")){
			p = new CornPizza(pif);
		}

		return(p) ;


	}


}