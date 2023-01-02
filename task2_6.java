public class task2_6 {
    public static int nthFibonacciTerm(int n) {
        if(n == 0 || n == 1) {
            return 0;
        }
        // Первые 2 элеиента в таблице Фибоначчи равны 0 и 1
        int n0 = 0, n1 = 1;
        int tempNthTerm;
        // Начинаем считать число Фибоначчи с 3 позиции i так, как 1 и 2 элементы равны 0 и 1 соответсвенно.
        for (int i = 3; i <= n; i++) {
            // Записываем во временную переменную сумму предыдущих элементов
            tempNthTerm = n0 + n1;
            // Перезаписываем переменную 
            n0 = n1;
            // Перезаписываем переменную
            n1 = tempNthTerm;
        }
        return n1;
    }
    public static void main(String[] args) throws Exception {
        // Ввод числа
        int a = 3;
        System.out.println(nthFibonacciTerm(a));
    }
}
