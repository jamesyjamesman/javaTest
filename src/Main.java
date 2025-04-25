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
        NotMain.notMain();
    }

    public static boolean boolSwitch(boolean coolBool) {
        return !coolBool;
    }
}

class NotMain {
    public static void notMain() {
        System.out.println("If I can get this string to print I'll be happy!");
        System.out.println("I wonder if there's any other way to get a class to run without directly calling a function inside of it?");
        System.out.println("Classes are used for OOP or for organization, I believe.");
    }
}