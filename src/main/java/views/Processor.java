package views;

import enums.*;
import java.util.*;
import java.util.regex.*;

public class Processor {
    private static final Processor instance = new Processor();
    protected static final Scanner scanner = new Scanner(System.in);

    public static Processor getInstance() {
        return instance;
    }

    public static Matcher getMatcher(String input, Command command) {
        String regex = "\\s*" + command.getRegex().replace(" ", "\\s+") + "\\s*";
        Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(input);
        return matcher.matches() ? matcher : null;
    }

    public static String getInput() {
        return scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }

    public static void showCurrentMenu(String menu) {
        System.out.println("current menu: " + menu);
    }
}
