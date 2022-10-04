package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner scan = new Scanner(System.in);

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_" + System.lineSeparator() + "     `---''---`" );
    }

    //todo Task 3
    public void sumOfLiterals(){
        // Z = 90(dezimal)
        // OxFACE(hex) = 64206 (dezimal)
        // 012 = 12
        // 80L (long)
        // 44e-1f = 4.4 float
        // 5.5f
        // 8.88e1 88.8 double
        // 99.9 double

        char z = 'Z';
        int hex_64206 = 0xFACE;
        int zero12 = 012;
        long eighty = 80L;
        float fourPointFour = 44e-1f;
        float fivePointFive = 5.5f;
        double eightyEightPointEight = 8.88e1;
        double ninetyNinePointNine = 99.9;

        int sum = z + hex_64206 + zero12 + (int) eighty +
                (int) fourPointFour + (int) fivePointFive
                + (int) eightyEightPointEight + (int) ninetyNinePointNine;

        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        int x = scan.nextInt();
        int y = scan.nextInt();

        int sum = x + y;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        int x,y;
        x = scan.nextInt();
        y = scan.nextInt();

        System.out.print("Before Swap:" + System.lineSeparator() +
                "x: " +
                "y: ");

        x = x ^ y; // 9(1001) XOR 4(0100) = 1101
        y = x ^ y; //1101 XOR 0100 = 1001
        x = x ^ y; //1101 XOR 1001 = 0100

        System.out.println( "After Swap:" + System.lineSeparator() + "x: " + x + System.lineSeparator() +
                "y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int n1,n2;

        n1 = scan.nextInt();
        n2 = scan.nextInt();


        if(n1 > n2){
            System.out.println("n1: " + "n2: " + "n1 > n2");
        }else if(n2 > n1){
            System.out.println("n1: " + "n2: " + "n2 > n1");
        } else{
            System.out.println("n1: " + "n2: " + "n1 == n2");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        int revenue;
        System.out.print("Enter annual Revenue: ");
        revenue = scan.nextInt();
        if(revenue >= 0 && revenue < 20000){
            System.out.print("Poor Sales Revenue" + System.lineSeparator());
        }else if(revenue >= 20000  && revenue < 50000){
            System.out.print("Average Sales Revenue" + System.lineSeparator());
        }else if(revenue >= 50000  && revenue < 80000){
            System.out.print("Good Sales Revenue" + System.lineSeparator());
        }else if(revenue >= 80000 && revenue < 100000) {
            System.out.println("Excellent Sales Revenue" + System.lineSeparator());
        }else {
            System.out.print("Invalid Revenue" + System.lineSeparator());
        }


    }

    //todo Task 8
    public void getCommissionRate(){
        System.out.print("Enter CommissionClass: ");
        int input = scan.nextInt();

        switch (input){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        int year = scan.nextInt();
        if (year % 100 == 0 && year % 400 != 0){
            System.out.println("Not a Leapyear");
        } else if (year % 4 == 0){
            System.out.println("Leapyear");
        } else if (year % 400 == 0){
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");
        int number = scan.nextInt();

        if (number <= 999){
            int digit;
            int reverse = 0;

            while(number > 0){
                digit = number % 10;
                number = number / 10;
                reverse = reverse * 10 + digit;
            }
            System.out.println(reverse);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}