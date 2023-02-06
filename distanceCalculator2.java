public class distanceCalculator2{
	public static double distanceCal(double x1, double y1, double x2, double y2){
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		return distance;
		}
	public static void main(String[] args){
		String points[] = {"x","y","z","k"};
		double pointsCoordinate[][] = {{1,-5},{9,7},{4,-8},{-5, 6}};
		double distance = 0;
		double minDistance = 1000;
		int minFirst = 0;
		int minSecond = 1;
		for(int x=0; x < points.length; x++ ){
			for(int y = x + 1; y < points.length; y++ ){
				distance = distanceCal(pointsCoordinate[x][0], pointsCoordinate[x][1], pointsCoordinate[y][0], pointsCoordinate[y][1]);
				if(minDistance > distance){
					minDistance = distance;
					minFirst = x;
					minSecond = y;
					}
				}
			}
		System.out.print("shortest distance amount between " + points[minFirst] + " " + points[minSecond] + " points: " + minDistance);
	}
}
