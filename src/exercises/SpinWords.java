package exercises;


import java.util.Arrays;

public class SpinWords {
    public static void main(String[] args){
        System.out.println(spinWords("This is a test"));
    }

    public static String spinWords(String Sentence){
        String stringArr[] = Sentence.split(" ");
        String reverseArr = new String();
        for(String word:stringArr){
            if(word.length() >= 5) reverseArr += new StringBuilder(word).reverse().toString() + " ";
            else reverseArr += word + " ";
        }
        return reverseArr.trim();
    }

}
