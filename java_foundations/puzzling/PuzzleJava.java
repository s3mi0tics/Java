import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();
    
    int[] getTenRolls(){
        int[] rolls = new int[10];
        int roll = 0;
        while (roll<rolls.length){
            rolls[roll]= randMachine.nextInt(20) + 1 ;
            roll ++;
        } 
        return rolls;
    }

    char getRandomLetter(){
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char randomLetter = alphabet[randMachine.nextInt(26)];
        return randomLetter;
    }

    String generatePassword(int length){
        String randomPassword = "";
        int index = 0;
        while(index < length){
            randomPassword += getRandomLetter();
            index ++;           
        } return randomPassword;
    }

    ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> randomPasswordSet = new ArrayList<String>();
        int index = 0;
        while(index < length){
            randomPasswordSet.add(generatePassword(8));
            index ++;
        } return randomPasswordSet;
    }

    // SENSIE BONUS:
    ArrayList<Object> shuffleArray(ArrayList<Object> array){
        ArrayList<Object> shuffledArray = array;
        Object tempValue = new Object();
        int index = 0;
        while(index < shuffledArray.size()){
            tempValue = shuffledArray.get(index);
            int randomIndex = randMachine.nextInt(shuffledArray.size() - 1);
            shuffledArray.set(index, shuffledArray.get(randomIndex));
            shuffledArray.set(randomIndex, tempValue);
            index ++;
        }return shuffledArray;     

    }

}

