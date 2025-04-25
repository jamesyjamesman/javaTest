import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi there! Welcome to my doodad here.");
        Scanner textScanner = new Scanner(System.in);
        System.out.println("State a value that is True or False!");
        String coolBoolStr = textScanner.nextLine();
        boolean coolBool = Boolean.parseBoolean(coolBoolStr);
        boolean invertedCoolBool = boolSwitch(coolBool);
        System.out.printf("The opposite of what you just said is: " + invertedCoolBool +"!");
        System.out.println();
    }

    public static boolean boolSwitch(boolean coolBool) {
        return !coolBool;
    }
}