public class task1_8{
    
    static void nextedge(int s1, int s2)
{
 
    // Проверка значений
    if (s1 <= 0 || s2 <= 0)
    {
        System.out.print("Неправильное значение длины");
        return;
    }
    // Вычисление максимального значения третей стороны
    int max_length = s1 + s2 - 1;

    System.out.println("Максимальное значение третьего ребра треугольника = " + max_length);
}
    public static void main(String[] args) throws Exception {
        // Задаем значение первых двух сторон
        int s1 = 5, s2 = 7;
        nextedge(s1, s2);
    }
}
