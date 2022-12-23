package ss13_algortithsm_search;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> maxLength = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.print(" Enter String :");
        String string = sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if(list.size()>1&&string.charAt(i)<=list.getLast()&&list.contains(string.charAt(i))){
                list.clear();
            }
            list.add(string.charAt(i));
            if(list.size()>maxLength.size()){
                maxLength.addAll(list);
            }
        }
        for(Character character: maxLength){
            System.out.print(character);
        }
    }
}
