class PizzaDemo{
	public static void main(String args[]){
		PizzaStore p1;
		p1 = new NagpurPizzaStore();
		p1.orderPizza("Nagpur Vaggie Pizza");
		System.out.println();
		p1.orderPizza("Nagpur Cheese Pizza");
		System.out.println();
		p1.orderPizza("Nagpur Corn Pizza");
	}
}


