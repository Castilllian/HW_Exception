public class Task_02 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[9]; // Пример инициализации intArray
            double catchedRes1;

            if (d != 0) {
                catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                System.out.println("Деление на ноль невозможно");
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

