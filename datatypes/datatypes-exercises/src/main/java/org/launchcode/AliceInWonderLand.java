package org.launchcode;
import java.util.Scanner;
public class AliceInWonderLand {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String searchstring;
        Scanner input = new Scanner(System.in);
        System.out.println(sentence);
        System.out.println("Enter a string to search in the above text");
        searchstring = input.nextLine();
        if (sentence.toLowerCase().contains(searchstring)){
            System.out.println("String found");
            System.out.println("The string is at location :"+ sentence.indexOf(searchstring));
            System.out.println("The length of the string is :"+searchstring.length());
            String modifiedsentence = sentence.replace(searchstring," ");
            System.out.println(modifiedsentence);
        }
        else {
            System.out.println("String not found");
        }
    }
}
