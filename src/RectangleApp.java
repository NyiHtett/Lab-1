/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab One
Lab due date: 9/22/2022
Submission Date: 9/13/2022
Description: The driver code to run Rectangle, create its object, 
call its methods to accept input, assign and calculate the circumference and area of the rectangle.
*/
import java.util.Scanner;           //import the Scanner class
public class RectangleApp {			//Driver class
	public static void main(String[] args) {	//main method
		Scanner key = new Scanner(System.in);   //create a Scanner object
		Rectangle rect;    //declare rect as a Rectangle variable                    
		double width;      //declare a variable to hold width
		double height;     //declare a variable to hold height
		System.out.println("What is the width of the rectangle?");  //asking for width
		width = key.nextDouble();                                   //read the double type input and assign to width variable
		System.out.println("What is the height of the rectangle?"); //asking for height
		height = key.nextDouble();                                  //read the double type input and assign to height variable
		rect = new Rectangle(width,height);                         //create a Rectangle object and pass the width and height to its constructor
		System.out.println("the width of the rectangle: "+rect.getWidth());     //call method to display the width
		System.out.println("the height of the rectangle: "+rect.getHeight());   //call method to display the height
		System.out.println("the circumference: "+rect.commputeCircumference()); //call method to display the circumference
		System.out.println("the area: "+rect.computeArea());                    //call method to display the area
	}  //end of main()
}  // end of the driver class
