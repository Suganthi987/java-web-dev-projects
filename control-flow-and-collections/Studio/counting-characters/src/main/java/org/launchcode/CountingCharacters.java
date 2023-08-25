package org.launchcode;
import java.util.Arrays;
public class CountingCharacters {
    public static void main(String[] args) {


        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";
        int[] count = new int[500];
        count[0] = 1;
        char[] charactersInString = sentence.toCharArray();
        for (int i = 0; i < charactersInString.length; i++, ++count[i]){
            for(int j= i+1; j<charactersInString.length;j++){
                if(charactersInString[i]==charactersInString[j]){
                    count[i]++;
                    System.out.println(charactersInString[i] +":"+count[i]);
                    count[j]++;
                    System.out.println(charactersInString[i]+":"+count[j]);
                }
            }
        }
for(int k=0;k<charactersInString.length;k++){
    System.out.println(charactersInString[k]+ ":" + count[k]);
}
    }

}
