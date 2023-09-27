import java.util.Scanner;

public class EmptyStringExceptionDemo {
    public static void main(String[] args) {
        try {
            String input = getStringInput();
            System.out.println("Введенная строка: " + input);
        } catch (EmptyStringException e) {
            System.out.println("Ошибка! Пустые строки не допускаются.");
        }
    }

    public static String getStringInput() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new EmptyStringException();
        }

        return input;
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException() {
        super();
    }
}

