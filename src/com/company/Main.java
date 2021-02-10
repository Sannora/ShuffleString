package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "melihmagic";
        int[] indices = {5,6,7,8,9,0,1,2,3,4};
        restoreString(s,indices);
    }
    public static String restoreString(String s, int[] indices){
        char[] shuffledIndex = new char[s.length()];
        char[] Array = new char[s.length()];
        String finalString = "";
        for(int i = 0; i <= s.length()-1; i++){
            Array[i] = s.charAt(i);
        }

        for(int i = 0; i<= Array.length-1; i++){
            shuffledIndex[indices[i]] = Array[i];
        }
        System.out.println(shuffledIndex);
        for(int i =0; i<= s.length()-1; i++){
            finalString += shuffledIndex[i];
        }
        return finalString;
    }
}
