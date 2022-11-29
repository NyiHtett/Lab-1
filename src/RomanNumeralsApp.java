/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab One
Lab due date: 9/22/2022
Submission Date: 9/13/2022
Description: The driver code to run RomanNumerals, create its object, 
Call its methods to receive input, assign numbers from 1 to 10, and convert them to roman numerals.
*/
import java.util.Scanner;    //import the Scanner class
public class RomanNumeralsApp {  //Driver class

	public static void main(String[] args) {   //main method
		Scanner key = new Scanner(System.in);  //create a Scanner object
		RomanNumerals demo = new RomanNumerals();             //create a RomanNumerals object
		System.out.println("Write a number between 1 to 10"); //ask a number between 1 and 10
		int num = key.nextInt();                              //declare num variable and assign user input to it
		if (num<1 || num>10) {                                //if condition of num outside the range of 1 through 10
			System.out.println("error!");                     //if num is outside the range, print "error"
			return;                            //stop the program
		}		//end of if condition
		else {                                 //else statement
			demo.setNumber(num);               //call method to set the number
			demo.convertNum();                 //call method to convert num to romanNumerals
			System.out.println("the roman version of "+demo.getNumber()+" is "+demo.displayResult()); //call method to diplay num version and roman version
		}                                      //end of else condition
		

	}    //end of main()

} //end of the driver class
