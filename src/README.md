Отчет по лабораторной работе
Задача
Разработать три класса: Triangle, Rectangle и IntArrayProcessor для работы с треугольниками, прямоугольниками и одномерными массивами целых чисел соответственно.

Triangle (Треугольник)
Поля
int a, b, c; - длины сторон треугольника.
Методы
Triangle(int a, int b, int c) - конструктор для создания экземпляра класса с заданными длинами сторон.
void printSides() - вывод длин сторон треугольника на экран.
int calculatePerimeter() - расчет периметра треугольника.
double calculateArea() - расчет площади треугольника.
Rectangle (Прямоугольник)
Поля
int a, b; - длины сторон прямоугольника.
Методы
Rectangle(int a, int b) - конструктор для создания экземпляра класса с заданными длинами сторон.
void printSides() - вывод длин сторон прямоугольника на экран.
int calculatePerimeter() - расчет периметра прямоугольника.
int calculateArea() - расчет площади прямоугольника.
IntArrayProcessor (Обработчик одномерного массива)
Поля
int[] intArray; - массив целых чисел.
int n; - размерность массива.
Методы
IntArrayProcessor(int n) - конструктор для создания массива заданной размерности.
void inputArray() - ввод элементов массива с клавиатуры.
void printArray() - вывод элементов массива на экран.
void sortArray() - сортировка элементов массива в порядке возрастания.
Ход работы
Создан класс Triangle с определением полей, конструктора и методов для вывода сторон, расчета периметра и площади треугольника.

Создан класс Rectangle с определением полей, конструктора и методов для вывода сторон, расчета периметра и площади прямоугольника.

Создан класс IntArrayProcessor с определением полей, конструктора и методов для ввода, вывода и сортировки одномерного массива.

В методе main класса Main проведен пример использования созданных классов. Для треугольника и прямоугольника выведены стороны, периметр и площадь. Для массива введены значения, выведены на экран и отсортированы.

Зачем
Моделирование реального мира: Созданные классы позволяют абстрагироваться от деталей реализации и сосредоточиться на ключевых характеристиках объектов — треугольников, прямоугольников и массивов.

Применение ООП: Использование наследования и абстракции помогает сделать код более читаемым и поддерживаемым.

Работа с массивами: Создан класс для обработки одномерных массивов, предоставляющий удобные методы для ввода, вывода и сортировки элементов массива.

Результат выполнения
Программа успешно реализовывает функционал каждого из классов, демонстрируя их применение и взаимодействие в примере использования в методе main.