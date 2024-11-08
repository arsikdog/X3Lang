X3Lang

X3Lang — это современный язык программирования, который объединяет лучшие черты двух мощных миров: Python и C++. С одной стороны, X3Lang предлагает простоту и удобство синтаксиса Python, с другой — гибкость, производительность и контроль, который предоставляет C++. Этот язык разработан для решения широкого спектра задач — от быстрого прототипирования и обучения до создания высокопроизводительных приложений с необходимостью низкоуровневого управления ресурсами. X3Lang позволяет вам писать чистый и читаемый код, при этом не ограничивая вас в производительности.

X3Lang сочетает в себе динамическую и статическую типизацию, предоставляя разработчикам возможность использовать как строгую типизацию, так и гибкие подходы с автоматическим определением типов, подобно Python. Управление памятью в X3Lang сильно напоминает C++, что дает вам полный контроль над выделением и освобождением памяти, но при этом язык поддерживает удобную автоматическую сборку мусора, что делает его безопасным и удобным в использовании.

Одной из самых ярких особенностей X3Lang является уникальная система вывода, где вместо привычного print используется сокращённая версия pin. Это не только упрощает синтаксис, но и делает код более компактным и лёгким для восприятия.

Кроме того, X3Lang поддерживает объектно-ориентированное программирование с полным набором инструментов для работы с классами, наследованием и полиморфизмом, как в традиционных языках C++, но с синтаксисом, похожим на Python. Язык также предлагает поддержку функционального программирования, включая замыкания и лямбда-функции.

X3Lang предоставляет богатый набор стандартных библиотек и механизмов для работы с многопоточностью, обработки исключений, генераторов, итераторов и многого другого. Всё это позволяет решать сложные задачи, не теряя при этом гибкости и производительности.

Пример кода:

1. Простой вывод и ввод:

func main() {
    // Пример базового вывода
    let message: str = "Hello, X3Lang!"
    pin(message) // Выводит "Hello, X3Lang!"
    
    // Пример ввода с консоли
    pin("Введите свое имя: ")
    let name: str = input() // Используется встроенная функция input
    pin("Привет, ", name, "!")
}

В этом примере демонстрируется базовый синтаксис для вывода текста на экран с помощью pin и получение ввода от пользователя через функцию input.

2. Управление типами данных:

func main() {
    let x: int = 5       // Явно указанный тип
    let y = 10.5         // Неявно указанный тип, определен как float
    let z = x + y        // Операция приведения типов, как в Python и C++

    pin("Результат: ", z)
}

Здесь показано, как X3Lang позволяет легко работать с различными типами данных и автоматически приводит их в нужный формат, позволяя использовать арифметические операции между числами разных типов.

3. Использование классов и ООП:

class Animal {
    let name: str

    func __init__(self, name: str) {
        self.name = name
    }

    func speak() {
        pin("Some generic sound")
    }
}

class Dog : Animal {
    func __init__(self, name: str) {
        super.__init__(name)
    }

    func speak() override {
        pin(self.name, " говорит: Woof!")
    }
}

func main() {
    let my_dog = Dog("Бобик")
    my_dog.speak()  // Вывод: "Бобик говорит: Woof!"
}

Этот пример демонстрирует объектно-ориентированное программирование в X3Lang. Классы, наследование, переопределение методов — всё это присутствует в языке, при этом синтаксис остаётся простым и понятным.

4. Работа с функциями и замыканиями:

func main() {
    let square = func(x: int) -> int {
        return x * x
    }

    let result = square(5)
    pin("Квадрат 5: ", result)
    
    // Использование лямбда-выражения
    let double = |x: int| -> int { x * 2 }
    pin("Удвоенное 5: ", double(5))
}

Здесь показано, как в X3Lang можно легко создавать функции и лямбда-выражения. Это позволяет работать с функциональными стилями программирования, обеспечивая при этом гибкость и читаемость кода.

5. Многопоточность:

import threading

func print_numbers() {
    for i in range(1, 6) {
        pin("Number: ", i)
    }
}

func main() {
    let thread1 = threading.Thread(target=print_numbers)
    let thread2 = threading.Thread(target=print_numbers)

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()

    pin("Потоки завершены")
}

X3Lang поддерживает многопоточность, что позволяет эффективно использовать возможности многозадачности и параллельных вычислений.

6. Генераторы и итераторы:

func count_to(limit: int) -> generator<int> {
    let i = 1
    while i <= limit {
        yield i
        i += 1
    }
}

func main() {
    for num in count_to(5) {
        pin("Число: ", num)
    }
}

Генераторы в X3Lang позволяют создавать последовательности данных без необходимости хранить их в памяти целиком, что идеально подходит для работы с большими объёмами данных.

7. Обработка исключений:

func main() {
    try {
        let x: int = 10 / 0
    } catch(e: ZeroDivisionError) {
        pin("Ошибка: Деление на ноль")
    } catch(e: Exception) {
        pin("Произошла ошибка: ", e)
    } finally {
        pin("Завершение программы")
    }
}

В X3Lang встроена система обработки исключений, позволяющая эффективно управлять ошибками и предотвращать сбои программы.

Инструкция по использованию:

1. Установка: Для начала работы с X3Lang вам необходимо скачать и установить компилятор с официального репозитория. Подробные инструкции можно найти в разделе документации.


2. Создание проекта: Для создания проекта X3Lang создайте новый файл с расширением .x3, в котором будет находиться ваш исходный код.


3. Запуск программы: Для компиляции и выполнения программы используйте команду:

x3 run my_program.x3


4. Подключение библиотек: X3Lang поддерживает стандартные библиотеки для работы с математическими функциями, многопоточностью, строками и другими часто используемыми задачами. Для подключения сторонних библиотек используется конструкция:

import "library_name"

Пример:

import math


5. Синтаксис и стиль: Старайтесь использовать короткий и читаемый код. X3Lang позволяет писать как компактный код, так и более развернутые, детализированные решения. При этом всегда помните о поддержании хорошей структуры программы.


6. Участие в разработке: X3Lang является открытым проектом, и любой желающий может внести вклад в его развитие. Для этого откройте GitHub-репозиторий и создайте Issue или Pull Request с вашими предложениями.



X3Lang — это мощный и гибкий инструмент, который позволит вам создавать эффективные программы, используя принципы, которые вы уже знаете из Python и C++. Он сочетает лучшие качества обоих языков, предлагая при этом новые возможности для вашего творчества и продуктивности.
