package com.codetest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string, to view it's unique permutations: ");
        String input = scanner.next();

        StringPermutations stringPermutations = new StringPermutations();
        Set<String> perms = stringPermutations.permutationFinder(input);
        System.out.println(Arrays.toString(perms.toArray()));
    }
}
