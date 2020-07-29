package Ejercicios;

import java.util.Random;

public class RollTheDie {


    public static void main(String[] args) {

        int finish = 20;
        int counter = 0;
        boolean stillPlaying = true;
        int currentPosition = 0;
        int positionsMising;

        for (int i = 0; i <= 5 ; i++) {

            Random random = new Random();
            int die = random.nextInt(6) + 1;
            currentPosition =  currentPosition + die;
            positionsMising = finish - currentPosition;

            if(i < 5) {

                if (currentPosition < 20) {
                    System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on space " + currentPosition +
                            " and have " + positionsMising + " more spaces to go.");
                } else if (currentPosition > 20) {
                    System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on space " + currentPosition +
                            " You passed away the finish line.");
                    break;
                } else {
                    System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on space " + currentPosition +
                            " Congrats, you win!");
                    break;
                }
            }
            else{
                System.out.println("You do not have more rolls, F");
            }
        }

    }


}
