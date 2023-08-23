package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main (String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        String[] wordarray = sentence.split(" ");
        ArrayList<String> wordarraylist = new ArrayList<>();
        for(String word : wordarray){
            wordarraylist.add(word);
        }
        System.out.println(wordarraylist);
        word(wordarraylist);
        String[] words = sentence.split(" ");
        for (String word : words){
            System.out.println(word);
        }
        String[] gibberish = sentence.split("d");
        for (String gibb : gibberish){
            System.out.println(gibb);
        }
        ArrayList<Integer> arraylistnumbers = new ArrayList<>();
        arraylistnumbers.add(3);
        arraylistnumbers.add(5);
        arraylistnumbers.add(2);
        arraylistnumbers.add(9);
        arraylistnumbers.add(8);
        int sumofnumbers = sum(arraylistnumbers);
        System.out.println("Sum of the even numbers in array list is "+sumofnumbers);
        ArrayList<String> wordstoprint = new ArrayList<>();
        wordstoprint.add("hello");
        wordstoprint.add("world");
        wordstoprint.add("launchcode");
        wordstoprint.add("coder");
        word(wordstoprint);
    }
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void word(ArrayList<String> wordsentence){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the string to be printed");
        int lengthofword= input.nextInt();
        for(String word : wordsentence ){
            if(word.length()==lengthofword){
                System.out.println(word);
            }
        }
    }
}