class NagpurPizzaStore extends PizzaStore{
	Pizza createPizza(String name){
		Pizza p = null;
		if(name.equalsIgnoreCase("Nagpur Vaggie Pizza")){
			p = new NagpurVaggiePizza();
		}
		if(name.equalsIgnoreCase("Nagpur Cheese Pizza")){
			p = new NagpurCheesePizza();
		}
		if(name.equalsIgnoreCase("Nagpur Corn Pizza")){
			p = new NagpurCornPizza();
		}
		return (p);
	}
}
