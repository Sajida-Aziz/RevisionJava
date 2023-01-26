package Revision;

import java.util.Random;

public class randomN {
	   public static int getRandomNumberForDatePicker(){
	        Random randomGenerator = new Random();
	        int low = 10;
	        int high = 99;
	        int randomInt = randomGenerator.nextInt(high-low)+ low;
	        return randomInt;
	    }

	public static void main(String[] args) {
		int r=randomN.getRandomNumberForDatePicker();
		System.out.println(r);
		
		// TODO Auto-generated method stub

	

}
}
