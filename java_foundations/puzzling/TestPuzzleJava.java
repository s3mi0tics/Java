import java.util.ArrayList;
import java.util.Random;


public class TestPuzzleJava {
    public static void main(String[] args){
        PuzzleJava puzzleTest = new PuzzleJava();
        
        // int[] testGetTenRolls = puzzleTest.getTenRolls();
        // for(int i : testGetTenRolls){ 
        // System.out.println(i);
        // }

        // char testGetRandomLetter = puzzleTest.getRandomLetter();
        // // System.out.println(testGetRandomLetter);

        // String testGeneratePassword = puzzleTest.generatePassword(8);
        // System.out.println(testGeneratePassword);

        // ArrayList<String> testGetNewPasswordSet = puzzleTest.getNewPasswordSet(8);
        // System.out.println(testGetNewPasswordSet);
        ArrayList<Object> senseiArray = new ArrayList<Object>();
        senseiArray.add(10);
        senseiArray.add("Hello");
        senseiArray.add(new ArrayList<Integer>());
        senseiArray.add(12.5);
        senseiArray.add("Me");
        ArrayList<Object> testShuffleArray = puzzleTest.shuffleArray(senseiArray);
        System.out.println(testShuffleArray);
    }
}
