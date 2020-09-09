package hw2;

import java.util.Scanner;  // Import the Scanner class

public class Homeworktime {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter sentence:");
    String count = myObj.nextLine();  // Read user input
    myObj.close();
    String s = count;
	String vowels = "aeiouAEIOU";
	int burg = 0;
	
	for(int bruh = 0; bruh < s.length(); bruh++)
	{
		if(vowels.indexOf(s.charAt(bruh)) != -1)
		{
			burg++;
		}
	}
    System.out.println("number of vowels is: " + burg);  // Output user input
  }
}
