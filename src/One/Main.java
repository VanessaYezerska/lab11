package One;

public class Main {
    public static void main(String[] args) {
        ExceptionHandler handler = new ExceptionHandler();
        handler.handleAnyException();
        handler.nestedTryCatch();
        handler.withFinallyBlock();
    }
}
class ExceptionHandler {
    public void handleAnyException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Помилка арифметики");
        }
    }
    public  void nestedTryCatch() {
        int a = 4;
        int b = 0;
        int c;
        try {
            c = a / b;
            try {
                int result = (c - a) / b;
                System.out.println("Результат ділення: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Помилка у внутрішньому try");
            }
        } catch (ArithmeticException e) {
            System.out.println("Помилка у зовнішньому try");
        }
    }

    public void withFinallyBlock() {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            int result = numbers[10];
            System.out.println("Результат: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехоплення ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("=)");
        }
    }

}