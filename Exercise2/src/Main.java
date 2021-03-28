
public class Main {

	public static void main(String[] args) {
		
		Motocycle a = new Motocycle();
		Yamaha b = new Yamaha();
		Honda c = new Honda();
		
		System.out.println(a.Class);
		System.out.println(a.Attribute);
		a.behavior();
		
		System.out.println("");
		System.out.println(a.brand + b.brand);
		System.out.println(a.colour + b.colour); 
		System.out.println(a.type + b.type);
		
		System.out.println("");
		System.out.println(a.brand + c.brand);
		System.out.println(a.colour + c.colour);
		System.out.println(a.type + c.type);
		
	

	}

}
