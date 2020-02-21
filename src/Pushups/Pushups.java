package Pushups;

import org.junit.Test;

import java.util.ArrayList;

public class Pushups {

//        System.out.println(multiply(7, 17));
//        System.out.println(toThePower(2, 16));
//    }
//
//    public static int multiply(int a, int b) {
//        int sum = 0;
//        for (int i = 0; i < b; i++) {
//            sum += a;
//        }
//        return sum;
//    }
//
//    public static int toThePower(int a, int b) {
//        int product = 1;
//        for (int i = 0; i < b; i++) {
//            product *= a;
//        }
//        return product;

//        ArrayList<String> fruits = new ArrayList<String>();
//        String fruits[] = ("apple", "pear", "banana", "mango", "kiwi", "orange");
//        yay im lost again no idea what im doing how the hell am i gonna be ablw to graduate or get a job

//      String List;
//        System.out.println("This is so stupid");
//        System.out.println("Dont know whats going on");
//        System.out.println("Why cant we get a different teacher");
//        System.out.println("So bored is the time up yet dont want to type anymore");
//        System.out.println("Can the directions be any more vague?");
//        System.out.println("Whats the point of the pushups if we have no idea if what we wrote is correct");
//        System.out.println("Maybe we can get a decent explanation for stuff");
//        System.out.println("No one to ask for help teachers are useless");
//        System.out.println("Probably need to go back to the oilfield");


//      @Test
//      public void testCompareNumbers(){
//          //GReater than
//        assertEquals(CopareNumbers.compareNumbers(50.0, 37.625), "50.0>37.625");
//
//         // Less Than
//
//            assertEquals(CopareNumbers.compareNumbers(37.625, 50.0), "37.625<50.0");
//        // Equal
//
//            assertEquals(CopareNumbers.compareNumbers(50.0, 50.0), "50.0==50.0");
//        // Exception
//        }

        // This is a method that takes in a list of Integers and an int. It parse the list to find which pairs of integers in the list when added together equals the int parameter. Return the result as an aRRAyList of  Arraylist of Integers.

  * IndexPairs

    public static ArrayList<ArrayList<Integer>> findAddends(ArrayList<Integer> listToTry, int target) {
             ArrayList<ArrayList<Integer>> sums = new ArrayList<>();
             for (int i = 0; i<listToTry.size(); i++) {
              for (int j = i + 1; j < listToTry.size(); j++) {
                  int sum = listToTry.get(i) + listToTry.get(j);
                  if (sum == target) {
                      IndexPair ip = new IndexPair(i, j);
                      sums.add(ip);
                  }
              }
             }

            return sums;
        }

    }
