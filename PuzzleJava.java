import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava{
    public ArrayList<Integer> arrSum(int[] arr){
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(arr[i] > 10){
                newArr.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArr);
        return newArr;
    }

    public void shuffleArr(String[] arr){
        ArrayList<String> newArr = new ArrayList<String>();
        ArrayList<String> newArrGreaterThan5 = new ArrayList<String>();
        for(int i=0;i<arr.length; i++){
            if(arr[i].length() > 5){
                newArrGreaterThan5.add(arr[i]);
            }
            newArr.add(arr[i]);
        }
        Collections.shuffle(newArr);
        System.out.println(newArr);
        System.out.println(newArrGreaterThan5);
    }

    public void shuffleAlpha(){
        //couldnt get this .toCharArray(); funtction to work :(
        // String alpha = "abcdefghijklmnopqrstuvwxyz";
        // char [] alphabet = alpha.toCharArray();
        // char[] alphabet = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
        // ArrayList<Object> newArr = new ArrayList<Object>();
        // for (int i = 0;i<alphabet.length; i++){
        //     newArr.add(alphabet[i]);
        // }
        // System.out.println(newArr);
        // Collections.shuffle(alphabet);
        // System.out.println(alphabet);
        // System.out.println("First Letter is " + alphabet.get(0));
        // System.out.println("First Letter is " + alphabet.get(25));

    //     ArrayList<String> alphabet = new ArrayList<String>();
    //     for (char letter = 'a'; letter <= 'z'; letter++){
    //         alphabet.add(Character.toString(letter));
    //     }
    //     System.out.println(alphabet);
    //     Collections.shuffle(alphabet);
    //     System.out.println(alphabet);
    //     System.out.println("First Letter is " + alphabet.get(0));
    //     System.out.println("Last Letter is " + alphabet.get(25));
    //     String alpha1 = alphabet.get(0);
    //     System.out.println(alpha1);
    //     if("a".equals(alpha1) || "e".equals(alpha1) || "i".equals(alpha1) || "o".equals(alpha1) || "u".equals(alpha1) ) 
    //         System.out.println("First Letter is also a Vowel!");
    //     else
    //         System.out.println("First Letter is not a Vowel!");
    }

    public void randNum() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num = ThreadLocalRandom.current().nextInt(55,101);
            nums.add(num);
        }
        System.out.println(nums);
    }

    public void randNum1(){
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for(int i = 0; i < 10; i++){
            int num1 = ThreadLocalRandom.current().nextInt(55, 101);
            nums1.add(num1);
            if(num1 < min){
                min = num1;
            }
            if(num1 > max){
                max= num1;
            }
        }
        Collections.sort(nums1);
        System.out.println(nums1);
        System.out.println("Smallest randomized number is: " + min);
        System.out.println("Largest randomized number is: " + max);
    }

    public void randomString(){
        Random random = new Random();
        char [] charArray = new char[5];
            for(int i=0;i<charArray.length;i++) {
            int randomNum = random.nextInt((122 - 97) + 1) + 97;
            charArray[i] = (char) randomNum;
        }
        String answer = Arrays.toString(charArray);
        System.out.println(answer);
    }
}