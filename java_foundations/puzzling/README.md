Puzzling
After you passed the first challenge, the company decided they wanted to give you a few puzzles to solve that apply to features the company uses in their client-side operations. As they put it: "The first challenge was just to check your familiarity with the language, now we want to see your problem-solving skills."

For this assignment, we are going to introduce a new class: Random. We are going to use it to create some chaos, okay, maybe not chaos, but to generate random values. 

Objectives:
Implement different algorithms in java.
Practice Array and ArrayList.
Practice loops.
Learn and use the Random class.
Call methods from within other methods in the same class.

Assignment:
Work on the puzzles below. Be sure to read through all the problem descriptions first before tackling them one-by-one. Make your code as clean as possible. The class name should be PuzzleJava; you will need to create methods for each of the tasks below and test them in the main method in a separate test file.

Tip: To get a random integer, you can use the nextInt method of the Random class. Random Class documentation. Here's some example code for using the Random library to get you started.

// You will need to import the Random library from java.util
import java.util.Random;
    
// To use methods from the Random library you will need to create an instance of Random
Random randMachine = new Random();
// From there you can use any of the methods listed in the documentation. For example:
randMachine.setSeed(35679); // <--- you won't need to use this method.
copy
getTenRolls

Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 

getRandomLetter

Write a method that will:

Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
Generate a random index between 0-25, and use it to pull a random letter out of the array.
Return the random letter.
generatePassword

Write a method that uses the previous method to create a random string of eight characters, and return that string.

getNewPasswordSet

Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.

SENSEI BONUS:
shuffleArray

Write a method that takes an array and mixes up all the values in a pseudo-random way. Hint: use random indexes within the array, and swap values repeatedly. 

Here's a test file to get you started. But you will need to created your own PuzzleJava class file.

CodeExample.java
import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	//..
		// Write your other test cases here.
		//..
	}
}
Implement the getTenRolls method

Implement the getRandomLetter method

Implement the generatePassword method

Implement the getNewPasswordSet method

SENSEI BONUS: Implement the shuffle method