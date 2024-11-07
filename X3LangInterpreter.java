import java.util.Scanner;

public class X3LangInterpreter {

    public static void main(String[] args) {
        X3LangInterpreter interpreter = new X3LangInterpreter();
        interpreter.run();
    }

    public void run() {
        // Пример базового вывода
        String message = "Hello, X3Lang!";
        pin(message); // Выводит "Hello, X3Lang!"

        // Пример ввода с консоли
        pin("Введите свое имя: ");
        String name = input(); // Используется встроенная функция input
        pin("Привет, ", name, "!");

        // Пример управления типами данных
        int x = 5;       // Явно указанный тип
        double y = 10.5; // Неявно указанный тип, определен как float
        double z = x + y; // Операция приведения типов, как в Python и C++
        pin("Результат: ", z);

        // Пример управления памятью
        int[] ptr = new int[1];
        ptr[0] = 20;  // Создание указателя, выделение памяти
        pin("Значение указателя: ", ptr[0]);  // Разыменование указателя

        // Пример работы с функциями и замыканиями
        Function<Integer, Integer> square = (x1) -> x1 * x1;
        int result = square.apply(5);
        pin("Квадрат 5: ", result);

        // Использование лямбда-выражения
        Function<Integer, Integer> doubleFunc = (x1) -> x1 * 2;
        pin("Удвоенное 5: ", doubleFunc.apply(5));

        // Пример классов и ООП
        Dog myDog = new Dog("Бобик");
        myDog.speak();  // Вывод: "Бобик говорит: Woof!"

        // Пример обработки исключений
        try {
            int x1 = 10 / 0;
        } catch (ArithmeticException e) {
            pin("Ошибка: Деление на ноль");
        } finally {
            pin("Завершение программы");
        }

        // Пример циклов и условий
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            if (num % 2 == 0) {
                pin(num, " - четное число");
            } else {
                pin(num, " - нечетное число");
            }
        }

        // Пример использования модулей
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);
        pin("Площадь круга: ", area);
    }

    // Функция для вывода данных
    public void pin(Object... args) {
        for (Object arg : args) {
            System.out.print(arg);
        }
        System.out.println();
    }

    // Функция для ввода данных
    public String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // Пример класса и ООП
    class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void speak() {
            pin("Some generic sound");
        }
    }

    class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void speak() {
            pin(name, " говорит: Woof!");
        }
    }
}