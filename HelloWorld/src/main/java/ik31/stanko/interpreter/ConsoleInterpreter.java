package ik31.stanko.interpreter;

import java.util.Scanner;

public class ConsoleInterpreter {
    private static final Scanner scanner = new Scanner(System.in);

    public static void interpret(String command) {
        String[] words = command.split(" ");
        StringBuilder builder = new StringBuilder("Entered command = <" + words[0] + ">, parameters = [");
        for (int i = 1; i < words.length; i++) {
            builder.append(words[i]);
            if (i == words.length - 1) {
                break;
            }
            builder.append(", ");
        }
        builder.append("]");
        System.out.println(builder);
    }

    public static void main(String[] args) {
        System.out.println("Enter the command: ");
        String command = scanner.nextLine();
        interpret(command);
    }
}
