package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    int i;
    double d;


    public String getString(){
//        scanner.nextLine();
        return scanner.nextLine();
    }

    public boolean yesNo() {
        scanner.nextLine();
        String input = scanner.nextLine();
        return  input.equalsIgnoreCase("yes") ||
                input.equalsIgnoreCase("y") ||
                input.equalsIgnoreCase("sure");
    }

    public int getInt(int min, int max) {
        String in;
        try {
            do {
                System.out.println("Enter a number");
                in = scanner.nextLine();
                i = Integer.valueOf(in);
            } while (i < min || i > max);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            getInt(min,max);
        }
        return i;
    };


    public int getInt() {
        System.out.println("Enter a number");
        String in = scanner.nextLine();
        try {
            i = Integer.valueOf(in);
        } catch (NumberFormatException e){
            e.printStackTrace();;
            getInt();
        }
        return i;
    };

    public double getDouble(double min, double max) {
        String in;
        try {
            do {
                System.out.println("Enter a number");
                in = scanner.nextLine();
                d = Double.valueOf(in);
            } while (d < min || d > max);
        } catch (NumberFormatException e){
            e.printStackTrace();
            getDouble(min,max);
        }
        return d;
    };

    public double getDouble() {
        System.out.println("Enter a number");
        String in = scanner.nextLine();
        try {
            d = Double.valueOf(in);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            getDouble();
        }
        return d;
    };

    public double getBinary() {
        System.out.println("Enter a number");
        String in = scanner.nextLine();
        try {
            d = Integer.valueOf(in, 2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            getDouble();
        }
        return d;
    };



    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("input.getInt(10,50) = " + input.getInt(10,50));
    }
}
