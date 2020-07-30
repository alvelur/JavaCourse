package chapter8;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PasswordValidator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your username: ");
        String user = scanner.next();
        System.out.println("Enter your current password: ");
        String oldPassword = scanner.next();

        System.out.println("Enter your new password: ");
        String newPassword = scanner.next();

        newPassword = compareValues(newPassword,user,oldPassword);
        newPassword = countChar(newPassword);
        newPassword = containsSpecAndUp(newPassword);

        System.out.println("Your new password has been setted succesfully" + newPassword);

    }
    public static String compareValues(String text, String user, String oldPassword){

        while(text.contains(user)){
            System.out.println("Introduce a new password, it must be different from your username ");
            text = scanner.next();
        }
        while(text.equals(oldPassword)){
            System.out.println("Introduce a new password, it must be different from your old password ");
            text = scanner.next();
        }
        return text;
    }
    public static String countChar(String text){

        int numberOfChars =  text.length();

        while(numberOfChars < 8){
            System.out.println("Introduce a new password, it must have at least 8 characters");
            text = scanner.next();
        }
        return text;
    }
    public static String containsSpecAndUp(String text){

        while (text.equals(text.toLowerCase())){
            System.out.println("Introduce a new password, it must have at least 1 UpperCase character");
            text = scanner.next();
        }
        while (text.matches("[a-zA-Z0-9 ]*")) {
            System.out.println("Introduce a new password, it must have at least 1 special character");
            text = scanner.next();
        }
        return text;
    }

    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0 ;i--){
            System.out.print(text.charAt(i));
        }
    }
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if(i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
