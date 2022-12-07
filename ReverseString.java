package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * @author ${User}
 * @created ${Day}/${Month}/${Year} - ${Time}
 * @Project ${Project_Name}
 **/
public class Main {
    public static void main(String[] args) throws CustomException {
        String str= "I am working in a josh software";
        reverseStringSimple(str);
        reverseStringByBuiltInReverseMethod(str);
        reverseStringByAlternateToCharArray(str);
        reverseStringByByteArray(str);
        reverseStringByStringBuffer(str);
        reverseStringByToCharArray(str);
        reverseStringUsingArrayListObject(str);
    }
    public static void reverseStringSimple(String str){
        String nstr="";
        char ch;
        System.out.print("Original word: ");
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }

    public static void reverseStringByByteArray(String input){
        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println(new String(result));
    }
    public static void reverseStringByBuiltInReverseMethod(String input){
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
    public static void reverseStringByToCharArray(String input){
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
    public static void reverseStringByAlternateToCharArray(String input){
        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }
        for (char c : temparray)
            System.out.print(c);
        System.out.println();
    }
    public static void reverseStringByStringBuffer(String str){
        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
    }
    public static void reverseStringUsingArrayListObject(String input){
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();

        for (char c : hello)
            trial1.add(c);

        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }
}
