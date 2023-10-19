package at.ac.fhcampuswien;

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
            if(day < 10) System.out.print(" ");

            System.out.print(day+" ");

            if(day_of_month % 7 == 0 && day < amnt_of_days) System.out.println();

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

            else if(guess < numberToGuess && i<10){
                System.out.println("The number AI picked is higher than your guess.");
            }
            else if(i<10){
                System.out.println("The number AI picked is lower than your guess.");
            }

            if(i == 10){
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random rnd = new Random();
        return rnd.nextInt(1)+1;
    }

    public static boolean swapArrays(int[] a, int[] b){

        if(a.length != b.length) return false;

        for(int i = 0; i < a.length; i++){
            int c = a[i];
            a[i] = b[i];
            b[i] = c;
        }
        return true;
    }

    public static String camelCase(String in) {
        StringBuilder out = new StringBuilder();
        boolean capital_flag = true; // Erster Buchstabe immer groß
        for(int ascii : in.toCharArray()){

            if(capital_flag && ascii < 123 && ascii > 96) out.append((char) (ascii - 32)); // flag (: [i-1] = space) UND klein -> groß

            else if ((capital_flag && ascii < 91 && ascii > 64) || (ascii < 122 && ascii > 96)) out.append((char)ascii); // (flag und groß) oder (klein) -> darf so bleiben

            else if(ascii < 91 && ascii > 64) out.append((char)(ascii + 32)); // groß -> klein

            capital_flag = ascii == 32; // Setzt die "capital_flag"
        }
        return out.toString();
    }

    public static int checkDigit(int[] arr) {
        int summ = 0;

        for(int i = 0; i< arr.length; i++) summ += (i+2) * arr[i];

        int diff = 11 - (summ % 11);

        if(diff == 10) return 0;
        if(diff == 11) return 5;
        else return diff;
    }

    public static void main(String[] args) {

        System.out.println(camelCase("das IsT DEr # CaMel- case+ test"));

    }
}
