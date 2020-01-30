import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {

//        String input = "We don't need no education";
//        String replaceString=input.replace("education","thought control");
//          System.out.println(replaceString);

//        String input = ("Check \"this\" out!, \"s inside of \"s!");
//          System.out.println(input);

//          String input = ("In windows, the main drive is usually C:\\");
//                System.out.println(input);

//            String input = ("I can do backslashes\\ double backslashes\\\\ and the amazing triple backslash \\\\\\!");
//                  System.out.println(input);



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.endsWith(" ")) {
            System.out.println("Fine. Be that way!");
        } else System.out.println("Whatever.");

        System.out.println("Do you want to continue y or n");
        while (!"n".equals(userInput)) {

        }



    }
}
