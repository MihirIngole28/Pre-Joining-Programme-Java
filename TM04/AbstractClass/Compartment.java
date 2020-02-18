package AbstractClass;

public abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment{
	public String notice(){
		return "This is First Class compartment";
	}
}

class Ladies extends Compartment{
	public String notice(){
		return "This is Ladies compartment";
	}
}

class General extends Compartment{
	public String notice(){
		return "This is general compartment";
	}
}

class Luggage extends Compartment{
	public String notice(){
		return "This is luggage compartment";
	}
}