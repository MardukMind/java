public class task1_2 {
    static double area(double h, double b)
    {
        // Функции расчета площади треугольника
        return (h * b) / 2;
    }
    public static void main(String[] args) throws Exception {
        // Высота треугольника
        double h = 10;
        // Основание треугольника
        double b = 10;
        // Вызов функции расчет и вывод
        System.out.println("Площадь треугольника: " + area(h, b));
    }
}
