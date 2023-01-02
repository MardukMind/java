public class task1_5 {
    static String operation(int N, int a, int b)
    {
        String a1 = "added";
        String a2 = "subtracted";
        String a3 = "multiplication";
        String a4 = "none";
        // Расчет профита 
        if (a + b == N) {
            return a1;
        }if (a - b == N) {
            return a2;
        }if (a * b == N) {
            return a3;
        }
        return a4;
    }
    public static void main(String[] args) throws Exception {
        // Значение N
        int N = 24;
        // Значение a
        int a = 12;
        // Значение b
        int b = 2;
        // Вызов функции расчет и вывод
        System.out.println("Итог: " + operation(N, a, b));
    }
}
