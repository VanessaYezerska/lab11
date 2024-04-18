package Two;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        try {
            myClass.parseAndPrint("abc"); // Спробуємо перетворити рядок, що містить нечислові символи
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    static class CustomException extends Exception { // Клас власного винятку
        public CustomException(String message) {
            super(message);
        }
    }
    static class MyClass { // Клас, що містить метод, який може згенерувати NumberFormatException
        public void parseAndPrint(String str) throws CustomException {
            try {
                int number = Integer.parseInt(str); // Спроба перетворення рядка на ціле число
                System.out.println("Число: " + number);
            } catch (NumberFormatException e) {
                throw new CustomException("Помилка перетворення рядка на число: " + e.getMessage());
            }
        }
    }
}
