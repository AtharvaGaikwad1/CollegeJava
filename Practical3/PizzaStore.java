abstract class PizzaStore
{
	Pizza p;
	void orderPizza(String name)
	{	
		p = createPizza(name);
		p.bake();
		
		p.cut();
		p.pack();
		p.prepare();
		
	}
	abstract Pizza createPizza(String name);	
}
