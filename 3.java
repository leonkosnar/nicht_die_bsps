package at.ac.fhcampuswien;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int amnt_of_days, int first_day_of_month) {

        int day_of_month = 1;
        for(int day = 1; day < first_day_of_month; day++){
            System.out.print("   ");
            day_of_month++;
        }

        for(int day = 1; day <= amnt_of_days; day++){
            if(day < 10){
                System.out.print(" ");
            }
            System.out.print(day+" ");

            if(day_of_month % 7 == 0 && day < amnt_of_days){
                System.out.println();
            }
            day_of_month++;
        }
        System.out.println();
    }

    public static long[] lcg(long seed) {
        long[] arr = new long[10];

        long a = 1103515245;
        long c = 12345;
        long m = (long) Math.pow(2,31);
        // x(i+1) = (a*x(i)+c % m

        //erster wert wird extra gesetzt (startwert)
        arr[0] = (a * seed + c) % m;
        for (int i = 0; i<9; i++) {
            arr[i+1] = (a * arr[i] + c) % m;
        }

        return arr;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner in = new Scanner(System.in);
        for(int i = 1; i<=11; i++){
            System.out.print("Guess number "+i+": ");
            int guess = in.nextInt();

            if(guess == numberToGuess){
                System.out.println("You won wisenheimer!");
                break;
            }
            else if(guess < numberToGuess && i<10)System.out.println("The number AI picked is higher than your guess.");
            else if(i<10) System.out.println("The number AI picked is lower than your guess.");
            if(i == 10){
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random rnd = new Random();
        return rnd.nextInt(99) +1;
    }

    public static boolean swapArrays(int[] a, int[] b){

        if(a.length != b.length){
            return false;
        }

        for(int i = 0; i < a.length; i++){
            int c = a[i];
            a[i] = b[i];
            b[i] = c;
        }

        return true;
    }

    public static String camelCase(String in) {
        char[] arr = in.toCharArray();
        StringBuilder out = new StringBuilder();
        // Erster Buchstable immer groß - alt.: "ABC...".contains(String.value(arr[0]))
        boolean prev_is_space = true;
        for(char letter : arr){
            if(prev_is_space){
                prev_is_space = false;
                if(letter == 'a' || letter == 'A') out.append("A");
                else if(letter == 'b' || letter == 'B') out.append("B");
                else if(letter == 'c' || letter == 'C') out.append("C");
                else if(letter == 'd' || letter == 'D') out.append("D");
                else if(letter == 'e' || letter == 'E') out.append("E");
                else if(letter == 'f' || letter == 'F') out.append("F");
                else if(letter == 'g' || letter == 'G') out.append("G");
                else if(letter == 'h' || letter == 'H') out.append("H");
                else if(letter == 'i' || letter == 'I') out.append("I");
                else if(letter == 'j' || letter == 'J') out.append("J");
                else if(letter == 'k' || letter == 'K') out.append("K");
                else if(letter == 'l' || letter == 'L') out.append("L");
                else if(letter == 'm' || letter == 'M') out.append("M");
                else if(letter == 'n' || letter == 'N') out.append("N");
                else if(letter == 'o' || letter == 'O') out.append("O");
                else if(letter == 'p' || letter == 'P') out.append("P");
                else if(letter == 'q' || letter == 'Q') out.append("Q");
                else if(letter == 'r' || letter == 'R') out.append("R");
                else if(letter == 's' || letter == 'S') out.append("S");
                else if(letter == 't' || letter == 'T') out.append("T");
                else if(letter == 'u' || letter == 'U') out.append("U");
                else if(letter == 'v' || letter == 'V') out.append("V");
                else if(letter == 'w' || letter == 'W') out.append("W");
                else if(letter == 'x' || letter == 'X') out.append("X");
                else if(letter == 'y' || letter == 'Y') out.append("Y");
                else if(letter == 'z' || letter == 'Z') out.append("Z");
            }
            else{
                if(letter == ' ') prev_is_space = true;
                else if(letter == 'a' || letter == 'A') out.append("a");
                else if(letter == 'b' || letter == 'B') out.append("b");
                else if(letter == 'c' || letter == 'C') out.append("c");
                else if(letter == 'd' || letter == 'D') out.append("d");
                else if(letter == 'e' || letter == 'E') out.append("e");
                else if(letter == 'f' || letter == 'F') out.append("f");
                else if(letter == 'g' || letter == 'G') out.append("g");
                else if(letter == 'h' || letter == 'H') out.append("h");
                else if(letter == 'i' || letter == 'I') out.append("i");
                else if(letter == 'j' || letter == 'J') out.append("j");
                else if(letter == 'k' || letter == 'K') out.append("k");
                else if(letter == 'l' || letter == 'L') out.append("l");
                else if(letter == 'm' || letter == 'M') out.append("m");
                else if(letter == 'n' || letter == 'N') out.append("n");
                else if(letter == 'o' || letter == 'O') out.append("o");
                else if(letter == 'p' || letter == 'P') out.append("p");
                else if(letter == 'q' || letter == 'Q') out.append("q");
                else if(letter == 'r' || letter == 'R') out.append("r");
                else if(letter == 's' || letter == 'S') out.append("s");
                else if(letter == 't' || letter == 'T') out.append("t");
                else if(letter == 'u' || letter == 'U') out.append("u");
                else if(letter == 'v' || letter == 'V') out.append("v");
                else if(letter == 'w' || letter == 'W') out.append("w");
                else if(letter == 'x' || letter == 'X') out.append("x");
                else if(letter == 'y' || letter == 'Y') out.append("y");
                else if(letter == 'z' || letter == 'Z') out.append("z");
            }

        }

        return out.toString();
    }

    public static int checkDigit(int[] arr) {
        int summ = 0;
        for(int i = 0; i< arr.length; i++){
            summ += (i+2) * arr[i];
        }
        int diff = 11 - (summ % 11);
        if(diff == 10) return 0;
        if(diff == 11) return 5;
        else return diff;
    }

    public static void main(String[] args) {

        oneMonthCalendar(31, 3);

        System.out.println(Arrays.toString(lcg(0)));

        //guessingGame(49);
        //guessingGame(randomNumberBetweenOneAndHundred());

        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println("A: " + Arrays.toString(a) + "B: "+Arrays.toString(b));
        System.out.println(swapArrays(a, b));
        System.out.println("A: " + Arrays.toString(a) + "B: "+Arrays.toString(b));

        System.out.println("a b'C" + camelCase("a b'C"));

    }
}
