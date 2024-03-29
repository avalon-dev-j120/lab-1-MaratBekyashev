package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.util.Iterator;
import ru.avalon.java.j20.labs.models.Fibonacci;
/**
 * Задание №3
 *
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {
        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Завершить описание класса Fibonacci так, чтобы класс
         *    возвращал заданное количество чисел последовательности
         *    Фибоначчи.
         *
         *    Количество чисел последовательности можно указывать
         *    при создании экземпляра класса.
         *
         *    Найти сумму 20 первых чисел последовательности Фибоначчи:
         *
         * 2. Создать экземпляр класса Fibonacci так, чтобы он
         *    возвращал последовательность чисел Фибоначчи длиной
         *    в 20 элементов.
         *
         * 3. Найти сумму полученных значений.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
        Fibonacci fNums = new Fibonacci(20);
        Iterator<Integer> iter = fNums.iterator();

        System.out.println("  Сгенерированный ряд чисел Фибоначчи:");
        while(iter.hasNext())
          System.out.print(", " + iter.next());
        System.out.println("\r\n");

        iter = fNums.iterator();
        // Убедимся , что возможен повторный проход по итератору
        Integer sum = 0;
        while(iter.hasNext())
          sum += iter.next();
        System.out.println("  Сумма чисел сгенерированного ряда Фибоначчи: " + sum);
    }
}
