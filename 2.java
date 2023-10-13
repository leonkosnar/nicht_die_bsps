package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public void largestNumber(){
        int[] arr = {};
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        double max = 0;
        while(true){
            index++;
            System.out.printf("Number " + index + ": ");
            double input = scanner.nextDouble();
            if(input <= 0){
                if(index == 1){
                    System.out.println("No number entered.");
                }
                else{
                    String.format(Locale.US, "%.2f", max);
                    System.out.printf("The largest number is %.2f", max);
                    System.out.println();
                }
                break;
            }
            if(input > max) max = input;
        }
    }

    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        if(n < 0){
            System.out.println("Invalid number!");
        }
        else {
            int number = 1;
            for (int row = 1; row <= n; row++) {
                for (int a = 1; a <= row; a++) {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
            }
        }
    }

    public void printPyramid(){
        int rows = 6;
        for(int row = 0; row < rows; row++){
            for(int space = 1; space <= rows -1 - row; space++){
                System.out.print(" ");
            }
            for(int i = 0; i < row*2+1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.next().charAt(0);
        //(char)(c-i)
        if(h%2 == 0){
            System.out.println("Invalid number!");
        }
        else{
            for(int row = 1; row < (h+1)/2; row++){
                for(int space = 0; space < ((h-1)/2-row+1); space++){
                    System.out.print(" ");
                }
                for(int ch = row - 1; ch > 0; ch--){
                    char curCh = (char) (c-ch);
                    System.out.print(curCh);
                }
                for(int ch = 0; ch < row; ch++){
                    char curCh = (char) (c-ch);
                    System.out.print(curCh);
                }

                System.out.println();
            }
            for(int row = (h+1)/2; row > 0; row--){
                for(int space = 0; space < ((h-1)/2-row+1); space++){
                    System.out.print(" ");
                }
                for(int ch = row - 1; ch > 0; ch--){
                    char curCh = (char) (c-ch);
                    System.out.print(curCh);
                }
                for(int ch = 0; ch < row; ch++){
                    char curCh = (char) (c-ch);
                    System.out.print(curCh);
                }

                System.out.println();
            }
        }
    }

    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int fives = 0;
        int sum = 0;
        int amnt = 1;
        while(true){
            System.out.print("Mark "+amnt+": ");
            int grade = scanner.nextInt();
            if(0<=grade && grade<=5){
                if(grade == 0){
                    if(amnt == 1) amnt = 2;
                    break;
                }
                amnt ++;
                sum += grade;
                if(grade == 5) {
                    fives++;
                }
            }
            else{
                System.out.println("Invalid mark!");
            }
        }
        double avg = (double) sum /(amnt-1);
        System.out.printf("Average: %.2f", avg);
        System.out.println("\nNegative marks: "+fives);
    }

    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int last_step = scanner.nextInt();
        ArrayList<String> history = new ArrayList<String>();
        while(true){
            int sum = 0;
            String[] split_string = String.valueOf(last_step).split("");
            //System.out.print(Arrays.toString(split_string) + " -> ");
            for (String number:split_string){
                sum += (int) Math.pow(Integer.parseInt(number), 2);
            }
            if(sum == 1){
                System.out.println("Happy number!");
                break;
            }
            if(history.contains(String.valueOf(sum))){
                System.out.println("Sad number!");
                break;
            }
            last_step = sum;
            history.add(String.valueOf(sum));
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

    }
}
