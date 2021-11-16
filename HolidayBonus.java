/*
 * Class: CMSC203 CRN: 22507
 * Assignment 5
 * Instructor: Farnaz Eivaz
 * 
 * Description:  A utility class that will calculate holiday bonuses
    
 * Due: 11/4/2021
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   
   Programmer Abraham Lamidi
*/
public class HolidayBonus {
	
	public HolidayBonus(){
	}
	
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, 
			double other) {
				
		double[] bonus = new double[data.length];
		for (int i = 0; i < bonus.length; i++){
			for (int j = 0; j < data[i].length; j++){
				if (data[i][j] >= 0) {
					if (data[i][j] == 
							TwoDimRaggedArrayUtility.getHighestInColumn(data, j)){
						bonus[i] += high;
					} else if (data[i][j] == 
							TwoDimRaggedArrayUtility.getLowestInColumn(data, j)){
						bonus[i] += low;
					} else{
						bonus[i] += other;
					}
				}
			}
		}
		return bonus;
		
	}
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, 
			double other) {
				
	    double[] bonus = calculateHolidayBonus(data, high, low, other);
	    double total = 0;
	    
	    for (int i = 0; i < bonus.length; i++){
			total += bonus[i];
		}
	    
	    return total;
		
		
	}

}

//Abraham Lamidi wrote this code.
