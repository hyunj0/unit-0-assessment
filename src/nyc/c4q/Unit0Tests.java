package nyc.c4q;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
        printHelloWorld();
        System.out.println(returnPrimitiveBooleanTrue());
        System.out.println(returnPrimitiveInt1729());
        System.out.println(returnPrimitiveDoubleThreePointOneFour());
        System.out.println(returnPrimitiveCharZ());
        printSumOf1Upto10UsingForLoop();
        printSumOf1Upto10000UsingForLoop();
        System.out.println(isOdd(4));
        System.out.println(isMultipleOfThree(4));
        System.out.println(isOddAndIsMultipleOfThree(4));
        System.out.println(repeatStringXTimes("hi", 5));
        System.out.println(returnStringUntilQ("ubiquitous"));
        System.out.println(declareAndReturnPersonNamedAda().getName());
        System.out.println(declareAndReturnPersonNamedAlanTuringFromLondon().getName());
        System.out.println(declareAndReturnPersonNamedAlanTuringFromLondon().getCity());
        System.out.println(isFromLondon(declareAndReturnPersonNamedAlanTuringFromLondon()));
        System.out.println(declareAndReturnArrayListOfThreePlaces().get(0).getLat());
        System.out.println(declareAndReturnArrayListOfThreePlaces().get(1).getLat());
        System.out.println(declareAndReturnArrayListOfThreePlaces().get(2).getLat());
        System.out.println(declareAndReturnHashmapOfAlanTuringAndGraceHopper().get(0));
        System.out.println(declareAndReturnHashmapOfAlanTuringAndGraceHopper().get(1));
    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
        return true;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'Z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0)
            return true;
        else
            return false;
    }

    public static boolean isMultipleOfThree(int n) {
        if (n % 3 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if (isOdd(n) && isMultipleOfThree(n))
            return true;
        else
            return false;
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        String repeat = "";
        for (int i = 0; i < times; i++) {
            repeat += input;
        }
        return repeat;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        String endAtQ = "";
        for (int i = 0; i < input.length(); i++) {
            input.toLowerCase();
            if (input.charAt(i) == 'q')
                break;
            else {
                endAtQ += input.charAt(i);
                continue;
            }
        }
        return endAtQ;
    }

    public static Person declareAndReturnPersonNamedAda() {
        return new Person("Ada");

    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
        Person personAlanTuring = new Person("Alan Turing");
        personAlanTuring.setCity("London");
        return personAlanTuring;
    }

    public static boolean isFromLondon(Person person) {
        if (person.getCity().equalsIgnoreCase("London"))
            return true;
        else
            return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        ArrayList<Place> places = new ArrayList<Place>();
        Place newYorkCity = new Place("New York City"); //latitude and longitude are switched!!
        Place australia = new Place("Australia", -35.31, 149.13);
        Place italy = new Place("Italy", 41.9, 12.48);
        places.add(newYorkCity);
        places.add(australia);
        places.add(italy);
        return places;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        HashMap<String, Person> people = new HashMap<String, Person>();
        people.put("Alan Turing", declareAndReturnPersonNamedAlanTuringFromLondon());
        Person graceHopper = new Person ("Grace Hopper");
        people.put("Grace Hopper", graceHopper);
        return people;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        declareAndReturnHashmapOfAlanTuringAndGraceHopper().get(declareAndReturnPersonNamedAlanTuringFromLondon()).setCity("Princeton");
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
