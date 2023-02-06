
public class CircleClass {
	public static void main(String[] args){
		Circle circle1 = new Circle();
		circle1.setCircle(5);
		circle1.getAreaCircle();
		circle1.getPerimeterCircle();
		
		Circle circle2 = new Circle();
		circle2.setCircle(9);
		circle2.getAreaCircle();
		circle2.getPerimeterCircle();
	}

}

class Circle{
	// BU SEKILDE DED YAPABILIRSIN 
	//TANIMLAMAK ICIN EXTRADAN BIR CLASS ACABILIRSIN 
	
	double Radius;
	
	public void setCircle(double radius){
		this.Radius  = radius;
	}
	
	public void getAreaCircle(){  // VEYA DIREK double getAreaCircle() yazicaksin
		double result = Math.PI * Math.pow(this.Radius, 2);
		System.out.println("area of the circle " + result);
	}
	
	public void getPerimeterCircle(){  // VEYA DIREK double getPerimeterCircl() yazicaksin
		double result = Math.PI * 2 * this.Radius;
		System.out.println("perimeter of the circle " + result);
	}
}
