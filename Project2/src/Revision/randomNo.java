package Revision;

import java.util.Random;

public class randomNo {

	
	

		    public static int getRandomNumberForDatePicker(){
		        Random randomGenerator = new Random();
		        int low = 10;
		        int high = 29;
		        int randomInt = randomGenerator.nextInt(high-low)+ low;
		        return randomInt;
		    }
		    
		    public static void main(String[] args) {
		    	randomNo obj=new randomNo();
		    	System.out.println(getRandomNumberForDatePicker());
		    }


		}
		// TODO Auto-generated method stub

	


