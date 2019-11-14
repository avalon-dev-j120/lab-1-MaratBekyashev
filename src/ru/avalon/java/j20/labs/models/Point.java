package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point <X extends Number, Y extends Number>{
    /**
     * Абсцисса точки.
     */
//    private final int x;
    private final Float x;
    /**
     * Ордината точки.
     */
//    private final int y;
    private final Float y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    /*public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }*/
    public Point(X x, Y y) {
        this.x = x.floatValue();
        this.y = y.floatValue();
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public Float getX() {
        return this.x.floatValue();
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public Float getY() {
        return this.y.floatValue();
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public double distanceTo(Point point) {
        float dx = x - point.x.floatValue();
        float dy = y - point.y.floatValue();
        return (double)Math.sqrt(dx * dx + dy * dy);
    }
}
