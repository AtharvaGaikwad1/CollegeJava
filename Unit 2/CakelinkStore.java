abstract class CakelinkStore{

	Cake c;

	void orderCake(String name){

		c = createCake(name);
		c.bake();
		c.cut();
		c.pack();
		c.prepare();
	} 

	abstract Cake createCake(String name);


}