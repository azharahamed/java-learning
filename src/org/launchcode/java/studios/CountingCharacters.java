package org.launchcode.java.studios;

import java.util.HashMap;
//import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args){
        String inputstring = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        String charsInStringUpper = inputstring.toUpperCase();
//        System.out.println(charsInStringUpper);
        char[] charsInString = charsInStringUpper.toCharArray();
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();

        for(char i:charsInString){
            if(m.containsKey(i)){
                m.put(i, m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }

        for(Character key:m.keySet()){
            System.out.println(key+": "+m.get(key));
        }
    }
}
