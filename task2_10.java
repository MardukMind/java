public class task2_10 {

    public static int boxSeq(int a) {
        // Создаем переменные на первый и второй шаг
        int n1 = 3, n2 = 1;
        int tempNthTerm = 0;
        // Начинаем считать число Фибоначчи с 3 позиции i так, как 1 и 2 элементы равны 0 и 1 соответсвенно.
        for (int i = 1; i <= a; i++) {
            // Записываем во временную для проверки хода на четность
            int test = i;
            System.out.println(test % 2);
            // Если введен нулевой шаг, то полей на этом щаге будет тоже 0
            if ( a == 0) {
                tempNthTerm = 0;
            }
            // Если ход нечетный, то прибаляем 3
            if ( test % 2 != 0 ) {
                // Перезаписываем переменную 
                tempNthTerm = tempNthTerm + n1;
            }
            // Если ход четный, то отбавляем 1
            else {
            tempNthTerm = tempNthTerm - n2;
            }
        }
        return tempNthTerm;
    }
    public static void main(String[] args) throws Exception {
        // Ввод шага
        int a = 6;
        System.out.println(boxSeq(a));
    }
}
