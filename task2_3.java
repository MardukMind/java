public class task2_3 {

    static boolean isAvgWhole(int array[]) 
    {
        // Нахожденрие среднего значения массива
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        int sr = sum % array.length;
        if (sr == 0) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) throws Exception {
        // Зааполнение массива
        int array[] = {1,5,6};
        // Вывод 
        System.out.println(isAvgWhole(array));
    }
}
