public class studentGradesArray{
	public static void main(String[] args){
		int[][] courseArray = new int[30][7];
		for(int x = 0; x<courseArray.length; x++){
			for(int y = 0; y < courseArray[x].length; y++){
				courseArray[x][y]= (int) (Math.random()*101);
			}	
		}
	    studentAvarage(courseArray);
	    System.out.println();
	    courseAvarage(courseArray);
	}
	public static void courseAvarage(int[][] array){
		int courseCount = array[0].length;
		int studentCount = array.length;
		for(int x = 0; x < courseCount ; x++){
			double sumCourse = 0;
			for(int y = 0; y < array.length; y++){
				sumCourse += array[y][x];
				}	
			double courseAvarage = sumCourse/studentCount;
			System.out.println(x + "th coursees average: " + courseAvarage);
			}
	}
	
	public static void studentAvarage(int[][] array){
		double studentSum = 0;
		int courseCount = array[0].length;
		for(int x = 0; x<array.length; x++){
			studentSum  = 0;
			for(int y = 0; y <array[x].length; y++){
				studentSum+=array[x][y];
				}
			double studentAverage = studentSum/courseCount;
			System.out.println(x+ "th stutdent grades average is: " + studentAverage);
			}
	}
}