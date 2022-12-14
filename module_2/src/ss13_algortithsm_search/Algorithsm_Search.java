package ss13_algortithsm_search;

import java.util.LinkedList;
import java.util.Scanner;

public class Algorithsm_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> ascendingString = new LinkedList<>();
        System.out.print(" Enter stirng : ");
        String string = sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(string.charAt(i));
            for (int j = i+1; j <string.length() ; j++) {
                if(string.charAt(j)>tempList.getLast()){
                    tempList.add(string.charAt(j));
                }
            }
            if(tempList.size()>ascendingString.size()){
                ascendingString.addAll(tempList);
            }
        }
        for(Character character: ascendingString){
            System.out.print(character);
        }
    }
}
