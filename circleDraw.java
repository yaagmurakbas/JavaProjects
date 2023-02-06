import java.util.Random;

class circleDraw {
	private double x; 
	private double y; 
	private double r; 
	
	public MyCircle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public double distance (MyCircle p) {
		double output = Math.sqrt(((x-p.getX())*(x-p.getX()))+((y-p.getY())*(y-p.getY())));
		return output;
		}
	
	public double getX () {
		return x;
		}
	
	public double getY () {
		return y;
		}
	
	public double getR () {
		return r;
		}
	public void setAll (double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
		}
	
	public void setX (double x) {
		this.x = x;
		}
	
	public void setY (double y) {
		this.y = y;
		}
	
	public void setR (double r) {
		this.r = r;
		}
	
	public void draw () {
		StdDraw.filledCircle(x, y, r);
		}
	}

public class JavaLab2Task {
	
	public static void main (String[] args) {
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setScale(0, 1);
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		
		Random random = new Random();
		MyCircle[] circles = new MyCircle[310];
		
		double r;
		int pos = 0;
		while (pos<circles.length) {
			r = (0.01 + (0.2 - 0.01)*random.nextDouble());
			circles[pos]= new MyCircle(random.nextDouble(), random.nextDouble(), r);
			
			while (((circles[pos].getX()+r>1)||(circles[pos].getX()-r<0))||((circles[pos].getY()+r>1)||(circles[pos].getY()-r<0))) {
				r = (0.01 + (0.2 - 0.01)*random.nextDouble());
				circles[pos].setAll(random.nextDouble(), random.nextDouble(), r);
			}
			
			for (int i=1;pos-i>=0;i++) {
				if ((circles[pos].distance(circles[pos-i])<(circles[pos].getR()+circles[pos-i].getR()))) {
					r = (0.01 + (0.2 - 0.01)*random.nextDouble());
					circles[pos].setAll(random.nextDouble(), random.nextDouble(), r);
					while (((circles[pos].getX()+r>1)||(circles[pos].getX()-r<0))||((circles[pos].getY()+r>1)||(circles[pos].getY()-r<0))) {
						r = (0.01 + (0.2 - 0.01)*random.nextDouble());
						circles[pos].setAll(random.nextDouble(), random.nextDouble(), r);
						}
					i=0;
				}
			}
			
			circles[pos].draw();
			pos++;
			
		}
	}
}