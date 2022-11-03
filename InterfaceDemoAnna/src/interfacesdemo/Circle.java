package interfacesdemo;

public class Circle extends Line implements Fillable{

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fillingColour() {
		System.out.println("Filling circle in <colour>");
		
	}

	@Override
	public void size() {
		System.out.println("Creating circle of size <size>");
		
	}
}
