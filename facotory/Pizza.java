abstract class Pizza
{
	abstract void prepare();
	String name;
	String sauce;
	String dough;

	public void bake()
	{
		System.out.println("Pizza Getting Baked !!!");
	}
	public void cut()
	{
		System.out.println("Pizza Cut into Pieces !!!");
	}
	public void pack()
	{
		System.out.println("Pizza Packed!!!");
	}
}
