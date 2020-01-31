import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Student {
    String name;
    String cohort;
    Date starDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args) {
        Student gaston = new Student();
        gaston.name = "gaston";
        gaston.cohort = "europa";
        gaston.starDate = new Date("10/04/2019");
        gaston.program = "web dev";
        gaston.location = "san antonio";
        gaston.drinksCoffee = true;

        Student zach = new Student();
        zach.name = "zach";
        zach.cohort = "baize";
        zach.starDate = new Date("february 11, 2019");
        zach.program = "data science";
        zach.location = "dallas";
        zach.drinksCoffee = true;

        System.out.println(gaston.report());
//        if (zach.drinksCoffee)
//        System.out.println(zach.name + " drinks coffee.");
    }

    public String report() {
        String output = "";
        output += "My name is " + this.name + ".";
        output += "i started learning " + this.program + " with " + this.cohort + " on " + this.starDate + ".";
        if (this.drinksCoffee)
            output += "i drink coffee in " + this.location + ".";
        else
            output += "i dont drink coffee in " + this.location + ".";
        return output;

    }
}
