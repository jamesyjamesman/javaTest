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
        NotMain.notMain(coolBool);
        SwitchTest.mainSwitcheroo();
    }

    public static boolean boolSwitch(boolean coolBool) {
        return !coolBool;
    }
}

class NotMain {
    public static void notMain(boolean coolBool) {
        System.out.println("If I can get this string to print I'll be happy!");
        System.out.println("I wonder if there's any other way to get a class to run without directly calling a function inside of it?");
        System.out.println("Classes are used for OOP or for organization, I believe.");
        if (coolBool) {
            System.out.println("Hey, you're a truther!");
        } else if (!coolBool) {
            System.out.println("Hey, you're not a truther!");
        } else {
            System.out.println("Hey, uh, how did you get here?");
        }
    }
}

class SwitchTest {
    public static void mainSwitcheroo() {
        Scanner textScanner = new Scanner(System.in);
        System.out.println("Pick a number from 0-9.");
        String inputNumber = textScanner.nextLine();
        switch (inputNumber.charAt(0)) {
            case '0':
                System.out.println("Entropic... I like it!");
                break;
            case '1':
                System.out.println("This is what you always roll in board games, huh?");
                break;
            case '2':
                System.out.println("An even individual, I see.");
                break;
            case '3':
                System.out.println("That's how many hits the boss takes to beat!");
                break;
            case '4':
                System.out.println("Four... Unlucky, to some people. Don't walk under any ladders!");
                break;
            case '5':
                System.out.println("The midpoint! Well, kind of.");
                break;
            case '6':
                System.out.println("You better not roll this too much, or you'll never roll it again.");
                break;
            case '7':
                System.out.println("Lucky!");
                break;
            case '8':
                System.out.println("The most programmatic number there is from 0-9!");
                break;
            case '9':
                System.out.println("You just picked the first number you saw, didn't you?!");
                break;
            default:
                System.out.println("I'm just realizing that it would have been easier to assign each string to a variable, then I'd only have to write one print statement!");
                break;
        }
    }
}