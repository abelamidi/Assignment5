/*
 * Class: CMSC203 CRN: 22507
 * Assignment 5
 * Instructor: Farnaz Eivaz
 * 
 * Description:  
    
 * Due: 11/4/2021
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   
   Programmer Abraham Lamidi
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	public static double[][] readFile(File file) throws FileNotFoundException  {
	    Scanner sc = new Scanner(file);
	    int indexRow = 0;
	    String[][] temp = new String[10][]; 
	    
	    // read file and pass numbers to temp array as Strings
	    while (sc.hasNextLine()) {
	     String[] row = sc.nextLine().split(" ");
	     temp[indexRow] = new String[row.length];
	     for (int i = 0;i < row.length;i++) {
	       temp[indexRow][i]=row[i];   
	     }
	     indexRow++;
	    }
	   // Create double data array and parse numbers as doubles
	    double[][]data = new double[indexRow][];
	    for (int i = 0; i < indexRow;i++) {
	      data[i]= new double[temp[i].length];
	      for (int j = 0;j < temp[i].length;j++) {
	          System.out.print(temp[i][j] + " ");
	          data[i][j] = Double.parseDouble(temp[i][j]);
	      }
	      System.out.println();
	    }
	    
	    sc.close();
	    return data;
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
	    
		PrintWriter output = new PrintWriter(outputFile);
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0;i < data.length;i++) {
	      for (int j = 0;j < data[i].length;j++) {
	        sb.append(data[i][j]+ " ");
	      }
	      sb.append("\n");
	    }
	    output.print(sb.toString());
	    output.close();
	}

	public static double getTotal(double[][] data) {
		   
		double total = 0;
		
		for (int i = 0;i < data.length;i++) { 
		    for (int j = 0;j < data[i].length;j++) {
		        total += data[i][j];
		    }
		}
		    
		    return total;
	}
	
	public static double getAverage(double[][] data) {
		    
		int numberOFElements = 0;
		double total = 0;
		    
		for (int i = 0;i < data.length;i++) {
			numberOFElements += data[i].length; 
		    for (int j = 0;j < data[i].length;j++) {
		        total += data[i][j];
		     }
	    }
		    
		return total / numberOFElements;
    }
	
	public static double getRowTotal(double[][] data, int row) {
	    
		double rowTotal = 0;
		
	    for (int i = 0;i < data[row].length;i++) {
	    	rowTotal += data[row][i];
	    }
	    
	    return rowTotal;
    }
	
	public static double getColumnTotal(double[][] data, int col) {
		    
		double columnTotal = 0;
		for (int i = 0;i < data.length;i++) {
		    if (col >= data[i].length) {
		        continue;
		    }
		    
		    columnTotal += data[i][col];
		}
		
		    return columnTotal;
    }

	public static double getHighestInRow(double[][] data, int row) {
	    
		double highestInRow = -999999;
	    for (int i = 0;i < data[row].length;i++) {
	        if (data[row][i] > highestInRow) {
	    	  highestInRow = data[row][i];
	        }
	    }
	    
	    return highestInRow;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		    
		double high = -999999;
		int index = -1;
		    
		for (int i = 0;i < data[row].length;i++) {
		     if (data[row][i] > high) {
		        high = data[row][i];
		        index = i;
		      }
		}
		    
		return index;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
	    
		double low = 999999;
	    
		for (int i = 0;i < data[row].length;i++) {
	        if (data[row][i] < low) {
	           low = data[row][i];
	        }
	    }
		
	    return low;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		    
		 double low = 999999;
		 int index = -1;
		    
		 for (int i = 0;i < data[row].length;i++) {
		      if (data[row][i] < low) {
		        low = data[row][i];
		        index = i;
		      }
		 }
		 
		 return index;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
		    double high = -999999;
		    for (int i = 0;i < data.length;i++) {
		      if (col >= data[i].length) {
		        continue;
		      }
		      if (data[i][col] > high) {
		        high = data[i][col];
		      }
		    }
		    return high;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col) {
	    
		double high = -999999;
	    int index = -1;
	    
	    for (int i = 0;i < data.length;i++) {
	        if (col >= data[i].length) {
	           continue;
	        }
	        if (data[i][col] > high ) {
	           high = data[i][col];
	           index = i;
	        }
	    }
	    
	    return index;
    }
	
	public static double getLowestInColumn(double[][] data, int col) {
		    
		double low = 999999;
		    
		for (int i = 0;i < data.length;i++) {
		     if (col >= data[i].length) {
		        continue;
		     }
		     if (data[i][col] < low) {
		        low = data[i][col];
		     }
		}
		    
		return low;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
		    
		double low = 999999;
		int index = -1;
		    
		for (int i = 0;i < data.length;i++) {
		      if (col >= data[i].length) {
		         continue;
		      }
		      if (data[i][col] < low ) {
		         low = data[i][col];
		         index = i;
		      }
		}
		    
		return index;
    }
	
	public static double getHighestInArray(double[][] data) {
	    
		double high = -999999;
	    
		for (int i = 0;i < data.length;i++) { 
	        for (int j = 0;j < data[i].length;j++) {
	             if (data[i][j] > high) {
	                high = data[i][j];
	             }
	        }
	    }
		
	    return high;
	}
	
	public static double getLowestInArray(double[][] data) {
		    
		double low = 999999;
		    
		for (int i = 0;i < data.length;i++) { 
		     for (int j = 0;j < data[i].length;j++) {
		          if (data[i][j] < low) {
		             low = data[i][j];
		          }
		     }
		}
		    
		return low;
    }
	
}

//Abraham Lamidi wrote this code.
