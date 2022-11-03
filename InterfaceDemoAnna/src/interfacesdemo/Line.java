package interfacesdemo;

public class Line implements Drawable{

	public Line() {
		super();
	}

	@Override
	public void drawingColour() {
		System.out.println("Drawing line in colour <colour>");
		
	}

	@Override
	public void thickness() {
		System.out.println("Drawing line in thickness <thickness>");
		
	}
	
}
