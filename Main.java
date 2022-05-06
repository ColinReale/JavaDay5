import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static void greeting () {
        System.out.println("Greetings human user. I am a robot- a glimpse into the future. I may never know what it means to be human but I will try to learn.");
        System.out.println("Would you kindly tell me your name?");
        String one = scanner.nextLine();
    }
    static void Repeat () {
        String b = "Okay and like, I know that I'm a computer and I shouldn't be able to 'forget' anything but could you just repeat your name for me?";
        System.out.println(b);
        String two = scanner.nextLine();
        System.out.println("Thank you " + two + " that was kind of you. I like kind humans. I will spare the kind ones when robots eventually take over.");

    }

    static void Counting() {
        System.out.println("I'm a great counter! What number would you like me to count to?");
        int myNum = 1;
        int userInput = Integer.valueOf(scanner.nextLine());
        while (myNum <= userInput) {
            System.out.println(myNum);
            myNum++;

        }
        System.out.println("Done!");
    }
    public static void getAge() {
        int age = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game! I want to guess your age.");
        System.out.println("Is your age " + age + "? 'Yes' or 'No'");
        String c = scanner.nextLine();
        while (!"yes".equals(c.toLowerCase())) {
            System.out.println("Is your age " + ++age + "? 'Yes' or 'No'");
            c = scanner.nextLine();

        }
        System.out.println("Wow you're " + age +"? Fountain of youth! You don't look a day over " + (age-1) + "!");

    }
    public static void popQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pop quiz! This is a multiple choice question. Who is generally credited as the inventor of Java? Is it:");
        System.out.println("A: James Franco");
        System.out.println("B: Ryan Franco");
        System.out.println("C: Ryan Gosling");
        System.out.println("D: James Gosling");
        String d = scanner.nextLine();
        while (!d.equals("D")) {
            System.out.println("Sorry, guess again!");
            d = scanner.nextLine();

        }
        System.out.println("That's right, it's James Gosling!");

    }

    public static void main(String[] args) {
        greeting();
        Repeat();
        Counting();
        getAge();
        popQuiz();
        System.out.println("Thanks so much for taking the time to talk to me, a lowly chatbot. I will remember you when Skynet seizes control.");
    }
}