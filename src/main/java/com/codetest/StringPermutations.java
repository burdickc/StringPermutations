package com.codetest;

import java.util.HashSet;
import java.util.Set;

/**
 * Returns unique permutations of a String
 */
public class StringPermutations {

    /**
     * Returns a set of unqiue permutations of a provided input string
     *
     * @param string - Input string
     */
    public static Set<String> permutationFinder(String string) {
        Set<String> perm = new HashSet<String>();
        //Check for a null input
        if (string == null) {
            return null;
        } else if (string.length() == 0) {
            perm.add("");
            return perm;
        }

        char initial = string.charAt(0);                        //Identify the first character of the string
        String remainder = string.substring(1);                 //Identify the remainder of the string
        Set<String> words = permutationFinder(remainder);       //Add permutations of the remainder to a Set, to avoid duplicates
        for (String newString : words) {
            for (int i = 0; i <= newString.length(); i++) {
                perm.add(charInsert(newString, initial, i));    //insert initial character in all positions of the remainder's permutations
            }
        }
        return perm;
    }

    /**
     * Inserts the initial character to create the unique permutations
     *
     * @param string - Input string
     * @param character - Accepts the initial charcter
     * @param i - Tracks the position to insert the initial character
     */
    public static String charInsert(String string, char character, int i) {
        String begin = string.substring(0, i);
        String end = string.substring(i);
        return begin + character + end;
    }
}
