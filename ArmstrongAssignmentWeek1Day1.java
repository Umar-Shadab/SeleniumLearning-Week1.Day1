package Week1.Day1;

public class ArmstrongAssignmentWeek1Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputArmstrongNumber = 153; //Input number to check armstrong  
		int calculated, original, result = 0;
		
		calculated = inputArmstrongNumber;
		
		while (calculated != 0)
        {
        	
        	
            System.out.println("Current Number is "+calculated);
            original =calculated % 10;
			System.out.println("Current Digit is "+original);
            //sum of cubes of each digits is equal to thetempNumber itself
            result = result + original*original*original;
			System.out.println("Current Result is "+result);
            calculated /= 10;
           
        }

        //check giventempNumber and digitCubeSum is equal to or not 
        if(result == inputArmstrongNumber)
            System.out.println(inputArmstrongNumber + " is an Armstrong Number");
        else
            System.out.println(inputArmstrongNumber + " is not an Armstrong Number");
		
	}
	
}