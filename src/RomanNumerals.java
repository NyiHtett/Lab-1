/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab One
Lab due date: 9/22/2022
Submission Date: 9/13/2022
Description: RomanNumberals operation class
*/
public class RomanNumerals{  //operation class
	private int num;         //declare num to hold numbers    
	private String roman;    //declare roman to hold converted roman numerals
	
	public void setNumber(int number) {  //method to set the number
		num = number;  //assign number
	} //end of method
	public void convertNum() {  //method to convert number to roman numberal
		switch(num) {    //start switch statement
		case 1:          //if num equals 1
			roman = "I"; //store "I" to roman
			break;       //stop 
		
		case 2: 			//if num equals 2
			roman = "II";   //store "II" to roman
			break; 			//stop
			
		case 3:				//if num equals 3
			roman = "III";  //store "III" to roman
			break;          //stop
			
		case 4:             //if num equals 4
			roman = "IV";   //store "IV" to roman
			break;          //stop
			
		case 5:             //if num equals 5
			roman = "V";    //store "V" to roman
			break;          //stop
			
		case 6:				//if num equals 6
			roman = "VI";   //store "VI" to roman
			break;			//stop
			
		case 7:				//if num equals 7
			roman = "VII";  //store "VII" to roman
			break;			//stop
			
		case 8:             //if num equals 8
			roman = "VIII"; //store "VIII" to roman
			break;          //stop
			
		case 9:             //if num equals 9
			roman = "IX";   //store "IX" to roman
			break;  		//stop
			
		case 10:			//if num equals 10
			roman = "X";    //store "X" to roman
			break;			//stop

		// do not even have to include default anymore as we will filter at the user input stage of driver class
			
		default:			 //default 
			roman = "error"; //if num is outside the range of 1 through 10, assign error to roman
		    break;           //stop
		}
	}
	public int getNumber() { //method to get number
		return num;    //return number value
	}  //end of method
	public String displayResult() { //method to get converted version
		return roman;   //return roman numeral
	}  //end of method
	
}  // end of operation class
