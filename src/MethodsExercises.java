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
        AdventureGame();
        boolean again;

//        do {
//            getFactorial();
//            System.out.println("Would you like to continue? Enter yes or no");
//            String cont = sc.nextLine();
//            again = cont.equalsIgnoreCase("yes");
//        } while (again);

//        do {
//            System.out.println("How many sides on the dice?");
//            rollDice(getInteger(1,100));
//
//
//            System.out.println("Would you like to continue? Enter yes or no");
//        }while(sc.nextLine().equalsIgnoreCase("yes"));
//

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

//    public static void getFactorial() {
//        int userNumber = getInteger(1, 10);
//        long factorial = 1;
//        for (int i = 1; i <= userNumber; i++) {
//            factorial *= i;
//            if (i == userNumber) {
//                System.out.println(userNumber + "! = " + factorial);
//            }
//        }
//    }

//    public static void rollDice(int sides) {
//        Random random = new Random();
//        int dice1 = random.nextInt(sides) + 1;
//        int dice2 = random.nextInt(sides) + 1;
//        int sum = dice1 + dice2;
//
//        System.out.println("dice1 = " + dice1);
//        System.out.println("dice2 = " + dice2);
//        System.out.println(sum);
//    }

    public static void AdventureGame() {
        int mageHealth = (int) (Math.random() * 20) + 70;
        int mageAttack = (int) (Math.random() * 10) + 10;
        int mageDefense = (int) (Math.random() * 5) + 5;
        int fireball = (int) (Math.random() * 15) + 25;
        int mageMana = (int) (Math.random() * 30) + 20;
//        int warriorHealth = (int) (Math.random() * 20) + 80;
//        int warriorAttack = (int) (Math.random() * 10) + 20;
//        int warriorDefense = (int) (Math.random() * 20) + 60;
        int goblinHealth = (int) (Math.random() * 20) + 50;
        int goblinAttack = (int) (Math.random() * 5) + 10;
        int goblinEnrageAttack = (int) (Math.random() * 15) + 15;


        int fighterClassNum = 0;
        String fighterClass;

        int health;
//        int mana;
        int attack;
        int defense;
        int currentHealth = goblinHealth;

        System.out.println("Would you like to go on an adventure? yes or no");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine().toLowerCase();
        if (userInput.equals("yes")) {
            System.out.println("Let's begin");
            System.out.println("What is your name, traveler?");
            String userName = sc.nextLine().toLowerCase();
            System.out.println("Welcome " + userName);
            System.out.println("Choose your class: Press 1 for mage!");
            fighterClassNum = sc.nextInt();
        }
        if (fighterClassNum == 1) {
            fighterClass = "Mage";
            health = mageHealth;
//            mana = mageMana;
            attack = fireball;
            defense = mageDefense;
            System.out.println("You have chosen " + fighterClass + '.');
            System.out.println("Your stats are\nHealth: " + health + "\n" + "Attack: " + attack + "\n" + "Defense: " + defense);
            System.out.println("Let us begin. You are traveling through a dungeon and you are approached by an ugly looking goblin. It snarls and draws it's weapon.");
            System.out.println("Would you like to fight the goblin or attempt to reason? (fight or reason)");
            sc.nextLine();
            String answer = sc.nextLine();
            if (answer.trim().equalsIgnoreCase("reason")) {
                System.out.println("You dont speak goblin how can you reason with it you idiot");
                health -= goblinAttack;
                System.out.println("The goblin is angered at your disgusting human voice and swings its club, dealing " + goblinAttack + " damage. Your health is now " + (health + "!"));
                answer = "fight";
            }
            while (answer.equalsIgnoreCase("fight")) {

                System.out.println("What now? Attack with a fireball");
                String fightOption = sc.nextLine();
                if (fightOption.equalsIgnoreCase("attack")) {
                    currentHealth -= mageAttack;
                    System.out.println("You cast a fireball dealing " + attack + " damage! The goblin now has " + currentHealth + " health left.");
                    if (currentHealth > 0) {
                        health -= goblinAttack;
                        System.out.println("The fight isn't over yet. The goblin strikes you with its club dealing " + goblinAttack + " damage. Your remaining health is " + health + "!");
                        if (currentHealth <= goblinHealth / 2) {
                            goblinAttack = goblinEnrageAttack;
                            System.out.println("The goblin is furious at your attacks and goes into a rage, doubling his damage!");
                        }
//                        if (fightOption.equalsIgnoreCase("fireball")) {
//                            if (mana >= 15) {
//                                currentHealth -= fireball;
//                                mana -= 10;
//                                System.out.println("You cast your fireball spell, dealing " + fireball + " damage! The goblin now has " + currentHealth + " health left. Your remaining mana is " + mana + ".");
//                            }
//                            if (mana < 15) {
//                                System.out.println("You need more mana");
////
//                            }
//                                if (currentHealth > 0) {
//                                    health -= goblinAttack;
//                                    System.out.println("The fight isn't over yet. The goblin strikes you with its club dealing " + goblinAttack + " damage. Your remaining health is " + health + "!");
//                                    if (currentHealth <= goblinHealth / 2) {
//                                        goblinAttack = goblinEnrageAttack;
//                                        System.out.println("The goblin is furious at your attacks and goes into a rage, doubling his damage!");
//                                    }
//                                }
                            }
                            if (goblinHealth == 0) {
                                System.out.println("The goblin is dead!");
                            }
                            if (health == 0) {
                                System.out.println("You died.");
                            }

                        }
//                } else if (fighterClassNum == 2) {
//                    fighterClass = "Warrior";
//                    health = warriorHealth;
//                    mana = 0;
//                    attack = warriorAttack;
//                    defense = warriorDefense;
//                    System.out.println("You have chosen " + fighterClass + '.');
//                    System.out.println("Your stats are\nHealth: " + health + "\n" + "Mana: " + mana + "\n" + "Attack: " + attack + "\n" + "Defense: " + defense);
//                    System.out.println("Let us begin. You are traveling along a cobblestone road and you are approached by an ugly looking goblin. It snarls at you menacingly and draws it's weapon.");
//                    System.out.println("Would you like to fight the goblin or attempt to reason?");
//                    sc.nextLine();
//                    String answer = sc.nextLine();
//                    System.out.println(health);
//                    if (answer.equalsIgnoreCase("reason")) {
//                        System.out.println("There is no reasoning with a beast like this");
//                        System.out.println("The goblin is angered at your disgusting human voice and lunges at you with its club, dealing " + goblinAttack + " damage. Your health is now " + (health - goblinAttack + "!"));
//                        sc.nextLine();
//                        answer = "fight";
                    }
                }
            }

        }



