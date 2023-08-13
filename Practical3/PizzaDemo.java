class PizzaDemo{
	public static void main(String args[]) {
		

		PizzaStore ps;

		ps = new NagpurPizzaStore();
		ps.orderPizza("Corn");

		ps = new NagpurPizzaStore();
		ps.orderPizza("Cheese");

	}
}