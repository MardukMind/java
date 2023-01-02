public class task1_3 {
    static int chikens(int a)
    {
        // Функции ног у куриц
        return a * 2;
    }
    static int cows(int b)
    {
        // Функции ног коров
        return b * 4;
    }
    static int pigs(int c)
    {
        // Функции ног у свиней
        return c * 4;
    }
    public static void main(String[] args) throws Exception {
        // Количество куриц
        int a = 1;
        // Количество коров
        int b = 2;
        // Количество свиней
        int c = 3;
        // Вызов функции расчет и вывод
        int itog = chikens(a) + cows(b) + pigs(c);
        System.out.println("Количество ног: " + itog);
    }
}
