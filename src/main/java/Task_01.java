import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        float number = getFloatInput();
        System.out.println("Введено число: " + number);
    }
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float number;

        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                number = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введено неверное значение. Повторите попытку.");
            }
        }

        return number;
    }
}

