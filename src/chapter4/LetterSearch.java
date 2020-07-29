package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        boolean letterfound = false;

        for (int i = 0; i < text.length() ; i++) {

            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterfound = true;
                break;
            }
        }
        if(letterfound){
            System.out.println("This text contains an A");
        }else {
            System.out.println("The text does not contain the letter A");
        }
    }
}
