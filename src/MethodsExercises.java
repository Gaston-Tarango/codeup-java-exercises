import java.util.Random;
import java.util.Scanner;
public class MethodsExercises {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        addition(1, 2);
//        subtraction(3, 2);
//        multiplication(1, 2);
//        division(3, 2);
//        mod(10, 2);
//        getInteger(1,10);
        boolean again;

//        do {
//            getFactorial();
//            System.out.println("Would you like to continue? Enter yes or no");
//            String cont = sc.nextLine();
//            again = cont.equalsIgnoreCase("yes");
//        } while (again);

        do {
            System.out.println("How many sides on the dice?");
            rollDice(getInteger(1,100));


            System.out.println("Would you like to continue? Enter yes or no");
        }while(sc.nextLine().equalsIgnoreCase("yes"));


        }

    public static void addition(int first, int second) {
        System.out.println(first + second);
    }

    public static void subtraction(int first, int second) {
        System.out.println(first - second);
    }

    public static void multiplication(int first, int second) {
        System.out.println(first * second);
    }

    public static void division(float first, float second) {
        System.out.println(first / second);
    }

    public static void mod(int first, int second) {
        System.out.println(first % second);
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int numInput = 0;
        while (numInput < min || numInput > max) {
            System.out.println("Enter a number between one and ten.");
            numInput = sc.nextInt();
        }
        return numInput;
    }

    public static void getFactorial() {
        int userNumber = getInteger(1, 10);
        long factorial = 1;
        for (int i = 1; i <= userNumber; i++) {
            factorial *= i;
            if (i == userNumber) {
                System.out.println(userNumber + "! = " + factorial);
            }
        }
    }

    public static void rollDice(int sides) {
        Random random = new Random();
        int dice1 = random.nextInt(sides) + 1;
        int dice2 = random.nextInt(sides) + 1;
        int sum = dice1 + dice2;

        System.out.println("dice1 = " + dice1);
        System.out.println("dice2 = " + dice2);
        System.out.println(sum);
    }

    public static void AdventureGame() {
        int warriorhealth = (int) (Math.random() * 20) + 50;
        int warriorAttack = (int) (Math.random() * 10) + 15;
        int warriorDefence = (int) (Math.random() * 10) + 50;
        int magehealth = (int) (Math.random() * 20) + 50;
        int mageAttack = (int) (Math.random() * 10) + 20;
        int mageDefence = (int) (Math.random() * 10) + 40;
        int miniLhealth = (int) (Math.random() * 10) + 30;
        int miniLAttack = (int) (Math.random() * 10) + 5;
        int miniLDefence = (int) (Math.random() * 5) + 40;
        int miniRhealth = (int) (Math.random() * 10) + 30;
        int miniRAttack = (int) (Math.random() * 10) + 5;
        int miniRDefence = (int) (Math.random() * 5) + 40;
        int mainBhealth = (int) (Math.random() * 20) + 50;
        int mainBAttack = (int) (Math.random() * 10) + 10;
        int mainBDefence = (int) (Math.random() * 15) + 40;

        ChooseHero =

    }
}
