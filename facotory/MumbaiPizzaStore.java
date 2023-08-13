class MumbaiPizzaStore extends PizzaStore{
	Pizza createpizza(String name){
		Pizza p = null;
		if(name.equalsIgnoreCase("Mumbai Vaggie Pizza ")){
			p = new MumbaiVaggiePizza();
		}
		if(name.equalsIgnoreCase("Mumbai Cheese Pizza ")){
			p = new MumbaiCheesePizza();
		}
		if(name.equalsIgnoreCase("Mumbai Corn Pizza ")){
			p = new MumbaiCornPizza();
		}
		return (p);
	}
}
 