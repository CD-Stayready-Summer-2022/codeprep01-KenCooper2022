package com.codedifferently.problems;

import java.util.HashMap;

public class Problem01 {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        //group 2 feedback
        //what do you mean change upper case to lower case
        input = input.toLowerCase();
        letter = letter.toLowerCase();
       // char letterChar=' ';// kinda confusing instructions
        // can't make hashmap with char you meant character
        //the instructions are confusing i wasn't sure if you wanted to make a new character
        //named letterChar or make char = to letter
        //you
        char[]letterAsCharacter =letter.toCharArray();
        char letterChar = letterAsCharacter[0];
        HashMap <Character, Integer>map = new HashMap<>();
        map.put(letterChar, 0);
        for(int i =0; i <input.length();i++){
            if(input.charAt(i)==letterChar){
               // you never said how to increment it using the hasmap
                //do I do merge ,do i just increment the value
                //idk what Tariq wants but i guess you could be more specific by what this means
                map.put(letterChar,map.get(input.charAt(i))+1);

            }
        }
        return map.get(letterChar);

    }
}
