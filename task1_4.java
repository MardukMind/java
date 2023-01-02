public class task1_4 {
    static boolean profitableGamble(double prob, double prize, double pay)
    {
        // Функции ног у куриц 
        if (prob*prize > pay) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        // Значение prob
        double prob = 0.9;
        // Значение prize
        double prize = 1;
        // Значение pay
        double pay = 2;
        // Вызов функции расчет и вывод

        System.out.println("Итог: " + profitableGamble(prob, prize, pay));
    }
}
