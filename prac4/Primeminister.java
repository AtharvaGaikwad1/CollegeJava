class Primeminister{

	static Primeminister pm;

	private Primeminister(){

		System.out.println("im prime minister of the country");
	}

	void setRules(){

		System.out.println(
			"i am setting rules acc my will");

	}

	void givePermission(){

		System.out.println("ive permisiion to ruin the nation");

	}

	static Primeminister primeMudi(){


		if (pm == null) {
			
			pm = new Primeminister();
			return pm;
		}

		return pm;
	}

	

	

}

// static variables do not belong to any class but are accessible everywhere
// Here we run into errors if the constructor is private
// for singleton class - make a static variable;
