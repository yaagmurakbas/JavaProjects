public class bouncingBallTest {
	public static void main(String[] args){
		StdDraw.setCanvasSize(200,200);
		StdDraw.setXscale(-1.0,1.0);
		StdDraw.setYscale(-1.0,1.0);
		StdDraw.enableDoubleBuffering();
		double x = 0.007, y = 0.086;
		double velocityX = 0.30, velocityY = 0.2;
		double radiusBall = 0.20;
		while(true){
			if(Math.abs(x+velocityX) > (1.0 - radiusBall)){
				velocityX = -velocityX;
			}
			if(Math.abs(y+velocityY) > (1.0 - radiusBall)){
				velocityY = -velocityY;	
			}
			
			x = x + velocityX;
			y = y + velocityY;
			
			StdDraw.clear(StdDraw.MAGENTA);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledCircle(x, y, radiusBall);
			
			StdDraw.show();
			StdDraw.pause(10);	
		}	
	}
}
