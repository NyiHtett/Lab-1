/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab One
Lab due date: 9/22/2022
Submission Date: 9/13/2022
Description: Rectangle operation class
*/
public class Rectangle {    //operation class
	private double width;   //width
	private double height;  //height
	Rectangle(double wid, double h){  //constructor with two parameters
		width = wid;   //assign width
		height = h;    //assign height
	}  //end of constructor
	public void setWidth(double wid) {  //method to set width
		width = wid;   //assign width
	} //end of method
	public void setHeight(double h) {  //method to set height
		height = h;    //assign height
	} //end of method
	public double getWidth() {  //method to get value of width
		return width;  //return the width value
	} //end of method
	public double getHeight() {  //method to get value of height
		return height;  //return the height value 
	} //end of method
	public double commputeCircumference() { //method to calculate circumference of the rectangle
		return 2*(width+height);  //return the circumference values
	} //end of method
	public double computeArea() {  //method to calculate area of the rectangle
		return width*height;       //return the area value
	} //end of method
}  //end of the operation class
