package ru.avalon.java.j20.labs.models;

import java.util.Iterator;

/**
 * Модель получения последовательности чисел Фибоначчи.
 *
 * <p>Числа Фибонааччи (иногда пишут Фибона́чи[1]) — элементы
 * числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21,
 * 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
 * 6765, 10946, 17711, … (последовательность A000045 в OEIS),
 * в которой первые два числа равны либо 1 и 1, либо 0 и 1,
 * а каждое последующее число равно сумме двух предыдущих
 * чисел. Названы в честь средневекового математика Леонардо
 * Пизанского (известного как Фибоначчи).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа Фибоначчи</a>
 */
public class Fibonacci implements Iterable<Integer> {
  private int Length = 0;
  
  public Fibonacci(int length){
    if (length > 0)
      this.Length = length;
  }

  /**
  * Итератор, выполняющий обход последовательности
  * чисел Фибоначчи.
  */
  private static class FibonacciIterator implements Iterator<Integer> {
    private int currIndex = -1;
    private int length;
    private int num_2;
    private int num_1;

    private FibonacciIterator(int length){
      this.length = length;
    }
    /**
    * Определяет, есть ли следующее значение
    * последовательности чисел Фибоначчи.
    *
    * @return {@code true}, если следующее число
    * последовательности существует. В обратном случае
    * {@code false}.
    */
    @Override
    public boolean hasNext() {
      boolean result = this.currIndex < this.length-1;
      // при достижении конца последовательности сбрасываем указатель на начало, чтобы можно было пройти повторно
      if (this.currIndex == this.length-1)
        this.currIndex = -1;
      return result;
    }

    /**
    * Возвращает следующее число последовательности
    * чисел Фибоначчи.
    *
    * @return следующее число последовательности. Последнее:
    */
    @Override
    public Integer next() {
      int result;
      ++this.currIndex;

      if (this.currIndex == 0){
        this.num_2 = 0;
        this.num_1 = 1;
        result = 0;
      }
      else if (this.currIndex == 1) {
        this.num_2 = 0;
        this.num_1 = 1;
        result = 1;
      }
      else {
        result = this.num_2 + this.num_1;
        this.num_2 = this.num_1;
        this.num_1 = result;
      }
      return result;
    }
  }
  /**
  * Возвращает итератор, позволяющий выполнить обход
  * последовательности чисел Фибоначчи.
  *
  * @return итератор последовательности чисел Фибоначчи
  */
  @Override
  public Iterator<Integer> iterator() {
    return new FibonacciIterator(this.Length);
  }
}
