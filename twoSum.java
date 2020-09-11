import java.util.*;

class twoSum 
{

    //Attempts to calculate and find solution
    private static int[] TwoSum (int[] num, int sum) 
    {
        for (int i = 0; i < num.length; i++) //loops through array and compares each number with all other indices to calculate the sum
        {
            for (int j = i + 1; j < num.length; j++) 
            {
                if (num[i] + num[j] == sum && num[i] != num[j]) //if the values of 2 indices are unique and equal the sum, then the solution was found
                {
                    return new int[] { i, j }; 	//if the sum was found, a new array is created and the indices of the solution is returned
                    							//note array length here is 2
                }
            }
        }
        return new int[] {-1}; //if no solution is found, -1 gets returned. Note array length here is 1
    }


    public static void main(String[] args) 
    {
    	System.out.println("How many digits would you like to enter?"); //user enters how large they want the array to be
        Scanner scan = new Scanner(System.in);
        int arrLength = scan.nextInt();
        
        int[] nums = new int[arrLength]; //creates new variable with length of array

        //user enters each digit for the array
        System.out.println("Enter your " + arrLength + " numbers for the array");
        for(int i = 0; i < arrLength; i++) 
        {
            nums[i] = scan.nextInt();
        }

        //user enters the sum/target they would like to search for
        System.out.println("What target would you like to search for?");
        Scanner targetSum = new Scanner(System.in);
        int target = targetSum.nextInt(); //new variable 'target' initializes to what the user inputs


        int[] sumLocation = TwoSum (nums, target); //runs twoSum function to calculate sum
        if (sumLocation.length == 2) //if the length of the returned array is 2, then that means a sum was found
        {
        		System.out.println(sumLocation[0] + " " + sumLocation[1]); //prints out the array with the location of the nums to make the target sum
        } 
        else //if the array length is less then 2, then that means there was no solution
        {
            System.out.println(sumLocation[0] + "\nNo solution found!" ); 
        }
    }
}