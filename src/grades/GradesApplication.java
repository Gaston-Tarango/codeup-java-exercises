package grades;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        boolean go = true;
        HashMap<String, Student> Students = new HashMap<>();
        Student bobby = new Student("Bobby");
        Student tommy = new Student("Tommy");
        Student bill = new Student("Bill");
        Student chris = new Student("Chris");

        //72.5
        bobby.addGrade(85);
        bobby.addGrade(80);
        bobby.addGrade(70);
        bobby.addGrade(55);

        //96.75
        tommy.addGrade(97);
        tommy.addGrade(98);
        tommy.addGrade(100);
        tommy.addGrade(92);

        //64.5
        bill.addGrade(90);
        bill.addGrade(93);
        bill.addGrade(65);
        bill.addGrade(10);

        //41
        chris.addGrade(57);
        chris.addGrade(13);
        chris.addGrade(19);
        chris.addGrade(75);

        Students.put("bobby-hill", bobby);
        Students.put("tommy-gunn", tommy);
        Students.put("bill-dozer", bill);
        Students.put("chris-griffen", chris);

        System.out.println("Welcome\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (HashMap.Entry<String, Student> entry : Students.entrySet()) {
            System.out.print("| " + entry.getKey() + " ");
        }
        System.out.print("|\n");


        System.out.println(" ");
        while (go) {
            System.out.println("What student would you like to see more information on?");
            String userInput = scanner.nextLine();
            Student selectedStudent = null;
            String selectedStudentUserName = "";
            for (HashMap.Entry<String, Student> entry : Students.entrySet()) {
                if (userInput.equalsIgnoreCase(entry.getKey())) {
                    selectedStudent = entry.getValue();
                    selectedStudentUserName = entry.getKey();
                }
            }
            if (selectedStudent == null) {
                System.out.printf("Sorry, %s is not a valid option", userInput);
            } else {
                System.out.printf("Name: %s  - GitHub Username: %s%nCurrent Average: %s%n%n", selectedStudent.getName(), selectedStudentUserName, df.format(selectedStudent.getGradeAverage()));

            }
            System.out.println("Would you like to see another student? y/n");
            String userInput2 = scanner.nextLine();
            if (!userInput2.equalsIgnoreCase("y")) {
                go = false;
            }
        }
        System.out.println("Goodbye, and have a wonderful day!");
    }
}